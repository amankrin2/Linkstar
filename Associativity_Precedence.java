package Code_with_Harry.Basics;

public class Associativity_Precedence {
    public static void main(String[] args) {
        int a = 6*5-34/2;
        /* Precedence
        =30-34/2
        =30-17
        =12
         */
        int b = 60/5-34*2;
        /* Associativity
         =12-68
         =-56

         */

        System.out.println(a);
        System.out.println(b);
        //Precedence & Associativity



    }
}
