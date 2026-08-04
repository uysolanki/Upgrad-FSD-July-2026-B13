package day22;

public class LinearSearchPrajwal4 {
public static void main(String[] args) {
	 int arr[] = {8, 7, 3, 6, 5};
     int search = 16;

     if(linearSearchPrajwal(arr,search))
     System.out.println("Found : "+search);
     else
     System.out.println("Not Found : "+search);	 
}

private static boolean linearSearchPrajwal(int[] arr, int search) {
	for (int n : arr) {
        if (n == search) {
            return true;
        }
    }
    return false;
}
}
