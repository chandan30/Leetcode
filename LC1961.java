
/**
 * @author CHANDAN
 * Given a string s and an array of strings words, determine whether s is a prefix string of words.

A string s is a prefix string of words if s can be made by concatenating the first k strings in words for some positive k no 
larger than words.length.

Return true if s is a prefix string of words, or false otherwise.
 *
 */
public class LC1961 {
public static void main(String[] args) {
	String words[]= {"i","love","leetcode","apples"};
	String s="iloveleetcode";
	boolean bool=isPrefixString(s,words);
	System.out.println(bool);
}
public static boolean isPrefixString(String s, String[] words) {
	int c=0;
	String str="";
    for(int i=0;i<words.length;i++) {
    	str+=words[i];
    	if(s.startsWith(str)) {
    		c++;
    		if(s.equals(str))
    			break;
    	}	
    }
    if(s.equals(str))
    return true;
    else return false;
}
}
