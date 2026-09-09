package org.example;

public class Main {
    static void main() {
        Ibilgailua ibilgailua = new Ibilgailua("SEAT", "LEON", 2000);

        ibilgailua.erakutsidatuak();

        ibilgailua.setUrtea(-100);
        ibilgailua.erakutsidatuak();

        Kotxea kotxea = new Kotxea ("SEAT", "LEON", 2001);
        kotxea.erakutsidatuak();
    }
}
