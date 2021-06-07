import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        int x;
        Scanner sc= new Scanner(System.in);
        x= sc.nextInt();
        if(x%4==0&&x%100!=0) System.out.println("là năm nhuận");
        else if(x%100==0&&x%400==0) System.out.println("là năm nhuận");
        else System.out.println("ko phải năm nhuận");
    }
}
