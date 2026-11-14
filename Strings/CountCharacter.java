import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharacter {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.next().toLowerCase();
        countCharcter(str);
        
    }
    public static void countCharcter(String str)
        {
            Map<Character,Integer> counts = new HashMap<>();
            for(char letter : str.toCharArray())
            {
                if(counts.containsKey(letter))
                {
                    counts.put(letter,counts.get(letter)+1);
                }
                else{
                    counts.put(letter,1);
                }
            }
            System.out.println(counts);
        }
    
}
