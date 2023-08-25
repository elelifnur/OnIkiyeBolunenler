import java.util.Scanner;
public class CiftSayiBulma {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number,avarage=0,top=0,sayac=0;

        System.out.print("Sayı Giriniz: ");
        number = input.nextInt();

        for (int i=0; i <= number;i++){
            if (i % 12==0){
                sayac++;
                top+=i;

            }


        }
        avarage= top / sayac;
        //System.out.println(top);
        //System.out.println(sayac);
        System.out.println("Sayıların ortalaması: "+avarage);
    }
}
