public class Box {
    //Instance data
    private double heigth;
    private double width;
    private double depth;
    private boolean isFull;
    //constructor
    public Box(double heigth, double width, double depth) {
        this.heigth = heigth;
        this.width = width;
        this.depth = depth;
        this.isFull = false;
    }
    //methods
    public double getHeight() {
        return heigth;
    }
    public double getWidth() {
        return width;
    }
    public double getDepth() {
        return depth;
    }
    public boolean isFull() {
        return isFull;
    }
    
    public String boxToString(){
        return "The heigth of the box is "+this.getHeight()+", The width is "+this.width+
                ", The depth is "+this.getDepth()+" and the box content is "+this.isFull;
    }
}