
import java.util.Scanner;

public class Pattern8 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row : ");
        int n=sc.nextInt();
        System.out.println("Enter column : ");
        int m=sc.nextInt();

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=m;j++) {
                System.out.print(" "+i );
            }
            System.out.println();
        }
    }

}
