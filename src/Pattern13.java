import java.util.Scanner;

public class Pattern13 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row : ");
        int n = sc.nextInt();
        System.out.println("Enter column : ");
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {
                if (i % 2 != 0) {
                    if (j % 2 == 0) {
                        System.out.print(" 1 ");
                    } else {
                        System.out.print(" 0 ");
                    }
                }
                else {
                    if(j%2!=0) {
                        System.out.print(" 1 ");
                    }
                    else {
                        System.out.print(" 0 ");
                    }
                }

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
 0  1  0  1
 1  0  1  0
 0  1  0  1
 1  0  1  0

 */