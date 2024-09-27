
import java.util.Scanner;

public class Pattern17 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row : ");
        int n = sc.nextInt();

        int i, j, k;
        for (i= 1; i<= n ; i++)
        {
            for (j=1; j<=i; j++)
            {
                System.out.print(" ");
            }
            int m=i;
            for (k=i; k<=n; k++)
            {
                System.out.print(m++ + " ");
            }
            System.out.println("");
        }
    }
}
/*
Enter row :
5
 1 2 3 4 5
  2 3 4 5
   3 4 5
    4 5
     5
 */