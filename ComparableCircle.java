
package testlab8;

public class ComparableCircle extends Cir{
   private double A1,A2;

    public ComparableCircle(double A1, double A2) {
        this.A1 = A1;
        this.A2 = A2;
    }

    public ComparableCircle() {
    }
   
    public int maxArea(double a1,double a2){
        if(a1>=a2){
            return 1;
        }
        else return 2;
    }
}
