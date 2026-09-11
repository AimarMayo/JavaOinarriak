package org.example;

public class Kotxea extends Ibilgailua{
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
