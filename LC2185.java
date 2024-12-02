
/**
 * @author CHANDAN
 * You are given an array of strings words and a string pref.

Return the number of strings in words that contain pref as a prefix.

A prefix of a string s is any leading contiguous substring of s
 *
 */
public class LC2185 {
public static void main(String[] args) {
	String[] words= {"pay","attention","practice","attend"};
	String pref="at";
	int result=prefixCount(words,pref);
	System.out.println(result);
}
public static int prefixCount(String[] words, String pref) {
    int c=0;
    for(int i=0;i<words.length;i++){
        if(words[i].startsWith(pref))
        c++;
    }
    return c;
}
}
