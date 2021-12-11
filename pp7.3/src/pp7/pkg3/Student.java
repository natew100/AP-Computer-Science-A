package pp7.pkg3;



public class Student {
   private String firstName, lastName;
   private Address homeAddress, schoolAddress;
   private int test1;
   private int test2;
   private int test3;
  
   public Student() {
       test1 = 0;
       test2 = 0;
       test3 = 0;
   }
   
public Student(String first,String last,Address home, Address school, int t1 , int t2, int t3) {
       firstName = first;
       lastName = last;
       homeAddress = home;
       schoolAddress = school;
       test1 = t1;
       test2 = t2;
       test3 = t3;
   }
   public void setTestScore(int x, int score) {
       if (x == 1) {
       test1 = score;
       }
       else if (x == 2) {
       test2 = score;
       }
       else if (x == 3) {
       test3 = score;
       }
   }
   public int getTestScore( int x) {
       if (x == 1) {
       return test1;
       }
       else if (x == 2) {
       return test2;
       }
       else if (x == 3) {
       return test3;
       }
       return 0;
   }
   public double average() {
       double sum = test1 + test2 + test3;
       return sum/3;
   }
   public String toString() {
       String result;
       result = firstName + " " +lastName + " " + "\n";
       result += "Home Address: " + " " + homeAddress + "\n";
       result += "School Address: " + " " + schoolAddress + "\n";
       result += "Scores: "+"\n";
       result += "Test 1: " + test1 + "\n";
       result += "Test 2: " + test2 + "\n";
       result += "Test 3: " + test3 + "\n";
       result += "Average: " + average() + "\n";
       return result;
   }
}