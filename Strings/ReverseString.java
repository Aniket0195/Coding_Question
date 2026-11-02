public class ReverseString { 
	
	
	public static void reverse1(String str)
	{
		char [] arr = str.toCharArray();
		
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
		
	}
	
	
	public static void reverse2(String str)
	{
		String rev="";
		for(int i=0;i<=str.length()-1;i++)
		{
			rev = str.charAt(i)+rev;
			}
		System.out.println(rev);
		
	}
	
	public static void reverse3(String str)
	{
		int left = 0;
		int right =str.length()-1;
		char [] arr = str.toCharArray();
		
		while(left<right)
		{
			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
		
			left++;
			right--;
			
		}
		System.out.println(new String(arr));
				
	}
	
	
	public static void reverse4(String str)
	{
		StringBuilder sb = new StringBuilder(str);
		String rev = sb.reverse().toString();
		System.out.println(rev);
		
	}
	public static void reverse5(String str) {
		System.out.println("Two pointer appraoch");
		char[] s = str.toCharArray();
		int right=s.length-1;
		for(int left=0;left<right/2;left++)
		{
			char temp = s[left];
			s[left]= s[right];
			s[right] = temp;
			right--;
			
		}
		System.out.println(s);
		
	}
	
	public static void main(String[] args) {
		String str = "Hello";
		reverse1(str);
		reverse2(str);
		reverse3(str);
		reverse4(str);
		System.out.println("Leetcode");
		reverse5(str);
	}

}
