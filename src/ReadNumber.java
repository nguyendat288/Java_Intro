import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String number = sc.nextLine();
        for(int i=0; i <number.length();i++) {
        if(number.charAt(i)=='1'){
            System.out.printf("một"+" ");
        }
            if(number.charAt(i)=='2'){
                System.out.printf("hai"+" ");
            }
            if(number.charAt(i)=='3'){
                System.out.printf("ba"+" ");
            }
            if(number.charAt(i)=='4'){
                System.out.printf("bốn"+" ");
            }
            if(number.charAt(i)=='5'){
                System.out.printf("năm"+" ");
            }
            if(number.charAt(i)=='6'){
                System.out.printf("sáu"+" ");
            }
            if(number.charAt(i)=='7'){
                System.out.printf("bảy"+" ");
            }
            if(number.charAt(i)=='8'){
                System.out.printf("tám"+" ");
            }
            if(number.charAt(i)=='9'){
                System.out.printf("chín"+" ");
            }
        }
        }
        }


