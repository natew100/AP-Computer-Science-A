package pp9.pkg7;




public class DigitalCameras {
    int numWeight;
    int numCost;
    int powerUsage;
    String manafactureName;
    String electronicType="Digital Cameras";
    public DigitalCameras(int weight,int cost, int power, String name)

    {
    numWeight=weight;
    numCost=cost;
    powerUsage=power;   
    manafactureName=name;
    }
    
    public void setNameOfManafacture(String name)
    {
    manafactureName=name;
    }

    public void setWeight(int w)
    {
    numWeight=w;
    }

    public void setCost(int c)
    {
    numCost=c;
    }

    public void setPower(int p)
    {
    powerUsage=p;
    }

    public int getWeight()
    {
    return numWeight;
    }
    
    public String getNameOfManafacture()
    {
    return manafactureName;
    }

    public int getCost()
    {
    return numCost;
    }

    public int getPower()
    {
    return powerUsage;
    }

    public String toString() {
        String s="";
        s+="Electronic Type: "+electronicType+"\n"
        +"Weight: "+numWeight+"\n"
        +"Cost: "+numCost+"\n"
        +"Power Usage: "+powerUsage+"\n"
        +"Manafacture Name: "+manafactureName+"\n";
        return s;
    }
}
