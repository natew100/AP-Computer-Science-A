package pp9.pkg8;


public class Pp98 {
    public static void main(String[] args) {
        Course c1, c2;
        c1 = new MathCourse("Algebra", "Matthew Potter","004", "In this algebra is taught");
        c2 = new EngCourse("English ", "Teresa Jones","181", "In this course hamlet is taught");
        c1.displayMessage();
        c2.displayMessage();
    }
}