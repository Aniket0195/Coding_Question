package Array;

public class SmallestElement{

    public static void main(String[] args) {
        
        int [] arr = {1,2,4,5,4,4,3,87,87,344,54};
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<smallest)
            {
                smallest =arr[i];
            }
        }
        System.out.println("Smallest : "+smallest);

    }   

}