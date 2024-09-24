// This program shows an App class, which shows usage of an array.

package Array_Demo;

public class App
{
    public static void main(String[] args)
    {
        String[] arr1 = new String[3];
        arr1[0] = "Amit"; // String class object's reference accepted
        // arr1[1] = new Product(); // Error: Only String class object's reference allowed
        // arr2[2] = new Customer(); // Error: Only String class object's reference allowed

        Product[] arr2 = new Product[3];
        // arr2[0] = "Amit"; // Error: Only Product class object's reference allowed
        arr2[1] = new Product(); // Product class object's reference accepted
        // arr2[2] = new Customer(); // Error: Only Product class object's reference allowed

        Customer[] arr3 = new Customer[3];
        // arr3[0] = "Amit"; // Error: Only Customer class object's reference allowed
        // arr3[1] = new Product(); // Error: Only Customer class object's reference allowed
        arr3[2] = new Customer(); // Customer class object's reference accepted
    }
}

// Conclusion: In specific case of reference variables, an array can be homogenous and heterogeneous as well.