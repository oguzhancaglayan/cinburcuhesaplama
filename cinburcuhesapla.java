import java.util.Scanner;
public class cinburcuhesapla {
    public static void main(String[] args) {
        int dogumyil,zodyak;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz : ");
        dogumyil = input.nextInt();
        zodyak = dogumyil%12  ;
        if((dogumyil > 1800) &&(dogumyil <2022)){

            if(zodyak ==0){
                System.out.print("Çin zodyağı Burcunuz : Maymun ");
            }else if (zodyak ==1){
                System.out.print("Çin zodyağı Burcunuz : Horoz ");

            }else if (zodyak ==2){
                System.out.print("Çin zodyağı Burcunuz : Köpek ");
            }else if (zodyak == 3){
                System.out.print("Çin zodyağı Burcunuz : Domuz ");
            }else if (zodyak == 4){
                System.out.print("Çin zodyağı Burcunuz : Fare ");
            }else if (zodyak == 5){
                System.out.print("Çin zodyağı Burcunuz : Öküz ");
            }else if (zodyak ==6){
                System.out.print("Çin zodyağı Burcunuz : Kaplan ");
            }else if (zodyak ==7){
                System.out.print("Çin zodyağı Burcunuz : Tavşan ");
            }else if (zodyak ==8){
                System.out.print("Çin zodyağı Burcunuz : Ejderha ");
            }else if (zodyak == 9){
                System.out.print("Çin zodyağı Burcunuz : Yılan ");
            }else if (zodyak == 10){
                System.out.print("Çin zodyağı Burcunuz : At ");
            }else if (zodyak == 11){
                System.out.print("Çin zodyağı Burcunuz : Koyun ");
            }
        }else{
            System.out.print("Geçersiz bir tarih girdiniz");
        }

    }
}
