
import java.util.Scanner;

public class Pattern15 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row : ");
        int n = sc.nextInt();
    for (int i= n; i>= 1; i--)
    {
        for (int j=n; j>i;j--)
        {
            System.out.print(" ");
        }
        for (int k=1;k<=i;k++)
        {
            System.out.print("*");
        }
        System.out.println("");
    }
}
}
/*
Enter row :
6
******
 *****
  ****
   ***
    **
     *

 */