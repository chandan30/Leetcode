
/**
 * @author CHANDAN
 * Given a sentence that consists of some words separated by a single space, and a searchWord, check if searchWord is a prefix of any word
 *  in sentence.

Return the index of the word in sentence (1-indexed) where searchWord is a prefix of this word. If searchWord is a prefix of more
 than one word, return the index of the first word (minimum index). If there is no such word return -1.

A prefix of a string s is any leading contiguous substring of s.
 *
 */
public class LC1455 {
public static void main(String[] args) {
	String sentence="i love eating burger";
	String searchWord="burg";
	int r=isPrefixOfWord(sentence,searchWord);
	System.out.println(r);
}
public static int isPrefixOfWord(String sentence, String searchWord) {
    String str[]=sentence.split(" ");
    for(int i=0;i<str.length;i++){
        if(str[i].startsWith(searchWord))
        return i;
    }    
 return -1;
}
}
