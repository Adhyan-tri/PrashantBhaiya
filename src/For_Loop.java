public class For_Loop {
    public static void main(String[] args) {
    /*    for (int i = 0; i < 5; i++) {
            System.out.println(i);             // Increament
        }*/


       /*
        for (int i=7; i>0; i--){
            System.out.println(i);            //Decreament
        }
        */



      /*
        for (int i=0; i<10; i++){
            System.out.println(2*i+1);         // Odd Numbers
        }
      */

        /*
        for (int i =0; i<10; i++){
            System.out.println(2*i);           //Even Numbers
        }

         */


        int no=7;
        int temp=0;
        for (int i=2; i<no-1; i++){
            if (no%i==0){
                System.out.println("no is prime");
            }
            else
            {
                System.out.println("no is not prime");
            }
        }
    }
}
