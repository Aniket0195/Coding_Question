package numbers;

import java.util.Map;
import java.util.TreeMap;

public class CountDuplicateNumber {
    public static void main(String[] args) {
        
        int arr[] = {1,2,2,2,21,1,1,1,2,4,5,4,3,3,67,77,8,9,0};

        Map<Integer,Integer> map = new TreeMap<>();
        for(int num : arr)
        {
            map.put(num,map.getOrDefault(num, 0)+1);
        }
     
        System.out.println(map);
    }
}
