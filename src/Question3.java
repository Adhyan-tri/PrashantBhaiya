public class Question3 {
//    public static void main(String[] args) {
//
//       //here "i" isuse for Row & "j" is use for Column
//        for (int i=1; i<=5;i++)   // S(1)[firstly i=1-T],S(6)[now i=2]
//        {
//          for (int j=1; j<=i;j++) // S(2)[firstly j=1-T],S(4)inc-update j=2F.,S(7)[j=1,j=2 S(10)j=3F].,
//          {
//              System.out.print("* "); //S(3) print '*' S(7) print'*'S(8) print'*',S(9)'*'
//
//          }
//            System.out.println();// [S(5)execute here for next line] [S(11) execute here]
//
//        }
//    }
public static void main(String[] args) {
    for (int i=1; i<=5;i++)
    {
        for (int j=4; j>=i; j--)
        {
            System.out.print(" ");
        }
        for (int k=1; k<=i; k++)
        {
            System.out.print(" *");
        }
        System.out.println();
    }

}
}
