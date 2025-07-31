package assignment;
import java.util.*;
public class Program15{
public static void main(String[] args) {
    
    int[] arr = {3, 5, 3, 7, 8, 5, 3, 7, 7, 8};

    Map<Integer, Integer> frequencyMap = new HashMap<>();

    
    for (int num : arr) {
        frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
    }

    System.out.println("Element : Frequency");
    for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
        System.out.println(entry.getKey() + " : " + entry.getValue());
    }
}



