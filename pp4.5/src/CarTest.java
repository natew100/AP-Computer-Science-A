public class CarTest {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setMake("Mazda");
        car1.setModel("cx5");
        car1.setYear(2019);
        System.out.println(car1);
        System.out.println("Antique: " + car1.isAntique());

        Car car2 = new Car();
        car2.setMake("bmw");
        car2.setModel("i9");
        car2.setYear(2018);
        System.out.println();
        System.out.println(car2);
        System.out.println("Antique: " + car2.isAntique());

        Car car3 = new Car();
        car3.setMake("caddilac");
        car3.setModel("escalade");
        car3.setYear(2016);
        System.out.println();
        System.out.println("Make: " + car3.getMake());
        System.out.println("Model: " + car3.getModel());
        System.out.println("Year: " + car3.getYear());
        System.out.println("Antique: " + car3.isAntique());
    }

}