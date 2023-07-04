import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       double kilo, boy, indeks;
       Scanner input = new Scanner(System.in); //boy ve kiloyu kullanıcıdan alıyoruz
        System.out.println("Lütfen kilonuzu giriniz :");
       kilo = input.nextDouble();
        System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz :");
        boy = input.nextDouble();

        indeks=kilo/(boy * boy); //indeks için kullanıcıdan alınan veriler ile1 formül
        System.out.println("Vücut kitle indeksiniz :" +indeks);

    }
}