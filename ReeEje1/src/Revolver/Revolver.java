
package Revolver;

public class Revolver {
   private Integer ptambor = ((int) (Math.random()*6)) ;
   private Integer pbala = ((int) (Math.random()*6));

    public Revolver() {
    }

    public Integer getPtambor() {
        return ptambor;
    }

    public void setPtambor(Integer ptambor) {
        this.ptambor = ptambor;
    }

    public Integer getPbala() {
        return pbala;
    }

    public void setPbala(Integer pbala) {
        this.pbala = pbala;
    }

   
    @Override
    public String toString() {
        return "Revolver{" + "ptambor=" + ptambor + ", pbala=" + pbala + '}';
    }


}
