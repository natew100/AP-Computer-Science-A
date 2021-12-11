package pp7.pkg3;



public class Address{

   private String streetAddress,city,state;
   private long zipcode;

   public Address(String street, String town,String st,int zip){
       streetAddress = street;
       city = town;
       state = st;
       zipcode = zip;
   }

   public String toString(){
       String result;
       result = streetAddress;
       result +=city+" , "+ state + " " + zipcode;
       return result;
   }
}