// In this section we will discuss about "Data Types in Java".
public class Data_Types {
    public static void main(String[] args){
        
        // As we know, a "variable" in java must be a "specified data type" :-
        // Below is the illustration of above statement :- 
        int first = 23 ; // This is integer type variable
        float second = 23.01f ; // This is float type variable
        char third = 'S'; // This is char type variable
        String name = "Shivansh" ; // This is String type variable.This is primitive and only data type in this category that refers to object.
        boolean fourth = true ; // This is boolean type variable

        // Calling these above variables...
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(name);
        System.out.println(fourth);

        /* 
            Data Types are divided in two groups :-
            1. Primitive Data Types - include "Size in'[...bytes...]"
                'byte[1]', 'short[2]', 'int[4]', 'long[8]', 'float[4]', 'double[8]', 'boolean[1]' and 'char[2]'.
            2. Non-Primitive Data Types - such as 'String', 'Arrays' and 'Classes'.
        */
// ----------------------------------------------------------------------------------------------------------------
        
// In this section we will discuss about "Numbers",

        /*
            There are two types of primitive number datatype :-
            1. Integer Types :- Stores Whole Number, that may be positive or negative and without decimals
            2. Floating point Types :- Stores only numbers with fractional part, containing one or more decimals.
                                        There are two types :- 
                                        1. Float
                                        2. Double
        */
// ----------------------------------------------------------------------------------------------------------------
    
        /*  Integer Types :-
                1. Bytes :- This data type can store whole numbers from "-128 to 127".Its size is 1 byte.
                            We can use it instead of "int" or other types to save memory when our value will be within
                            "-128 to 127".
                            Its syntax :- "byte <variable_name> = <value>".

                2. Short :- The "short" data type can store whole numbers from -32768 to 32767.Its size is 2 bytes.
                            Its syntax :- "short <variable_name> = <value>".

                3. Int   :- This data type can store whole numbers from "-2147483648 to 2147483647".Its size is 4 bytes.
                            Generally this is preferred during creation of any integer variable.
                            Its syntax :- "int <variable_name> = <value>".

                4. Long  :- The 'long' data type can store whole numbers from "-9223372036854775808 to 9223372036854775807".
                            This is used when "int" is not capable to store values more than its size.
                            Its syntax :- "long <variable_name> = <value>".
        */

        // Below is the above illustration :-
        byte myNum = 100;
        System.out.println(myNum);
        short num1= 10000;
        System.out.println(num1);
        int num2 = 465486712;
        System.out.println(num2);
        long num3 = 154454321154L; // Postfix 'L or l' used for long integer data types
        System.out.println(num3);

// -----------------------------------------------------------------------------------------------------------------

        /*  Floating Point Types :-
                We have Two types of floating point, that are "float" and "double".
                They can store only fractional or decimal numbers. While Declaration,
                we should end the value with 'f' floats and 'd' for foubles.
            1. Float having Syntax :- "float <Variable> = <Value>f".It has precision of only '6' digits.
            2. Double having Synatx :- "double <Variable> = <Value>d".It has precision of about '15' digits.That's
                                        why it is safer to use 'double' for most calculations.
        */

        // Below is the Illustrations...
        float A = 23.01f; // Value are Ending with 'f'
        double B = 23.012001d; // Value are Ending with 'd'
        System.out.println(A);    
        System.out.println(B);

// -----------------------------------------------------------------------------------------------------------------

        /*  Scientific Numbers  :-  This is also a floating point number with an "e" or "E" to indicate the power 
                                    of 10.Never this can be a Integer data type value.
                                    For example "3.6 * 10^2" can be written as "3.6e2f" or "3.6E2d".

        */

        float f1 = 35e1f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);

// -----------------------------------------------------------------------------------------------------------------

        /*  Boolean Data Type   :-  Generally in programming, we have to select only one from the two option just like 
                                    1. 'True' or 'False'
                                    2. 'Yes' or 'No'
                                    3. 'On' or 'Off'
                                    For this Java has a boolean data type, which can only take these values "true" or
                                    "false".
        */

        boolean isJavaFun = true;
        boolean isHappy = false;
        System.out.println(isJavaFun);
        System.out.println(isHappy);


// -----------------------------------------------------------------------------------------------------------------

        /*  The main difference between primitive and non-primitive data types are :-

                1.  Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer 
                    and is not defined by Java (except for String).
                2.  Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
                3.  A primitive type has always a value, while non-primitive types can be null.
                4. A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.

        */

    }    
}
