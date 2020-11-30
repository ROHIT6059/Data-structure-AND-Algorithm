package DSArraypack;
import java.util.Arrays;
import java.util.Scanner;

import java.util.stream.IntStream;

public class ArrayOP {

    public static void main(String []args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  size of array");
        n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elemnts:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

           //createArr( n, arr[n]);
        PrintArray(n,arr);
        System.out.println("enter the element u want to search:");
        int ele=sc.nextInt();
        searchArrayElement(ele,arr);
        System.out.println("enter the index location");
        int index=sc.nextInt();
       deleteArrayElement(index, arr);
    }
    public static void createArr(int n, int arr[]) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Enter the array element:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

    }

    public static void PrintArray(int n, int arr[]) {

        System.out.println(Arrays.toString(arr) + " ");
    }

   public static void searchArrayElement(int n, int arr[]) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  element:");
        int element = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println("Element found ");
            }
            else
                System.out.println("element not found");
        }

        }

   public static void deleteArrayElement( int index,int arr[])
    {
        int lastElement=arr.length;
       for(int i=index;i<lastElement;i++)
       {
          arr[i-1]=arr[i];
       }
        System.out.println(arr[lastElement]);

}
        }

// class ArrOpDemo
//{
    //public static void main(String[] args) {
       // ArrayOP ar=new ArrayOP();
//       Scanner sc=new Scanner(System.in);
//       System.out.println("Enter the size of array:");
//       int size=sc.nextInt();
//        int size=5;
//        int array[]=new int[size];
//       System.out.println("enter the array element:");
//
////       for(int i=0;i<size;i++)
////       {
////        array[i]=sc.nextInt();
////       }
//
//       ar.createArr(size,array);
//        ar.PrintArray(size,array);
//        ar.searchArrayElement(size,array);
//        ar.searchArrayElement(size,array);
//
//    }
//
//}