package Revolver;

import Juego.Juego;

/**
 *
 * @author W7
 */
public class RevolverServicio {

    Revolver re = new Revolver();

    public Revolver llenarRevolver() {
        re.setPtambor(((int) (Math.random() * 6)));
        re.setPbala(((int) (Math.random() * 6)));
    return re;
    }

    public boolean disparar(Juego j) {
        boolean coincide;
        if (j.getR().getPbala() == j.getR().getPtambor()) {
            coincide = true;
        } else {
            coincide = false;
        }
        return coincide;
    }

    public void siguienteBala(Juego j) {
        if (j.getR().getPtambor() < 5) {
            j.getR().setPtambor(j.getR().getPtambor() + 1);
        } else {
            j.getR().setPtambor(0);
        }
    }

}
