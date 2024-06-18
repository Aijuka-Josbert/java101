import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SnakeGame extends JPanel implements ActionListener {
    //set the size of the game play
    private final int WIDTH = 500;
    private final int HEIGHT = 500;
    //the apple size
    private final int DOT_SIZE = 50;
    private final int MAX_DOTS = (WIDTH * HEIGHT) / (DOT_SIZE * DOT_SIZE);
    private final int DELAY = 150;

    private final int x[] = new int[MAX_DOTS];
    private final int y[] = new int[MAX_DOTS];

    //Snake intial length
    private int snakeSize = 1;
    private int appleX;
    private int appleY;

    private boolean isRunning = true;
    private boolean isRight = true;
    private boolean isLeft = false;
    private boolean isUp = false;
    private boolean isDown = false;

    private Timer timer;

    public SnakeGame() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(new MyKeyAdapter());

        initGame();
    }

    private void initGame() {
        for (int i = 0; i < snakeSize; i++) {
            x[i] = 50 - i * DOT_SIZE;
            y[i] = 50;
        }

        placeApple();

        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    private void draw(Graphics g) {
        if (isRunning) {
            g.setColor(Color.RED);
            g.fillOval(appleX, appleY, DOT_SIZE, DOT_SIZE);

            for (int i = 0; i < snakeSize; i++) {
                if (i == 0) {
                    g.setColor(Color.GREEN);
                } else {
                    g.setColor(Color.YELLOW);
                }
                g.fillRect(x[i], y[i], DOT_SIZE, DOT_SIZE);
            }

            Toolkit.getDefaultToolkit().sync();
        } else {
            gameOver(g);
        }
    }
    

    private void placeApple() {
        int r = (int) (Math.random() * (WIDTH / DOT_SIZE));
        appleX = r * DOT_SIZE;

        r = (int) (Math.random() * (HEIGHT / DOT_SIZE));
        appleY = r * DOT_SIZE;
    }

    private void move() {
        for (int i = snakeSize; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }

        if (isRight) {
            x[0] += DOT_SIZE;
        } else if (isLeft) {
            x[0] -= DOT_SIZE;
        } else if (isUp) {
            y[0] -= DOT_SIZE;
        } else if (isDown) {
            y[0] += DOT_SIZE;
        }
    }

    private void checkCollision() {
        for (int i = snakeSize; i > 0; i--) {
            if (i > 4 && x[0] == x[i] && y[0] == y[i]) {
                isRunning = false;
            }
        }

        if (x[0] >= WIDTH || x[0] < 0 || y[0] >= HEIGHT || y[0] < 0) {
            isRunning = false;
        }

        if (!isRunning) {
            timer.stop();
        }
    }

    //apple position
    private void checkApple() {
        if (x[0] == appleX && y[0] == appleY) {
            snakeSize++;
            placeApple();
        }
    }

    //the apple blinks
   
    

    //display the end message after the game z ended
    private void gameOver(Graphics g) {
        String message = "Game Over";
        Font font = new Font("Helvetica", Font.BOLD, 30);
        FontMetrics metrics = getFontMetrics(font);

        g.setColor(Color.WHITE);
        g.setFont(font);
        g.drawString(message, (WIDTH - metrics.stringWidth(message)) / 2, HEIGHT / 2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (isRunning) {
            move();
            checkCollision();
            checkApple();
        }

        repaint();
    }

    //snake movement controls
    private class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();

            if (key == KeyEvent.VK_LEFT && !isRight) {
                isLeft = true;
                isUp = false;
                isDown = false;
            } else if (key == KeyEvent.VK_RIGHT && !isLeft) {
                isRight = true;
                isUp = false;
                isDown = false;
            } else if (key == KeyEvent.VK_UP && !isDown) {
                isUp = true;
                isRight = false;
                isLeft = false;
                isDown = false;
            } else if (key == KeyEvent.VK_DOWN && !isUp) {
                isDown = true;
                isRight = false;
                isLeft = false;
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.add(new SnakeGame());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}