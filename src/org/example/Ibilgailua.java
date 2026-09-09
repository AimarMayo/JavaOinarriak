package org.example;

public class Ibilgailua {
    String modeloa;
    String marka;
    int urtea;

    public Ibilgailua(String marka, String modeloa, int urtea) {
        this.modeloa = modeloa;
        this.marka = marka;
        this.urtea = urtea;
    }
    public void erakutsidatuak(){
        System.out.println("Ibilgailua: " + marka + " " + modeloa + " " + urtea);
    }
}
