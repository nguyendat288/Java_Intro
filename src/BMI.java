import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        float weigth = sc.nextFloat();
        float higth = sc.nextFloat();
        float bmi = weigth/(higth*higth);
        if(bmi<18.5) System.out.println("Interpretation");
        else if(bmi>=18.5&&bmi<25) System.out.println("Normal");
        else if(bmi>=25&&bmi<30) System.out.println("Overweigth");
        else System.out.println("Obese");
    }
}
