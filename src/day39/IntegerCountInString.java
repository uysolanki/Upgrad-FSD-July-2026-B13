package day39;

public class IntegerCountInString {

	public static void main(String[] args) {
		String str="My name is Alice i am 10 years old I have 2 brothers and 1 sister";
		//expected output : 3
		
		String words[]=str.split(" ");
		int counter=0;
		for(String word:words)
		{
			try
			{
				Integer.parseInt(word);
				counter++;
			}
			catch(NumberFormatException ex) {}
		}

		System.out.println("Total number of integers are "+counter);
	}

}
