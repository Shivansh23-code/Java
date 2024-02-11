import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while(count <= n){
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }
        System.out.println(b);

        S.close();
    }
}
