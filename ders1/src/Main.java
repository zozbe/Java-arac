import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);
        System.out.println("Hiziniz Giriniz");
        int hiz= input.nextInt();
        System.out.println("2. Hizinizi Giriniz");
        int hiz2= input.nextInt();
        System.out.println("Zamaninizi Giriniz ");
        int zaman= input.nextInt();

        Arac hesap= new Arac(hiz, hiz2, zaman);
        hesap.yazdir();


    }
}