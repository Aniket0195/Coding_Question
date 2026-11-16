package Array;

public class SecondLargestElement {

    public static void main(String[] args) {
        
        int[] arr = new int[5];
        arr = new int[]{20, 8, 33, 20, 67};

        int largestNum=arr[0];
        int secondLargestNumber=-1;

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>largestNum)
            {
                secondLargestNumber = largestNum;
                largestNum = arr[i];
            }else if(arr[i]<largestNum && arr[i]>secondLargestNumber)
            {
                    secondLargestNumber = arr[i];
            }
        }
        System.out.println("Second Largest Number is : "+secondLargestNumber);


    }
    
}
