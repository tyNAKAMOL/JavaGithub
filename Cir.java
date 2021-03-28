                                            /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testlab8;

public class Cir extends GeometricObject {
    private double radius;
    private String color;
    private int weight;

                     //constructor//
    public Cir(double radius,String color, int weight) {
        this.radius = radius;
        this.color = color;
        this.weight = weight;
    }

    public Cir() {
        color = "White";
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
    
    
}
