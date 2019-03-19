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
public class Ucgen  extends AbstractClass{
   private int aKenari,bKenari,cKenari;

    public Ucgen(int aKenari, int bKenari, int cKenari) {
        this.aKenari = aKenari;
        this.bKenari = bKenari;
        this.cKenari = cKenari;
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

    public int getcKenari() {
        return cKenari;
    }

    public void setcKenari(int cKenari) {
        this.cKenari = cKenari;
    }
    
    @Override
    int cevre() {
        int cevre=getaKenari()+getbKenari()+getcKenari();
        System.out.println("Üçgenin Çevresi Hesaplandı.......:"+cevre);
        return cevre;
    }
}
