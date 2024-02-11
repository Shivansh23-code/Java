//  In this section we will discuss about "parameters used in methods"
import java.util.Scanner;

public class Methods_parameters{
    
    // Creating Method for adding two numbers

    /*  Parameters and Arguments :- Information can be passed to methods as parameters.
                                    Parameters act as variables inside the method.
                                    Parameters are specified after the method name, inside the parenthesis.
                                    We can add as many parameters as we want, just separate them with a comma.
                                    "Parameters"    :-  'Variables' passed to method insid ethe parenthesis
                                    "Arguments"     :-  The 'Values' passed in the methods during call of method.
                                    Let's have an example :-
    */

    static void name(String fname){
        System.out.println("Hello, " + fname + "! Nice to meet You.");
    }

    static void add (int a, int b){                 // This is void type function
        System.out.println(a + b);                  // It will not return any value
    }

    static int addition(int x){
        return 23 + x ;
    }

    // A Method with If...Else

    // We have to create a method to check age limits

    static void checkAge (int age){

        // If age is less than 18, printing access is denied
        if (age<18) {
            System.out.println("Sorry! Access is Denied.. Your age is not enough.");
        }
        else{
            System.out.println("Welcome! Access is Granted.. Your age is enough");
        }

    }

    static int myMethod(int x){
        return x;
    }

    static float myMethod(float x){
        return x;
    }

    static double myMethod(double x, double y){
        return x + y;
    }


    
    public static void main(String[] args) {
        add(55, 45);   
        System.out.println(addition(23));
        name("Shivansh");               // Here, "fname" is 'parameters' and "Shivansh" is 'arguments'.
        
        Scanner R = new Scanner(System.in);
        System.out.println("Enter your Age...");
        int a = R.nextInt();
        // System.out.println( + a);
        checkAge(a);
        R.close();

// -----------------------------------------------JAVA METHOD OVERLOADING--------------------------------------------

        /*  METHOD OVERLOADING :-   With method overloading, multiple methods can have the 
                                    same name with different parameters :
        */

        // We have three different methods name of "myMethod" but having different parameters like int, float & double
        
        System.out.println(myMethod(95));
        System.out.println(myMethod(23.01f));
        System.out.println(myMethod(23.02d, 200.055d));



    }
}