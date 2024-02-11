public class Variables {
    public static void main(String[] args){
        // Declaring (Creating) Variables
        // Basic Syntax for Variabls are :- "type variablename = value ;"
        // We can declare a variable without assigning the value

        // Creating Variable for text storing
        String name = "Shivansh";
        System.out.println(name);
// -----------------------------------------------------------------------------------------------------------------
        // Creating Variable for number storing
        int a = 23;
        System.out.println(a);

        // Declaring variable without Assigning and then Printing it
        int b;
        b = 4;
        System.out.println(b); 

        // If we assign new value to existing variable then new value is overrite to previous value
        // Its syntax is "exixted_variable_name = value;"
        b = 22; // Now "b" is "22" not "4"
        System.out.println(b);

// -----------------------------------------------------------------------------------------------------------------

        /*
            If anyone doesnot wants to overwrite previous deaclared and assigned variable then
            we can use "final" keyword as it have syntax :- 
            "final <datatype> <variable_name> =
            value; ", its explanation is given below :-
        */
        final int c = 2002;
        System.out.println(c);
        // c = 2; This will raise error as final variable cannot be assigned with different value
        // System.out.println(c);

// -----------------------------------------------------------------------------------------------------------------

        // Demonstrating other types of variables :-
        /*
            As we know that we have following type of variables :-
            1. String
            2. int
            3. char
            4. float
            5. boolean
            Below are the examples :-
        */ 
        String one = "Ram";
        System.out.println(one);
        int x = 1995;
        System.out.println(x);
        float y = 23.01f; // Always use 'f' postfix for any type of floating point number
        System.out.println(y);
        char S = 'J';
        System.out.println(S);
        boolean myText = true;        
        System.out.println(myText);

// -----------------------------------------------------------------------------------------------------------------

        // Combining both text and a variable, with using "+" character :-
        // We ahve already assigned name variable with value of Shivansh, So we're using it :-
        System.out.println("Hello" + name);

        // We can also follow the pattern of adding multiple variables using "+" operator, 
        // this is known as 'concatenation' for strings only.
        // For 'Strings', this '+' operator is known as Concatenation Operator

        String firstName = "Shivansh" ;
        String lastName = "Tiwari" ;  
        String fullName = firstName + lastName ;
        System.out.println(fullName);

        // For integers, this '+' operator is always used as mathematical operator, Below is the Illustration :-
        int p = 5; 
        int q = 45;
        System.out.println(p+q); // It will print the value of x + y

// -----------------------------------------------------------------------------------------------------------------

        // Declaring Many Variables...
        /* 
            To declare more than one variable of the "same datatype", We can use a comma-separated list :-
            #. Instead of writing this block :-
                int x = 5;
                int y = 6;
                int z = 9;
            So, We can write this in single line instead of block, As given below :-
        */
    
        int A = 5, B = 6, C = 9;
        System.out.println(A + B + C);

        // We can also assign one value to multiple variables, As given Below :-
       int X,Y,Z;
       X = Y = Z = 50;
       System.out.println(X + Y + Z);
// -----------------------------------------------------------------------------------------------------------------

        /*
            JAVA IDENTIFIERS :- ALl 'java variables' must be identfied with "unique names", these names are generally,
                                refered as "Identifiers".
                                Identifiers can be "short names (like x & y)" or "more descriptive names (age,sum etc.)"
                                We have two examples for short name and as well as descriptive names...
        */

        // GOOD
        int minutesperhour = 60;
        System.out.println(minutesperhour);
        //  NOT necessary to understand what is this variable...
        int g = 50;
        System.out.println(g);

        /*
            Here are the general rules for naming variables are :-
            1. Names can contain "letters, digits, underscores, and dollar signs".
            2. Names must "begin with a letter".
            3. Names "should start with a 'lowercase letter' and it 'cannot contain whitespace'".
            4. Names can also begin with "$ and _".
            5. Names are case sensitive ("myVar" and "myvar" are different variables).
            6. Reserved words are (like Java Keywords,  such as 'int' or 'boolean') cannot be used as names.

         */




    } 
}
