import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);          //Taking input from user
        System.out.println("Enter first no");
        int no1=s.nextInt();
        System.out.println("Enter second no");
        int no2=s.nextInt();
        System.out.println("select symbol(+,-,*,/)");
        String sym=s.next();
        int res;                                    // For Printing Result

        switch (sym)                               // here we use switch case
        {
            case "+": res = no1+no2;               // First case
            System.out.println("Addition is"+res);
            break;
            case "-":res =no1-no2;                 // Second case
            System.out.println("Substraction is"+res);
            break;
            case "*":res=no1*no2;                  // Third case
            System.out.println("Multiplication is"+res);
            break;
            case "/":res=no1/no2;                  // Fourth & last case
            System.out.println("Division is"+res);
            break;

        }
    }
}
