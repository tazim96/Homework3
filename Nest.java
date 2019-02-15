package hw; //NestedClass

class OuterClass 
{  
	
     static String schoolname = "CUNY";         
     static String schoolcity = "London"; 
      

  static class StaticNestedClass 
    { 
        void display() 
        { 
          System.out.println("You go to " + schoolname + " in " + schoolcity); 
        } 
    } 
} 
  
public class Nest 
{ 
    public static void main(String[] args) 
    {       
        OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();       
        nestedObject.display();        
    } 
} 


