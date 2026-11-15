package Array;

public class LargestElement {
    public static void main(String[] args) {
        
        int [] arr ={20,10,24,20,5,24};
        int large = arr[0];
        for(int i =1; i<arr.length;i++)
        {
            if(arr[i]>large)
            {
                large = arr[i];
            }
        }
        System.out.println("Largest : "+large);
    }
    
}
