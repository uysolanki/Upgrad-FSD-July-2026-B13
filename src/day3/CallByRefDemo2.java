package day3;

public class CallByRefDemo2 {

	public static void main(String[] args) 
	{
		int []arr= {10,20,30};
		System.out.println(arr[0]);   //10
		test(arr[0]);		// call by value		//actual parameter
		System.out.println(arr[0]);   //10
	}

	public static void test(int x)					//formal parameter
	{
		System.out.println(x);   //10
		x=99;
		System.out.println(x);   //99
	}
}


//write a program to (funcion by all 3 scenerios)
//1. accept temprature in celcius & convert to fahreniet (check the formula from internet) 
//input enter temp in celcius: 30
//output temp in fahreniet is : 90   S1,S2,S3

//2. accept the distance in km & convert to metres
//input : enter distance in km: 3
//output : distance in metres is : 3000  S1,S2,S3

//3. accept time in hours and convert to minutes
//input : enter time in hours: 3
//output : time in minutes is : 180  S1,S2,S3

//4. accept time in hours and convert to seconds
//input : enter time in hours: 3
//output : time in seconds is : 10,800 S1,S2,S3

//5. accept time hours & minutes and convert to seconds
//input : enter time in hours: 3
//        enter time in minutes : 20
//output : time in seconds is : 12,000  S1,S2,S3