package pp7.pkg2;



public class Student {
    private String firstName, lastName;
    private Address homeAddress, schoolAddress;
    private int scoreOne, scoreTwo, scoreThree;

    // init constructor with values
    public Student(String first, String last, Address home, Address school) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        this.scoreOne = 0;
        this.scoreThree = 0;
        this.scoreTwo = 0;
    }

    public Student(String firstName, String lastName, Address homeAddress, Address schoolAddress, int scoreOne, int scoreTwo, int scoreThree) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.homeAddress = homeAddress;
        this.schoolAddress = schoolAddress;
        this.scoreOne = scoreOne;
        this.scoreTwo = scoreTwo;
        this.scoreThree = scoreThree;
    }

    
    // set test score method
    public void setTestScore(int testNumber, int score) {
        if (testNumber == 1) scoreOne = score;
        else if (testNumber == 2) scoreTwo = score;
        else if (testNumber == 3) scoreThree = score;

    }
    
    // get test score
    public int getTestScore(int testNumber) {
        if (testNumber == 1) return scoreOne;
        else if (testNumber == 2) return scoreTwo;
        else if (testNumber == 3) return scoreThree;
        else return -1;
    }

    // calculate average
    public double average() {
        return (scoreOne + scoreTwo + scoreThree) / 3.0;
    }

    public String toString() {
        String result;
        result = firstName + " " + lastName + "\n";
        result += "Home Address:\n" + homeAddress + "\n";
        result += "School Address:\n" + schoolAddress + "\n";
        result += "Score 1:" + scoreOne + ", Score 2: " + scoreTwo + ", Score 3: " + scoreThree + "\n";
        result += "Average Score: " + average() + "\n";
        return result;
    }
}