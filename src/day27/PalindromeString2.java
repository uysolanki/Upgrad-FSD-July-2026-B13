package day27;

public class PalindromeString2 {
public static void main(String[] args) {
	                                //first                                                 last
	                                // 0            1             2            3             4
	String str="nitin";				//['n'         'i'           't'           'i'           'n' ]
	//String str="nitina";	
	int flag=checkPalindrome(str);
	
	if(flag==0)
		System.out.println("Palindrome");
	else
		System.out.println("Not Palindrome");
	
}

private static int checkPalindrome(String str) {
	int first=0;
	int last=str.length()-1;
	int flag=0;
	while(first<last)
	{
		if(str.charAt(first)!=str.charAt(last))
		{
			flag=1;
			break;
		}
		first++;
		last--;
	}
	return flag;
}
}
