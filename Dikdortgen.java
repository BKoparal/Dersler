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
public class Dikdortgen extends AbstractClass{
    private int aKenari,bKenari;

    public Dikdortgen(int aKenari, int bKenari) {
        this.aKenari = aKenari;
        this.bKenari = bKenari;
    }

    public int getaKenari() {
        return aKenari;
    }

    public void setaKenari(int aKenari) {
        this.aKenari = aKenari;
    }

    public int getbKenari() {
        return bKenari;
    }

    public void setbKenari(int bKenari) {
        this.bKenari = bKenari;
    }
    
    @Override
    int cevre() {
        int cevre=getaKenari()+getbKenari();
        System.out.println("Dikdörtgenin Çevresi Hesaplandı..:"+cevre);
        return cevre;
    }   
}
