import java.util.Scanner;

public class New_If {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Get a number from the user");
        int number=s.nextInt();

        if (number>=1){
            System.out.println("Number is positive");
        }
        else if (number<0){
            System.out.println("Number is negative");
        }
    }
}

       /* System.out.println("Enter three numbers");
        int a = s.nextInt();    //a=My Elder_Brother_Age
        int b = s.nextInt();   //b=My_Age
        int c = s.nextInt();  //c=My_Father_Age

        if (a > b) {
            if (a > c) {
                System.out.println("1st number is greater");
            } else {
                System.out.println("3rd is greater");
            }
            if (b > c) {
                System.out.println("2nd number is greater");
            } else {
                System.out.println("3rd number is greater");

            }
        }
    }
}
*/





        /*
        int age =s.nextInt();

        if (age>60){
            System.out.println("You are retired person");
        }

        else if (age>56){
            System.out.println("You are Experienced");
        }
        else if (age>46){
            System.out.println("You are Semi-Experienced");
        }
        else if (age>26){
            System.out.println("You are Semi-Semi Experienced");
        }
        else{
            System.out.println("You are Fresher");
        }

    }
}
*/






