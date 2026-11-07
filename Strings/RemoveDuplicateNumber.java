import java.util.LinkedHashSet;
import java.util.Set;

 public class RemoveDuplicateNumber {
	
	public static int[] removeDuplicate(int[] nums)
	{
		Set<Integer> set = new LinkedHashSet<>();
		for(int num : nums)
		{
			set.add(num);
		}
		int[] result = new int[set.size()];
		int i=0;
		
		for(int num : set)
		{
			result[i++] =  num;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,1,2,5,4,3,4};
		int[] arr2 =removeDuplicate(arr);
		for(int num : arr2)
		{
			System.out.print(num+" "+",");
		}	
	}
 }
    

