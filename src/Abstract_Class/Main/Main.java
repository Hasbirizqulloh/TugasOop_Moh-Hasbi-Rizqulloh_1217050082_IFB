package Abstract_Class.Main;

import Abstract_Class.AlatMusik.Gitar;
import Abstract_Class.AlatMusik.Keyboard;


public class Main {
    public static void main(String[] args) {
        //Instrumen gitar
        Gitar gitar = new Gitar("Yamaha", null, 0);
        gitar.display();
        gitar.bunyikanAlat();
        gitar.bunyikanAlat(2);

        //Instrumen Keyboard
        Keyboard keyboard = new Keyboard("Yamaha Motif XF8", null, 0);
        keyboard.display();
        keyboard.bunyikanAlat();
        keyboard.bunyikanAlat(5);
    }
}
