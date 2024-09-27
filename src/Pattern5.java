
import java.util.Scanner;

public class Pattern5 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row : ");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                if(n%2==0) {
                    if (i == n/2 || j ==n/2) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                else {
                    if (i == ((n/2) +1) || j == ((n/2)+1)) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

}
/*

Enter row :
7
   *
   *
   *
*******
   *
   *
   *

 */