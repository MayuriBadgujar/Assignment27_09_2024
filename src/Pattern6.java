
import java.util.Scanner;

public class Pattern6 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row : ");
        int n = sc.nextInt();
        System.out.println("Enter column : ");
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            //System.out.print(" . ");
            for (int j = 1; j <= i; j++) {

                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

}
/*
Enter row :
4
Enter column :
4
1
1 2
1 2 3
1 2 3 4
 */