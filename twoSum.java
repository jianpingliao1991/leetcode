import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static int[] twoSum(int[] nums, int target)
	{ 
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<nums.length; i++) {
			if(map.containsKey(target - nums[i])){
				result[1]=i;
				result[0]=map.get(target-nums[i]);
				return result;
			}
			map.put(nums[i], i);
		}
		return result;
	};
	public static void main(String[] args) {
		// TODO Auto-geneated method stub
		int[] nums = new int[] {2, 7, 11, 15};
		int target = 9;
		int[] result = new int[2];
		result = twoSum(nums,target);
		System.out.println("result:"+result[0]+result[1]);
	}

}