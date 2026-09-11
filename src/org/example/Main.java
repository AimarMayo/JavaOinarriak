package org.example;

public class Main {
    static void main() {
        Ibilgailua ibilgailua = new Ibilgailua("SEAT", "LEON", 2000);
        System.out.println(ibilgailua.erakutsidatuak());

        Kotxea kotxea = new Kotxea ("SEAT", "LEON", 2001);
        System.out.println(kotxea.erakutsidatuak());

        Motorra motorra = new Motorra ("KTM", "125", 2000);
        System.out.println(motorra.erakutsidatuak());
    }
}
