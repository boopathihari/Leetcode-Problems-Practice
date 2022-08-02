import java.util.*;

public class RemoveDuplicatesfromSortedArray {
   
    public static int removeDuplicates(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        
        for(int i=0; i<nums.length; i++){
            numSet.add(nums[i]);
        }

        // Sorting HashSet using List
        List<Integer> numlist = new ArrayList<Integer>(numSet);
        Collections.sort(numlist);
        
        for(int i=0; i< numlist.size(); i++){

            if(i < numlist.size()){
                nums[i] = numlist.get(i);
            }else{
                nums[i] = 0;
            }
        }
        
        System.out.println("Sorted non duplicate numbers=>"+numlist);

        return numlist.size();
    }

    public static void main(String[] args) {
        int[] nums = {-3,-1,0,0,0,3,3};

        int size = removeDuplicates(nums);
        System.out.println(size);
    }
}

