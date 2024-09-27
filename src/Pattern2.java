import java.util.Scanner;

public class Pattern2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row :");
        int n = sc.nextInt();
        System.out.println("Enter the column :");
        int m = sc.nextInt();


        int i, j;
//Outer loop work for rows
        for (i=1; i<=n; i++)
        {
//inner loop work for space
            for (j=n; j>=1; j--)
            {
//prints space between two stars
                System.out.print(" ");
            }
//inner loop for columns
            for (j=1; j<=i; j++ )
            {
//prints star
                System.out.print( j+" ");
            }
//throws the cursor in a new line after printing each line
            System.out.println();
        }
    }
}