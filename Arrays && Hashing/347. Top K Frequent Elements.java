// Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

// Example 1:

// Input: nums = [1,1,1,2,2,3], k = 2
// Output: [1,2]
// Example 2:

// Input: nums = [1], k = 1
// Output: [1]

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        //Create a HashMap to count occurrences
        //In a Java HashMap, the structure is {key: value}

        Map<Integer,Integer> map = new HashMap<>();
        for(int i: nums){
            int currentCount= map.getOrDefault(i, 0);
            int newCount = currentCount+1;
            map.put(i,newCount);
        }

        PriorityQueue <Map.Entry<Integer,Integer>> pq =
            new PriorityQueue<>( (a,b) -> b.getValue()- a.getValue());
        //The comparator (a, b) -> a.getValue() - b.getValue() ensures that the PriorityQueue maintains a min-heap based on the counts (occurrences) of the numbers.
        //The entry with the smallest count will always be at the root of the heap.
        
        // Iterate over each entry in the map
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            pq.add(entry); // Add the current entry to pq
        }
        // Extract the top K numbers from the priority queue
        int[] result = new int [k];
        // int index =0;
        // while(!pq.isEmpty()){
        //     result[index++] = pq.poll().getKey();
        // }
        for(int i=0;i<k;i++){
            result[i]= pq.poll().getKey();
        }
        return result;
    }
}