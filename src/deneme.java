import java.util.Scanner;
public class deneme {
    public static void main(String[] args) {
        double tutar , kdvOran = 0.18, kdvTutar, kadvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını giriniz : ");
        tutar = input.nextDouble();

        kdvTutar = tutar * kdvOran;
        kadvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar :"+ tutar);
        System.out.println("KDV Oranı :"+ kdvOran);
        System.out.println("KDV Tutarı :"+ kdvTutar);
        System.out.println("KDV'li Tutarı :"+ kadvliTutar);


    }
}
