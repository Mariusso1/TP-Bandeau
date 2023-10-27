package exemple;

import bandeau.Bandeau;

import java.util.ArrayList;

public class Scenario {
    private Bandeau B;
    private String message;
    ArrayList<EffetGene> Listeffet = new ArrayList<EffetGene>();
    public Scenario(){

    }


    public void ajouteffet(EffetGene effet, int nbreffet){
        for(int i = 0; i <=nbreffet; i++){
            Listeffet.add(effet);
        }
    }
    public void afficherleseffet(Bandeau B, String message){
        for (EffetGene e : Listeffet){
            e.afficheEffet(B, message);
        }
    }
}




