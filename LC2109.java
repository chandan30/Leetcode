
/**
 * @author CHANDAN
 * You are given a 0-indexed string s and a 0-indexed integer array spaces that describes the indices in the original string where spaces
 *  will be added. Each space should be inserted before the character at the given index.

For example, given s = "EnjoyYourCoffee" and spaces = [5, 9], we place spaces before 'Y' and 'C', which are at indices 5 and 9 respectively.
 Thus, we obtain "Enjoy Your Coffee".
Return the modified string after the spaces have been added.
 *
 */
public class LC2109 {
	public static void main(String[] args) {
		String s="LeetcodeHelpsMeLearn";
		int[] spaces= {8,13,15};
		String result=addSpaces(s,spaces);
		System.out.println(result);
	}
	public static String addSpaces(String s, int[] spaces) {
        StringBuilder str=new StringBuilder();
        int k=0;
        for(int i=0;i<s.length();i++){
            if(i==spaces[k]){
                str.append(" ");
                str.append(s.charAt(i));
                 k=Math.min(++k, spaces.length-1);
            }
            else
            str.append(s.charAt(i));
        }
        return str.toString();
    }

}
