import java.util.Scanner;

public class main {
    public static void main(String[] args) {
int km;
double Kmbasına = 15, total, baslangic = 10 ;

Scanner input= new Scanner(System.in);
        System.out.println("Mesafi km bazindan giriniz");
        km = input.nextInt();

        total=(Kmbasına * km);
        total=(total < 20) ? 20 : total;

        boolean saka=total==75.0;
        String vericenabi= saka ? "75  Sen bana Kac para vericen abi.Ben sana neden para veriyorum birader sen bana para vericen" : "s";
    System.out.println("Toplam tutar:" + vericenabi);

    }
}