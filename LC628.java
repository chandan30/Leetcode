/*Given an integer array nums, find three numbers whose product is maximum and return the maximum product.
 * */
import java.util.Arrays;

public class LC628 {
public static void main(String[] args) {
	int[] nums= {1,3,2,4};
	Arrays.sort(nums);
	int n=nums.length;
	int p=Math.max(nums[n-3]*nums[n-2]*nums[n-1],nums[0]*nums[1]*nums[n-1]);
	System.out.println(p);
}
}
