package coding_exercise.cylinder;

public class Cylinder extends Circle {
   private double height;


    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
        if (height>0){
            this.height = height;
        }
        else if (height<0){
            this.height =0;
        }
    }

    public double getHeight() {
        return height;
    }
    public double getVolume (){
        double volume = getArea() * height;
        return volume;
    }
}

