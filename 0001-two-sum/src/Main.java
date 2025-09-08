import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] lista = {2,7,11,15};
        twoSum(lista, 9);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complemento = target - nums[i];
            if (map.containsKey(complemento)) {
                return new int[]{map.get(complemento), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};

    }
}