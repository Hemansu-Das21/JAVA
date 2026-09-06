import java.util.*;
class ContainsDuplicate{
    public static void main(String[] args){
        int[] nums={1,2,3,4};
        HashSet<Integer>map=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(map.contains(nums[i])){
                System.out.println("Yes");
            }
            map.add(nums[i]);   
        }
        System.out.println("No");
    }
}