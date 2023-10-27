package exemple;

import bandeau.Bandeau;

import java.awt.*;

public class ChangeCouleur extends EffetGene{
    public ChangeCouleur(){
    }
    public void afficheEffet(Bandeau B, String message){
        Font font = B.getFont();
        Color back = B.getBackground();
        Color fore = B.getForeground();
        B.setMessage(message);
        B.setFont(font);
        B.sleep(1000);
        B.setForeground(Color.RED);
        B.sleep(1000);
        B.setBackground(Color.BLUE);
        B.sleep(1000);
        B.setMessage("OK on change");
        B.sleep(1000);
        B.setForeground(Color.RED);
        B.sleep(1000);
        B.setBackground(Color.BLUE);
    }
}
