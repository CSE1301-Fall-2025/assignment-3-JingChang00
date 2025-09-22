import java.util.*;

public class BubbleSort {
public static void main(String[] args){
Scanner n1 = new Scanner(System.in);
System.out.println("How many values do u want to put in an array? ");
int len = n1.nextInt();
int[] arr = new int [len]; 
for(int i = 0; i < len; i ++)
{
    System.out.println("Enter the value: ");
    int value = n1.nextInt();
    arr[i] = value;
} 

System.out.println("Given values: ");
for(int i = 0; i < len; i ++)
{
    System.out.print(arr[i]+" ");
}

int idx;
for(int a = 0; a < len; a ++)
{
    for(int j = 1; j < len - a; j++)
    {
        if(arr[j-1]>arr[j])
        {
            idx = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = idx;
        }
    }
}

System.out.println(" ");
System.out.println("Sorted values: ");
for(int i = 0; i < len; i ++)
{
    System.out.print(arr[i]+" ");
}
}
}
