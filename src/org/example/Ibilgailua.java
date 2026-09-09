package org.example;

public class Ibilgailua {
    private String modeloa;
    private String marka;
    private int urtea;

    public Ibilgailua(String marka, String modeloa, int urtea) {
        this.modeloa = modeloa;
        this.marka = marka;
        this.urtea = urtea;
    }
    public String getModeloa(){
        return modeloa;
    }
    public void setModeloa(String modeloa){
        this.modeloa = modeloa;
    }

    public int getUrtea() {
        return urtea;
    }

    public void setUrtea(int urtea) {
        if (urtea > 1900){
            this.urtea = urtea;
        }
    }

    public void erakutsidatuak(){
        System.out.println("Ibilgailua: " + marka + " " + modeloa + " " + urtea);
    }
}
