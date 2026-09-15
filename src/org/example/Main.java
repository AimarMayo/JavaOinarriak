package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        /*Ibilgailua ibilgailua = new Ibilgailua("SEAT", "LEON", 2000);
        System.out.println(ibilgailua.erakutsidatuak());

        Kotxea kotxea = new Kotxea ("SEAT", "LEON", 2001);
        System.out.println(kotxea.erakutsidatuak());

        Motorra motorra = new Motorra ("KTM", "125", 2000);
        System.out.println(motorra.erakutsidatuak());*/

        Ibilgailua[] ibilgailuak = {
            new Kotxea ("SEAT", "LEON", 2001),
            new Motorra ("KTM", "125", 2000)
        };
        for (Ibilgailua ibil : ibilgailuak){
            System.out.println(ibil.erakutsidatuak());
        }

        List<Elektrikoa> elektrikoaList = new ArrayList<>();
        elektrikoaList.add(new KamioiElektrikoa( "TESLA", "MODEL X", 2020));
        elektrikoaList.add(new KamioiElektrikoa("TESLA", "MODEL Y", 2021));

        elektrikoaList.get(0).kargatu();
        elektrikoaList.get(1).kargatu();
        elektrikoaList.set(0, new KamioiElektrikoa("TESLA", "MODEL ", 2022)).kargatu();

        elektrikoaList.remove(1);
        System.out.println(elektrikoaList.size());

        System.out.println("ibilgailu kopurua: " + Ibilgailua.getKopurua());
    }
}
