public class Ifnestedl {
    public static void main(String []args){
        int num1 = -3, num2 =0, num3 = 4, negativeCount=3;
        if (num1 < 0)
	if (num2 < 0)
		if (num3 < 0)
			negativeCount = 3; 
		else
			negativeCount = 2; 
	else
		if (num3 < 0)
			negativeCount = 2; 
		else
			negativeCount = 1; 
else
	if (num2 < 0)
		if (num3 < 0)
			negativeCount = 2; 
		else
			negativeCount = 1; 
	else
		if (num3 < 0)
			negativeCount = 1; 
		else
			negativeCount = 0; 
            negativeCount = 0;

if (num1 < 0) 
		negativeCount++;
if (num2 < 0)
		negativeCount++;
if (num3 < 0)
		negativeCount++;


    }
    
}
