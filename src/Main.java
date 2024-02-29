import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0};
        int sayi;
        int min = dizi[0];
        int max = dizi[0];


        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        sayi = input.nextInt();

        int tempMin = Math.abs(dizi[0] - sayi);
        int tempMax = Math.abs(dizi[0] - sayi);

        for (int i : dizi){
            if(Math.abs(i -sayi) < tempMin){
                tempMin = Math.abs(i - sayi);
                min = i;
            }

            if(Math.abs(i -sayi) < tempMax){
                tempMax = Math.abs(i - sayi);
                if(i > sayi){
                    max = i;
                }
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + max);
    }
}