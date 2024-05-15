import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LibraryBook {
    public String title;
    public String author;
    private String overdueCharge;
    private String dateOfBorrowing;
    protected String dateOfReturn;
    protected String maximumCharge;


//The line you provided is the constructor of the LibraryBook class. Constructors in Java are special methods used to initialize the object's state when it is created. They have the same name as the class and are called when an object of that class is instantiated using the new keyword.
public LibraryBook(String title, String author, String overdueCharge, String dateOfBorrowing,
                   String dateOfReturn, String maximumCharge) {
    this.title = title;//this.title = title;: Sets the value of the title property of the LibraryBook object to the value passed as the title argument.
    this.author = author;
    this.overdueCharge = overdueCharge;
    this.dateOfBorrowing = dateOfBorrowing;
    this.dateOfReturn = dateOfReturn;
    this.maximumCharge = maximumCharge;
}

public String getTitle() {
    return title;
}

public String getAuthor() {
    return author;
}

public String getOverdueCharge() {
    return overdueCharge;
}
public String getDateOfBorrowing() {
    return dateOfBorrowing;
}

public String getDateOfReturn() {
    return dateOfReturn;
}
public String getMaximumCharge() {
    return maximumCharge;
}



//the toString() method is a built-in method defined in the Object class, which is the root class for all other classes. 
//This method is called when you want to obtain a string representation of an object.
public String toString() {
    return "Title:  " + title + ", Author: " + author + ", Overdue Charge: $" + overdueCharge + ", Date of Borrowing: " +
            dateOfBorrowing + ", Date of Return: " + dateOfReturn + ", Maximum Charge: $" + maximumCharge;
}

public static void main(String[] args) {
    List<LibraryBook> books = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.println("Enter book information (title, author, overdue charge, date of borrowing, date of return, maximum charge):");
        System.out.print("Title: ");
        String title = scanner.nextLine();
        if (title.isEmpty()) {
            break;
        }

        System.out.print("Author: ");
        String author = scanner.nextLine();

        System.out.print("Overdue Charge (press Enter to use default): ");
        String overdueCharge = scanner.nextLine();
        if (overdueCharge.isEmpty()) {
            overdueCharge = "5"; // Default value
        }

        System.out.print("Date of Borrowing: ");
        String dateOfBorrowing = scanner.nextLine();

        System.out.print("Date of Return: ");
        String dateOfReturn = scanner.nextLine();

        System.out.print("Maximum Charge (press Enter to use default): ");
        String maximumCharge = scanner.nextLine();
        if (maximumCharge.isEmpty()) {
            maximumCharge = "10.00"; // Default value
        }

        LibraryBook book = new LibraryBook(title, author, overdueCharge, dateOfBorrowing, dateOfReturn, maximumCharge);
        books.add(book);

        System.out.println("Book information added.");
        System.out.println();
    }
    
    System.out.println(".............................");

    System.out.println("Library Book Information:");
    for (LibraryBook book : books) {
        System.out.println(book.toString());
    }

    scanner.close();
}

}