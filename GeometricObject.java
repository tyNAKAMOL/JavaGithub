
package testlab8;

public  abstract class GeometricObject implements Comparable<GeometricObject>,Cloneable{

                     //Constructor//
    public GeometricObject(){
    }
    
    public abstract double getArea();
    
                    //Method//
    @Override
    public int compareTo(GeometricObject compare){
        if(this.getArea() < compare.getArea()){
            return -1;
        }
        else if(this.getArea() > compare.getArea()){
            return 1;
        }
        else{
            return 0;
        }
    }
    
    public static int max(GeometricObject x,GeometricObject y){
        if(x.getArea() > y.getArea()){
            return 1;
        }
        else if(x.getArea() < y.getArea()){
            return 2;
        }
        else return 0;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public boolean equals(GeometricObject obj) {
        return this.getArea() == obj.getArea(); //To change body of generated methods, choose Tools | Templates.
    }
   
}
