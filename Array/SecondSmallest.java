package Array;

public class SecondSmallest {
    public static void main(String[] args) {
        
        int [] arr = {1,2,3,1,2,3,55,65,54,53,21,1};

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if (smallest>arr[i]) {

                secondSmallest = smallest;
                smallest = arr[i];

            }else if(arr[i]>smallest && arr[i]<secondSmallest)
            {
                secondSmallest = arr[i];
            }

        }
        System.out.println("Second Smallest : "+ secondSmallest);
    }
    
}
