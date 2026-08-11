package day27;

public class PalindromeString4 {
public static void main(String[] args) {
	                                //first                                                 last
	                                // 0            1             2            3             4
	//String str="nitin";				//['n'         'i'           't'           'i'           'n' ]
	String str="nitina";	
	
	if(checkPalindrome(str))
		System.out.println("Palindrome");
	else
		System.out.println("Not Palindrome");
	
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
