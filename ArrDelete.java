package DSArraypack;

import java.util.Arrays;
import java.util.Scanner;

public class ArrDelete {

    public static int[] removeElement(int[] array, int index)
    {
        if(array==null || index<0 || index>=array.length)
        {
            return array;
        }
        int[] arr=new int[array.length-1];
        for(int i=0,k=0;i<array.length;i++)
        {
            if(i==index)
            {
                continue;
            }
            arr[k++]=array[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of array elements:");
        int n=sc.nextInt();

        int array[]=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<array.length;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("Original array is:"+ Arrays.toString(array));
        System.out.println("enter the index which u want to remove");
        int index=sc.nextInt();

        System.out.println("Index removed is:"+index);
        array=removeElement(array,index);
        System.out.println("resultant array is:"+Arrays.toString(array));

    }
}
