import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class NewTwoSum {
    public static void main(String[] args) {
        int[] array = {3,3,7,4,8,6,9,34,89,34,23,2};
        int number = 15;

        System.out.println(Arrays.toString(twoSum(array, number)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> n = new HashMap<>();

        int[] res = new int[2];

        for(int i=0;i<nums.length;i++){
            if(n.containsKey(target-nums[i])){
                res[0] = n.get(target-nums[i]);
                res[1] = i;
                return res;
            }
            n.put(nums[i],i);
        }
        return res;
    }
}
