/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nyonyazlimilkders;

/**
 *
 * @author xx
 */
public class NYonYazlimIlkDers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //kare dikdörtgen ve ucgen değişkenleri farklı olduğundan 3 nesne de ayrı ayrı oluşturuldu
        Kare kare = new Kare(8);
        Dikdortgen dikd = new Dikdortgen(5, 4);
        Ucgen ucgen = new Ucgen(5, 6, 9);

        //cevrelerini hesaplayan fonksiyon çalıştırılıyor
        System.out.println("*****************************************");
        kare.cevre();
        dikd.cevre();
        ucgen.cevre();
        System.out.println("*****************************************");
    }
}
