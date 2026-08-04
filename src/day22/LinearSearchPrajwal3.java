package day22;

public class LinearSearchPrajwal3 {
public static void main(String[] args) {
	 int arr[] = {8, 7, 3, 6, 5};
     int search = 16;

     String result=linearSearchPrajwal(arr,search);
     System.out.println(result);
}

private static String linearSearchPrajwal(int[] arr, int search) {
	for (int n : arr) {
        if (n == search) {
            return "Found: " + search;
        }
    }


    return "Not Found: " + search;
}
}
