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
public class Kare extends AbstractClass {
 private int aKenari;

    public Kare(int aKenari) {
        this.aKenari = aKenari;
    }

    public int getaKenari() {
        return aKenari;
    }

    public void setaKenari(int aKenari) {
        this.aKenari = aKenari;
    }

    @Override
    int cevre() {
        int cevre=4*getaKenari();
        System.out.println("Karenin Çevresi Hesaplandı.......:"+cevre);
        return cevre;
    }
}
