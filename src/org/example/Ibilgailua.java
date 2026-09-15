package org.example;

public abstract class Ibilgailua {
    private static int kopurua = 0;

    private String modeloa;
    private String marka;
    private int urtea;

    public Ibilgailua(String marka, String modeloa, int urtea) {
        this.modeloa = modeloa;
        this.marka = marka;
        this.urtea = urtea;

        kopurua++;
    }

    public static int getKopurua(){
        return kopurua;
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
    public String getMarka(){
        return marka;
    }
    public void setMarka(String marka){
        this.marka = marka;
    }

    public String erakutsidatuak(){

        return this.marka + " " + this.modeloa + " " + this.urtea;
    }

    public abstract void mugitu();
}
