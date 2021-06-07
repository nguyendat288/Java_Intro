import java.util.Scanner;

public class USD_VN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int money=sc.nextInt();
        int vn=money*23000;
        System.out.println(money + " equal " +vn +" VND");
    }
}
