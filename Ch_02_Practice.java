package Code_with_Harry.Basics;
import java.util.*;

public class Ch_02_Practice {
    public static void main(String[] args) {
       // float a = 7/4 * 9/2;
       // System.out.println(a);
        // WAP to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);
        //Decrypting the grade
        grade = (char)(grade-8);
        System.out.println(grade);


    }
}
