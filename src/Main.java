import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int m, n;
        System.out.println("Nhập chiều cao chiều rộng");
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        n = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == m-1 ||j == 0 || j == n-1){
                    System.out.print(" * ");
                }else {
                    System.out.println("   ");
                }
            }
        }
    }
}