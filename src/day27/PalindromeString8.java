//removing special chars
package day27;

public class PalindromeString8 {
public static void main(String[] args) {
	                                
	                               
	//String str="nitin";				
	//String str="nitina";	
	//String str="A man, A Plan A Canal : Panama";
	String str=null;
	
	if(str==null)
		System.out.println("Invalid String");
	else
	{
	str=str.toLowerCase(); //amanaplanacanalpanama
	System.out.println(str);
    str=str.replaceAll("[^A-Za-z]","");
	System.out.println(str);
	System.out.println(checkPalindrome(str)?"Palindrome":"Not Palindrome");
	}
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
