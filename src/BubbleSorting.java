public class BubbleSorting {
    public static void main(String[] args) {
//        int []a={36,19,29,12,5};
//        int temp;
//        for (int i=0; i<a.length;i++)
//        {
//            for (int j=0; j<a.length-1;j++)
//            {
//                if (a[j]>a[j+1])
//                {
//                    temp=a[j];
//                    a[j]=a[j+1];
//                    a[j+1]=temp;
//                }
//            }
//        }
//        for (int i=0; i<a.length;i++)
//        {
//            System.out.print(a[i]+" ");
//        }
//








//        int []a={36,19,29,12,5};
//        int temp;
//        for (int i=0; i<a.length;i++)
//        {
//            int flag=0;
//            for (int j=0; j<a.length-1-i;j++)
//            {
//                if (a[j]>a[j+1])
//                {
//                    temp=a[j];
//                    a[j]=a[j+1];
//                    a[j+1]=temp;
//                    flag=1;
//                }
//            }
//            if (flag==0)
//            {
//                break;
//            }
//        }
//        for (int i=0; i<a.length;i++)
//        {
//            System.out.print(a[i]+" ");
//        }








//        int []a={70,11,65,63,27,17,12,18,32,34,36};
//        int temp;
//        for (int i=0; i<a.length;i++)
//        {
//            int flag=0;
//            for (int j=0; j<a.length-1-i;j++)
//            {
//                if (a[j]>a[j+1])
//                {
//                    temp=a[j];
//                    a[j]=a[j+1];
//                    a[j+1]=temp;
//                    flag=1;
//                }
//            }
//            if (flag==0)
//            {
//                break;
//            }
//        }
//        for (int i=0; i<a.length;i++)
//        {
//            System.out.print(a[i]+" ");
//        }






        // "Selction Sorting"


//        int []a={38,52,9,18,6,62,13};
//        int min;
//        int temp=0;
//        for (int i=0; i<a.length; i++)
//        {
//            min=i;
//            for (int j=i+1; j<a.length; j++)
//            {
//                if (a[j]<a[min])
//                {
//                    min=j;
//                }
//            }
//            temp=a[i];
//            a[i]=a[min];
//            a[min]=temp;
//        }
//        for (int i=0; i< a.length; i++)
//        {
//            System.out.println(a[i]+ " ");
//        }






//        String []a={"shubham","nisha","vijay","shikhar"};
//        int min;
//        String temp="";
//        for (int i=0; i<a.length; i++)
//        {
//            min=i;
//            for (int j=i+1; j<a.length; j++)
//            {
//                if (a[j].compareTo(a[min])<0)
//                {
//                    min=j;
//                }
//            }
//            temp=a[i];
//            a[i]=a[min];
//            a[min]=temp;
//        }
//        for (int i=0; i< a.length; i++)
//        {
//            System.out.println(a[i]+ " ");
//        }



        // "Insertion Sort"


        int []a={5,1,6,2,4,3};
        int temp,j;
        for (int i=1; i<a.length; i++) {
            temp = a[i];
            j = i;

            while (j>0 && a[j-1] > temp) {
                a[j] = a[j-1];
                j = j-1;
            }
            a[j]=temp;
        }
         for (int i=0; i<a.length; i++)
         {
             System.out.print(a[i]+" ");
         }

    }
}
