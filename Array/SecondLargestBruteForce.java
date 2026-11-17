package Array;

import java.util.Arrays;

public class SecondLargestBruteForce {
    public static void main(String[] args) {
        
        int arr[] = {1,2,4,7,7,5};

        Arrays.sort(arr);
        int largest = arr[arr.length-1];
        int secondLeargest = -1;
        System.out.println(largest);
        for(int i = arr.length-2;i>=0;i--)
        {
            if(arr[i]<largest&& arr[i]!=largest)
            {
                 secondLeargest = arr[i];
                 break;
            }
        }
        System.out.println(secondLeargest);
    }
    
}
