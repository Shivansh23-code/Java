// This is "MATH SECTION IN JAVA"
// import java.util.Scanner;

public class Java_Math {
    public static void main(String[] args) {
        /*  The "Java Math class" has many methods that 'allows' you to "perform mathematical tasks on numnbers".
            It has some methods, that are given below with Illustrations :-
            1.  "Math.max(x,y)"  :-  This method can be used to find the "Highest value" of 'x' and 'y'.
            2.  "Math.min(x,y)"  :-  This method can be used to find the "Lowest value" of 'x' and 'y'.
            3.  "Math.sqrt(x)"   :-  This method returns the square root of x.
            4.  "Math.abs(x)"    :-  This method returns the absolute (positive) value of x.
            #.  There is also one function that is uses for "Random Numbers", this uses a method as given below :-
                "Math.random()"  :- It returns a Random number between 0.0 (inclusive), and 1.0(exclusive).
                                    But to get more control over the random number,
                                    Let's Take Example, To print a random number between 0 to 100, We can use this formula
                                    "<data_type> <variable_name> = (<data_type)(Math.random() * 101)" ;
        */

        // int x , y;
        System.out.println(Math.max(5,10));
        System.out.println(Math.min(5,10));
        System.out.println(Math.sqrt(625));
        System.out.println(Math.abs(-4.7));

        // Used for Random Numbers 
        System.out.println(Math.random());  // Always Choose the value from "0.0(inclusive)" to "1.0(exclusive)"

        // Random Numbers with control
        int randomNum  = (int)(Math.random() * 101);    // This will print the numbers between 0 to 100
        System.out.println(randomNum);

// ------------------------------------------------------------------------------------------------------------------------

        // ----------------------------------------Java Booleans-----------------------------------------------------------
        // A boolean type is declared with the "boolean keyword" can only take the values "true" or "false" : 
        
        /*  
            This is useful to build logic, and find answers. We can use it for conditional testing. For example,
            Comparision Operators like "==", "<=", ">=","!=" etc.
        */

        int x1 = 5;
        int y1 = 9;
        System.out.println(x1 > y1);
        // or
        System.out.println(5 > 9);
        System.out.println(x1 == 5);
        System.out.println(x1 == y1);

// -----------------------------------------------Real Life Examples---------------------------------------------------------
        //  For calculating age of any user or may be to check eligibility or anything where we have to use 
        //  either "comparision operators" or "any conditional operators". In these cases for Realtime or Real life Examples we cann use boolean data types
         


    }
    
}
