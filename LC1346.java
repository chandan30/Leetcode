
/**
 * @author CHANDAN
 * 
 * Given an array arr of integers, check if there exist two indices i and j such that :

i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]
 *
 */
public class LC1346 {
public static void main(String[] args) {
	int[] arr= {10,2,5,3};
	boolean result=checkIfExist(arr);
	System.out.println(result);
}
public static boolean checkIfExist(int[] arr) {
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            if(i!=j && arr[i]==2*arr[j])
            return true;
        }
    }
    return false;
}
}
