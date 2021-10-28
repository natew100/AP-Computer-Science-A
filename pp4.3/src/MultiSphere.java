public class MultiSphere {
  public static void main(String args[]) {
    Sphere sphere1 = new Sphere(5);
    System.out.println(sphere1.getArea());
    System.out.println(sphere1.getVolume());
    sphere1.setDiameter(10);
    System.out.println(sphere1.getArea());
    System.out.println(sphere1.getVolume());


    Sphere sphere2 = new Sphere(15);
    System.out.println(sphere2);
  }
}