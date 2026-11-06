import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate{

    public static void main(String[] args) {
        String str = "Programming Of Java";
        str = str.toLowerCase();
        Set<Character> set = new LinkedHashSet<>();

        for(char ch:str.toCharArray())
        {
            if (ch!=' ') {
                set.add(ch);
            }
            
        }

        System.out.println(set);
    }

}