
/**
 * @author CHANDAN
 * You are given an integer array nums where the largest integer is unique.

Determine whether the largest element in the array is at least twice as much as every other number in the array. 
If it is, return the index of the largest element, or return -1 otherwise.
 *
 */
public class LC747 {
public static void main(String[] args) {
	int nums[]= {3,6,1,0};
	int result=dominantIndex(nums);
	System.out.println(result);
}
public static int dominantIndex(int[] nums) {
    int max=0,index=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]>max){
        max=nums[i];
        index=i;
        }
    }
    for(int i=0;i<nums.length;i++){
    	if(max>=2*nums[i] || i==index)
    		continue;
    	else {
            max=2*nums[i];
            index=-1;
        }
    }
    return index;
}
}
