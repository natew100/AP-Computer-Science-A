package pp7.pkg5;

interface Priority{
    public void setPriority(int p);
    public int getPriority();
}

class Task implements Priority{
    private int priority;

    public void setPriority(int p) {
        priority = p; 

    }
    public int getPriority() {
        return priority;
    }
        
}

public class Pp75 {
    public static void main(String[] args) {
        Priority p = new Task();
        p.setPriority(10);
        System.out.println(p.getPriority());
    }
}