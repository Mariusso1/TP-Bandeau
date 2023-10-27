package exemple;

import bandeau.Bandeau;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        new Main().monBandeau();
    }
    public void monBandeau(){
        Bandeau BandeauPerso = new Bandeau();
        Zoom Pro = new Zoom();
        Tourne tourne = new Tourne();
        ChangeCouleur change = new ChangeCouleur();
        Scenario le1 = new Scenario();
        le1.ajouteffet(tourne, 4);
        le1.ajouteffet(change, 3);
        le1.ajouteffet(Pro, 1);
        le1.afficherleseffet(BandeauPerso, "LE XV DE FRANCE");

    }

}
