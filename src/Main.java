import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        int total = 0;
        do {
            System.out.print("Sayi Giriniz: ");
            n = input.nextInt();
            if (n % 2 == 0 && n % 4 == 0) {
                total = total + n;
                System.out.println(n); // 2 ve 4 ün kati olan sayilarin değerlerini vermektedir.
            }

        } while (!(n % 2 == 1)); // n sayisinin mod 2 ye göre kalan 1 eşit olduğunda işlemi bitir.(!)
        {
            System.out.println("Tek sayi girdiginiz için islem sonlandirilmistir.");
        }
        ;


        System.out.println("Girilen 2 ve 4'ün katlari sayilarin toplami = " + total);
    }
}