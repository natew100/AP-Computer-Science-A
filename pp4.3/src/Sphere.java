public class Sphere {
    private double diameter;

    public Sphere(double diameter) {
      this.diameter = diameter;
    }

    public double getDiameter() {
      return diameter;
    }

    public void setDiameter(double diameter) {
      this.diameter = diameter;
    }

    public double getVolume(){
      double r = diameter/2;
      return (4.0/3.0)*Math.PI*r*r*r;
    }

    public double getArea(){
      double r = diameter/2;
      return 4.0*Math.PI*r*r;
    }

    public String toString() {
      return "Sphere{" + "diameter=" + diameter + '}';
  }
}