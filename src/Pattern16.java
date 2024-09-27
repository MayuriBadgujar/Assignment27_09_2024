




import java.util.Scanner;

public class Pattern16 {

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
            for (k=i; k<=n; k++)
            {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }
}
/*
Enter row :
8
 * * * * * * * *
  * * * * * * *
   * * * * * *
    * * * * *
     * * * *
      * * *
       * *
        *
 */