package day22;

public class LinearSearchPrajwal {
public static void main(String[] args) {
	 int arr[] = {8, 7, 3, 6, 5};
     int search = 16;

     for (int n : arr) {
         if (n == search) {
             System.out.println("Found: " + search);
             return;
         }
     }


     System.out.println("Not Found: " + search);
}
}
