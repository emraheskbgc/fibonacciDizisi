import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Bir Sayı Giriniz = ");
        int number = input.nextInt();
        int result;
        int number1=0 , number2=1;
        System.out.print(number1+ " " + number2);
        for (int i=2; i<=number; i++){
            result = number1 + number2;
            System.out.print(" "+ result);
            number1=number2;
            number2=result;
        }
        

    }
}
