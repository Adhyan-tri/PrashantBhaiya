import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number you want to print table");      //Taking input from user
        int no=s.nextInt();
        // initialise (1); cond.(2); update(4)
        for (int i=1; i<=10; i++){
            System.out.println(no+"*"+i+"="+no*i);
            //(no=user define number + sign of * + i + sign of assignment + user define number * i)

            //(3)
        }
    }
}
