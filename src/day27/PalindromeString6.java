//removing space chars
package day27;

public class PalindromeString6 {
public static void main(String[] args) {
	                                
	                               
	//String str="nitin";				
	//String str="nitina";	
	String str="a nut for a jar of tuna";
	System.out.println(str);
	str=str.replaceAll("\\s","");
	System.out.println(str);
	System.out.println(checkPalindrome(str)?"Palindrome":"Not Palindrome");
	
}

private static boolean checkPalindrome(String str) {
	int first=0;
	int last=str.length()-1;
	while(first<last)
	{
		if(str.charAt(first)!=str.charAt(last))
		{
			return false;
		}
		first++;
		last--;
	}
	return true;
}
}
