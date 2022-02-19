public class ReverseStr {
    public static void main(String[] args) {
//        String name="Adhyan";           // Here A=0;d=1;h=2;y=3;a=4;n=5;
//        int leng=name.length();        // For measureing String name length & the length is 6 character.
//        String rev=" ";               // for Reverse String name.
//
//        for (int i=leng-1; i>=0; i--)  // We use  leng-1 beacuse Sring name letter has 6 words but index start from 0.
//        {
//            rev =rev + name.charAt(i);  // We use chareAt beacuse String is a collection of character.
//
//        }
//        System.out.println(rev);


        String str="abcd";
        int leng= str.length();
        String rev=" ";
        for (int i =leng-1; i>=0; i--)
        {
          rev=rev+str.charAt(i);
        }
        System.out.println( rev );
    }

}
