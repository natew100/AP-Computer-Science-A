public class Die
{
    private final int MAX = 10;  
    private int faceValue;  
    public Die()
    {
       faceValue = 1;
    }

    public int roll()
    {
       faceValue = (int)(Math.random() * MAX) + 1;
       return faceValue;
    }

    public void setFaceValue (int value)
    {
       faceValue = value;
    }

    public int getFaceValue()
    {
       return faceValue;
    }
    
    @Override
    public String toString()
    {
       String result = Integer.toString(faceValue);
       return result;
    }
		   
}