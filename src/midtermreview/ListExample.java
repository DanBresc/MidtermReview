package midtermreview;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ListExample 
{
    public static void main(String[] args)
    {
        //ArrayList
        List myList = new ArrayList();   
        
        myList.add("Object 1");
        myList.add("Object 2");
        myList.add("Object 3");
        myList.add("Object 4");
        
        myList.remove(2); //Removes 3rd element
        
        String firstObject = (String)myList.get(0); //WE cast it to a string because its a normal list
        
        int size = myList.size(); //returns size of list
        
        
        //Iterating through lists
        //Method One: Using Iterator
        Iterator iterator = myList.iterator();
        
        while(iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
        //Method Two:
        for(Object next: myList){
            System.out.println(next);
        }
        
        for(int i = 0; i < myList.size(); i++){
            Object next = myList.get(i);
            System.out.println(next);
        }
        
        myList.clear(); //Removes all elements from list
        
        //Typing a list
        
        List<String> stringList = new ArrayList<String>(); //Only allows strings
        stringList.add("Object 1");
        stringList.add("Object 2");
        stringList.add("Object 3");
        
        
        String secondObject = stringList.get(1); //No Casting needed we know there is only strings
        System.out.println(secondObject);
    }
}
