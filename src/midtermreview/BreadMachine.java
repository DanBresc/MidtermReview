package midtermreview;

abstract public class BreadMachine 
{
    boolean timeEnded;
    boolean isRisen;
    String recipeName;
    abstract void addIngredients();
    
    void setRecipename(String name){
        this.recipeName = name;
    }
    
    boolean isDone(){
        return timeEnded && isRisen;
    }
}

class HighAltitudeBreadMachine extends BreadMachine
{
    public HighAltitudeBreadMachine(){
        System.out.println("Creating Low Bread Machine");
    }
    
    @Override
    void addIngredients(){
        System.out.println("Adding High Alt Ing");
    }
}

class LowAltitudeBreadMachine extends BreadMachine
{
    public LowAltitudeBreadMachine()
    {
        System.out.println("Creating Low Altitude Bread Machine");
    }
    
    @Override
    void addIngredients()
    {
        System.out.println("Adding Low Alt Ing");
    }
    
}
class Main
{
    public static void main(String[] args)
    {
        HighAltitudeBreadMachine HBread = new HighAltitudeBreadMachine();
        LowAltitudeBreadMachine LBread = new LowAltitudeBreadMachine();
        
        HBread.addIngredients();
        LBread.addIngredients();
    }
}