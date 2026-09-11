package org.example;

public class Motorra extends Ibilgailua{
    public Motorra(String marka, String modeloa, int urtea) {
        super(marka, modeloa, urtea);
    }
    @Override
    public String erakutsidatuak(){
        return("Motorra: " + super.erakutsidatuak());
    }
}
