public class Question4 {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++) //S(1)[firstly i=1,,S(6)[now i=2]
        {
            for (int j=5;j>=i;j--){ //S(2)[firstly j=5],S(4)j=4,j=3,j=2,j=1][j=5,4,3,2]

                System.out.print("* ");//S(3) print '*****'

            }
            System.out.println();// [S(5)execute here for next line]

        }
    }
}
