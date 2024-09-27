import java.util.Scanner;

public class Pattern3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row : ");
        int n=sc.nextInt();
        System.out.println("Enter column : ");
        int m=sc.nextInt();
        char ch='A';
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {

                System.out.print((char)(ch+i+j)
                        +" " );
            }
            System.out.println();
        }
    }

}
/*
Enter row :
5
Enter column :
5
A B C D E
B C D E F
C D E F G
D E F G H
E F G H I
 */