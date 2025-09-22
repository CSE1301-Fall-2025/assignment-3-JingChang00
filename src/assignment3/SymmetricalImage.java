import java.util.*;
public class SymmetricalImage {
public static void main(String[] args){
Scanner n1 = new Scanner(System.in);
System.out.println("How many rows do you wan to create? ");
int n = n1.nextInt();
System.out.println("How many columns do you wan to create? ");
int m = n1.nextInt();

boolean[][] arr = new boolean[n][m];
int point =0;

while(point < n * m /4 +1){
int rowrnd = (int)(Math.random()*(n));
int colrnd = (int)(Math.random()*(m));

arr[rowrnd][colrnd] = true;
arr[rowrnd][m-1-colrnd] = true;
point ++; 
}

for(int i = 0; i < arr.length; i++)
{
    for(int j = 0; j < arr[0].length; j++)
    {
        if(arr[i][j] == true)
        {System.out.print("*");}
        else
        {System.out.print(" ");}
    }System.out.println(" ");
}
    }
    
}

