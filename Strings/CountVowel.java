public class CountVowel {
    public static void main(String[] args) {
		String s1 = "Welcome to India";
		s1 = s1.toLowerCase();
		int vowel = 0;
		for(int i=0;i<s1.length();i++)
		{
			char ch = s1.charAt(i);
//			if(ch == 'a'||ch =='e'||ch =='i'||ch =='o'||ch =='u')
//			{
//				vowel++;
//			}
			if("aeiou".indexOf(ch)!= -1)
			{
				vowel++;
			}
		}
		System.out.println("Count of vowel in the string is : "+vowel);
	}
    
}
