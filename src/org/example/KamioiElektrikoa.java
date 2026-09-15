package org.example;

public class KamioiElektrikoa extends Ibilgailua implements Elektrikoa{
    public KamioiElektrikoa(String marka, String modeloa, int urtea){
        super(marka, modeloa, urtea);
    }

    @Override
    public void mugitu(){
        System.out.println("KamioiElektrikoa mugitzen ari da");
    }

    @Override
    public void kargatu(){
        System.out.println("KamioiElektrikoa kargatu da");
    }
}
