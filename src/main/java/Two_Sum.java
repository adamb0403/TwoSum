import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum {
    public static void main(String[] args) {
        int[] array = {3,3};
        int number = 6;

        System.out.println(Arrays.toString(twoSum(array, number)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int n=0; n < nums.length; n++) {
            hashMap.put(n, nums[n]);
            arr.add(nums[n]);
        }

        for (int i = 0; i < nums.length; i++) {
            int x = hashMap.get(i);
            int y = target - hashMap.get(i);

            if (hashMap.containsValue(y) && (arr.indexOf(x) != arr.lastIndexOf(y))) {
                output[0] = arr.indexOf(x);
                output[1] = arr.lastIndexOf(y);
                break;
            }
        }

        return output;
    }
}