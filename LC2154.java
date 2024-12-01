
/**
 * @author CHANDAN
 * You are given an array of integers nums. You are also given an integer original which is the first number that needs to be searched
 *  for in nums.

You then do the following steps:

If original is found in nums, multiply it by two (i.e., set original = 2 * original).
Otherwise, stop the process.
Repeat this process with the new number as long as you keep finding the number.
Return the final value of original
 *
 */
public class LC2154 {
public static void main(String[] args) {
	int[] arr= {5,3,6,1,12};
	int original=3;
	int result=findFinalValue(arr,original);
	System.out.println(result);
}
public static int findFinalValue(int[] nums, int original) {
    for(int i=0;i<nums.length;i++){
            if(nums[i]==original){
                original=2*original;
                i=-1;
            }
    }
    return original;
}
}
