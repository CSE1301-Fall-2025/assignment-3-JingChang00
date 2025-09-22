import java.util.*;
public class FrequencyTable {
public static void main(String[] args){
    Scanner n1 = new Scanner(System.in);
    System.out.println("How many dice? ");
    int num = n1.nextInt();
    int min = num;
    int max = num*6;
    int[] arr = new int[max - min +1];
    int roll = 10000;
    for(int j = 0; j < roll; j++)
    {
         int sum = 0;
         for(int i = 0; i < num; i++){
        int rnd = (int)(Math.random()*6 + 1);
        sum = sum +rnd;
    }
        arr[sum - min]++;
    }

   
System.out.println("Times each value was rolled with "+num+" dice over 10000 rolls");
for(int a = 0; a < arr.length; a++)
{
    System.out.println((min+a)+": "+arr[a]);
}
}
}
