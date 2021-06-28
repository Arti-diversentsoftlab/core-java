package day6.assignment;

public class constructorchaining {
    constructorchaining()
    {
        this(5);
        System.out.println("The Default constructor");
    }
  
    constructorchaining(int x)
    {
        this(5, 15);
        System.out.println(x);
    }
  
    constructorchaining(int x, int y)
    {
        System.out.println(x * y);
    }
  
    public static void main(String args[])
    {
        new constructorchaining();
    }
}



