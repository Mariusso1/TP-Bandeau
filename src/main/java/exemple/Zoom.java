package exemple;

import bandeau.Bandeau;

import java.awt.*;

public class Zoom extends EffetGene {
public Zoom(){

}

    @Override
    public void afficheEffet(Bandeau B, String message) {
        B.setMessage(message);
        for (int i = 5; i < 60; i += 5) {
            B.setFont(new Font("AAAAAAAAAA", Font.BOLD, 5 + i));
            B.sleep(100);
        }


    }


    }


