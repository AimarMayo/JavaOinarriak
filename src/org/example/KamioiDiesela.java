package org.example;

public class KamioiDiesela extends Ibilgailua implements ErregaiaErabiltzenDuena{
    public KamioiDiesela(String marka, String modeloa, int urtea){
        super(marka, modeloa, urtea);
    }

    @Override
    public void mugitu(){
        System.out.println("Diesel kamioia mugitzen ari da");
    }

    @Override
    public void hornitu(){
        System.out.println("Diesel kamioia hornituta dago");
    }
}
