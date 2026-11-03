import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter String first");
        String str1 = sc.nextLine().toLowerCase();

        System.out.println("Enter Second String ");
        String str2 = sc.nextLine().toLowerCase();

        char [] a = str1.toCharArray();
        char []b = str2.toCharArray();

        if(a.length==b.length){

            Arrays.sort(a);
            Arrays.sort(b);

            if(Arrays.equals(a, b))
            {
                System.out.println("It is Anagram");
            }else{
                System.out.println("It is not anagram");
            }
            
        }
        else{
            System.out.println("It is not anagram");
        }


    }
    
}
