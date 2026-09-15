package org.example;

public class Kotxea extends Ibilgailua{
    final static int GURPIL_KOPURUA = 4;

    public Kotxea(String marka, String modeloa, int urtea) {
        super(marka, modeloa, urtea);
    }
    @Override
    public String erakutsidatuak(){
        return("Kotxea: " + super.erakutsidatuak());
    }

    public void mugitu(){
        System.out.println("Kotxea mugitzen ari da");
    }
}
