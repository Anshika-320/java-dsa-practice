package arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){ //have i seen this number before
                return true;
            }
            set.add(num); //haven't seen this number before
        }
        return false; //no duplicates

    }

}
