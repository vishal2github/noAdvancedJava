// Creating AA class, for null value output demo.

package Null_Demo;

public class AA
{
    // These instance variables will be created each time 'obj' of class AA will be created
    private Product p; // 'p' stores Product class object's reference
    private Employee e; // 'e' stores Employee class object's reference
    private String s; // 's' stores String class object's reference

    public void show()
    {
        System.out.println("Value of p: " + p);
        System.out.println("Value of e: " + e);
        System.out.println("Value of s: " + s);
    }

    public static void main(String[] args)
    {
        AA obj = new AA();
        obj.show();
    }
}

// Conclusion: The non-primitive type instance variable's default value is 'null'.
