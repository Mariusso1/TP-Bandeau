package exemple;

import bandeau.Bandeau;

public class Tourne extends EffetGene{
    public Tourne(){

    }
    @Override
    public void afficheEffet(Bandeau B, String message){
        B.setMessage(message);
        B.setRotation(Math.PI / 2.0f);
        B.sleep(1000);
        B.setRotation(0.0f);
        B.sleep(1000);
        B.setRotation(Math.PI / 2.0f);
    }
}
