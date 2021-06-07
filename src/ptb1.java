import java.util.Scanner;

public class ptb1 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
                a=sc.nextInt();
                b=sc.nextInt();
        if(a==0){
            if(b==0)
                System.out.println("vô số nghiệm");
            else System.out.println("vô nghiệm");
        }
        else{
            System.out.println("x=" +(-b/a));
        }
    }
}
