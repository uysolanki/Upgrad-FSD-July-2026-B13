package day46;

public class LongestPrefix {

	public static void main(String[] args) {
//		String arr[]={"flowers","flow","flight"};
//		String arr[]={"flowers","flowers rose","flow"};
//		String arr[]={"flowers","flowers rose","flowers tulips"};
		String arr[]={"flowers","apple","mango"};
		
		String longPrefix=findLongestePrefix(arr);
		
		if(longPrefix.length()==0)
			System.out.println("No Prefix Exists");
		else
			System.out.println(longPrefix);
	}

	private static String findLongestePrefix(String[] arr) {
		
		String prefix=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
					while(!arr[i].startsWith(prefix))
					{
						prefix=prefix.substring(0,prefix.length()-1);
						
						if(prefix.isEmpty())
							return "";
					}
		}
		return prefix;
	}
}
