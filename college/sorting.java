package college;

import java.util.*;
public class sorting {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
       System.out.println("enter 10 numbers:");
       for (int i=0; i<10;i++) {
           System.out.print("enter element " + (i+1) + ": ");
           arr[i] = sc.nextInt();
       }
       Arrays.sort(arr);
       System.out.println("Sorted array:");
       for (int num : arr) {
           System.out.print(num);
       }
   }
 }
