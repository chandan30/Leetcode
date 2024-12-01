
/**
 * @author CHANDAN
 *
 *You are given a positive integer num. You may swap any two digits of num that have the same parity (i.e. both odd digits or both even digits).

Return the largest possible value of num after any number of swaps.

 
 */
public class LC2231 {
public static void main(String[] args) {
	int nums= 1234;
	int result=largestInteger(nums);
	System.out.println(result);
}
public static int largestInteger(int num) {
    char[] nums=Integer.toString(num).toCharArray();
    for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[j]>nums[i] && (nums[j]-nums[i])%2==0){
                char t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
            }
        }
    }
    return Integer.parseInt(new String(nums));
}
}
