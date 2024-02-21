import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Tam Sayı Giriniz: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        System.out.print("Ondalıklı Sayı Giriniz: ");
        double b = input.nextDouble();

        // Tam sayıyı ondalık sayıya dönüştürme
        double aOndalik = (double) a;

        // Ondalık sayıyı tam sayıya dönüştürme
        int bTam = (int) b;

        System.out.println("Tam sayıdan ondalıklı sayıya dönüştürülen değer: " + aOndalik);
        System.out.println("Ondalıklı sayıdan tam sayıya dönüştürülen değer: " + bTam);
    }
}