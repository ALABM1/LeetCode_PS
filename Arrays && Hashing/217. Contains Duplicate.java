import java.util.Set;
import java.util.HashSet;
class Solution {
    // this is solution works but there is Limit Limit exceede :

    // public boolean containsDuplicate(int[] nums) {
    //     List<Integer> numList =new ArrayList<>();
    //     for(int i=0; i<nums.length; i++){
    //         numList.add(nums[i]);
    //     }
    //     boolean res = false;
    //     while(numList.size()>1 ){
    //         int T= numList.get(0);
    //         numList.remove(0);      
    //         for(int i=0;i<numList.size(); i++ ){
    //             if(numList.get(i)==T) return true;
    //         }
    //     }
    //     return res ;
    // }


    public boolean containsDuplicate(int[] nums){
        Set<Integer> set = new HashSet<>() ;
        for(int num: nums){
            if(set.contains(num)) return true;
            set.add(num);
        }
        return false;
        
    }
    
}

