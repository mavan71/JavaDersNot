package J10_MethodCreation.Task;

import java.util.Scanner;

public class Task_27 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

         /*
   task->
   belirli bir yukseklikten bırakılan top atildigi yuksekligin 3/4 u kadar yerden yukari dogru ziplamaktadir
    Topun ziplama  yuksekligi 1 metrenin altina dşütüğü ana kadar topun aldigi toplam yolu ve yere vurma sayisini print eden METHOD  create ediniz.
*/

        zıplayanTop();


    }

    private static void zıplayanTop() {
        System.out.println("Topun bırakıldığı yüksekliği giriniz :");
        double yukseklik = input.nextDouble();
        double alinanYol = 0;
        int sayac = 0;

        while (yukseklik >=1 ){
            alinanYol+=yukseklik;
            yukseklik-=yukseklik*0.25;
            sayac++;
        }

            System.out.println("alınan yol :" + alinanYol);
            System.out.println("zıplama sayısı: " + sayac);

        }
    }

