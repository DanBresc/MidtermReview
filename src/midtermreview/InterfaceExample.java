package midtermreview;
public class InterfaceExample 
{
    public static void main(String[] args)
    {
        Dog Sage = new Dog();
        Horse Rev = new Horse();
        
        Sage.animalSound();
        Sage.run();
    
        Rev.animalSound();
        Rev.run();
    }
}

interface Animal
{
    public void animalSound();
    public void run();
}

class Dog implements Animal
{
    public void animalSound()
    {
        System.out.println("Woof");
    }
    public void run()
    {
        System.out.println("The Dog Ran");
    }
}

class Horse implements Animal
{
    public void animalSound()
    {
        System.out.println("Neigh");
    }
    public void run(){
        System.out.println("The Horse Ran");
    }
}