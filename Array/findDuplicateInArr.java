package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Find duplicates in an array 
// Easy Accuracy: 20.69% Submissions: 100k+ Points: 2
// Given an array a[] of size N which contains elements from 0 to N-1, you need to find all the elements occurring more than once in the given array.

// Example 1:

// Input:
// N = 4
// a[] = {0,3,1,2}
// Output: -1
// Explanation: N=4 and all elements from 0
// to (N-1 = 3) are present in the given
// array. Therefore output is -1.
// Example 2:

// Input:
// N = 5
// a[] = {2,3,1,2,3}
// Output: 2 3 
// Explanation: 2 and 3 occur more than once
// in the given array.
// Your Task:
// Complete the function duplicates() which takes array a[] and n as input as parameters and returns a list of elements that occur more than once in the given array in sorted manner. If no such element is found, return list containing [-1]. 

// Expected Time Complexity: O(n).
// Expected Auxiliary Space: O(n).
// Note : The extra space is only for the array to be returned.
// Try and perform all operation withing the provided array. 

// Constraints:
// 1 <= N <= 105
// 0 <= A[i] <= N-1, for each valid i

// public class findDuplicateInArr{
//     /**
//      * @param args
//      */
//     public static void main(String args[]){

//         int arr[] = {0,3,1,2};

//         int n = 4;

//         Arrays.sort(arr);

//         ArrayList<Integer>list = new ArrayList<>();

//         int curr = -1;

//         for(int i =0;i<n-1;i++){
//             if(arr[i] != curr && arr[i] == arr[i+1]){
//                 list.add(arr[i]);
//                 curr = arr[i];
//             }
//         }

//         if(!list.isEmpty()){
//             System.out.print(list);
//         }else{
//             list.add(-1);
//             System.out.print(list);
//         }
//     }
// }


// using hashmap
public class findDuplicateInArr{
    /**
     * @param args
     */
    public static void main(String args[]){

        int arr[] = {2,3,1,2,3};

        int n = 5;

        ArrayList<Integer> nums=new ArrayList<>(n);
        
        if(n == 0 || n ==1){
            nums.add(-1);
            System.out.print(nums);
        }
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
           if(e.getValue()>1)nums.add(e.getKey());
        }
        
        if(nums.isEmpty()){
           nums.add(-1);
            System.out.print(nums);
        } 
        
        Collections.sort(nums);
        System.out.print(nums);
    }
}