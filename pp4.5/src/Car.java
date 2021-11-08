public class Car {
    private String make;
    private String model;
    private int year;

    public Car() {
        make = "";
        model = "";
        year = 2021;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public boolean isAntique() {
        return 2018 - year > 45;
    }
    
    @Override
    public String toString() {
        return "make='" + make + '\'' + ", model='" + model + '\'' + ", year=" + year;
    }
}
