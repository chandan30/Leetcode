
/**
 * @author CHANDAN
 * 
 * Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition.
 *
 */
public class LC905 {
public static void main(String[] args) {
	int[] nums= {3,1,2,4};
	int[] r=sortArrayByParity(nums);
	for(int i:r)
		System.out.print(i+" ");
}
public static int[] sortArrayByParity(int[] nums) {
    int i=0,j=nums.length-1;
    while(i<j){
        while(i<j && nums[i]%2==0)
        i++;
        while(i<j && nums[j]%2==1)
        j--;
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    return nums;
}
}
