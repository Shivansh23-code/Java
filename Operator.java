/*------------------------------------------ JAVA OPERATORS ------------------------------------------ */
public class Operator {
    public static void main(String[] args) {
        // In This section, We will Discuss about "Java Operators"
        /* Java Operators :-    Operators are used to perform operations on variables and values.
                                We have Following types of operators in java :- 
                                1.  Arithmetic Operators
                                2.  Assignment Operators
                                3.  Comparision Operators
                                4.  Logical Operators
                                5.  Bitwise Operators
        */
        
        System.out.println("This is Operator Section, Let's Go...");
        /*  Arithmetic Operators :- are used to perform common mathematical operations.
            These are of following types :- 
                        1.  Addition "+"        :-  Adds together two values "(x + y)"
                        2.  Subtraction "-"     :-  Subtracts one value from another "(x - y)"
                        3.  Multiplication "*"  :-  Multiplies two values "(x * y)"
                        4.  Division "/"        :-  Divides one value by another "(x / y)"
                        5.  Modulus "%"         :-  Returns the Division remainder "(x % y)"
                        6.  Increment "++"      :-  Increases the value of a variable 'by 1' "( ++x )"
                        7.  Decrement "--"      :-  Decreases the value of a vraiable 'by 1' "( --x )"
        */

        int a = 5, b = 10;
        System.out.println(a+b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(b % a);
        System.out.println(++a);            
        System.out.println(--a);        

        /*  Java Assignment Operators :- This is used to "assign values" to variables.
            There are various types of assignment operators, some of them are given below :-
            "   '=','+=','-=','*=','/=','%=','&=','|=','^=','>>=','<<='   "
        */

        System.out.println("Illustrations for Assignment operators...");
        int x = 5;  //This is simple assignning the value '5' to variable 'x'
        System.out.println(x);
        x += 5;     // This way of operation is used to "ADD" some value to 'x' with existing previous value
        System.out.println(x);
        x -= 4;     // This way of operation is used to "SUBTRACT" some value to 'x' with existing previous value
        System.out.println(x);
        x *= 4;     // This way of operation is used to "MULTIPLY" some value to 'x' with existing previous value
        System.out.println(x);
        x /= 2;     // This way of operation is used to "DIVIDE" some value to 'x' with existing previous value
        System.out.println(x);
        x %= 9;     // This way of operation is used to "GET REMAINDER" from some value to 'x' with existing previous value
        System.out.println(x);
        x &= 3;     // This way of operation is used to "VERIFY BOTH OPERANDS" for some value to 'x' with existing previous value
        System.out.println(x);
        x |= 3;     // This is "LOGICAL 'OR' OPERATOR" used in Java
        System.out.println(x);
        x ^= 3;     // This is "LOGICAL XOR OPERATOR" used in Java
        System.out.println(x);
        x >>= 4;    // This is used to check whether the previous value is greater or not from given constant value
        System.out.println(x);
        x <<= 3;    // This is used to check whether the previous value is smaller or not from given constant value
        System.out.println(x);

        /* JAVA COMPARISION OPERATORS   :-  Used to compare two values (or variables). This is important because it
                                            helps to find answers and make decisions.
                                            The 'return value' for comparision is either "true" or "false".
                                            These values are known as Boolean Values. 
            Types :- 
                    1. Equal to     :-   "==" to check equaltiy between two values of variables
                    2. Not equal to :-   "!=" to check unequality between two values of variables
                    3. Greater than :-   ">" to check between two values, which is greater
                    4. Less than    :-   "<" to check between two values, which is smaller
                    5. Greater than or equal to :-  ">=" 
                    6. Less than or equal to    :-  "<="
        */
        int m = 5;
        int n = 6;
        System.out.println(m == n);            
        System.out.println(m != n);        
        System.out.println(m > n);        
        System.out.println(m < n);        
        System.out.println(m >= n);        
        System.out.println(m <= n);        

        /*  LOGICAL OPERATORS   :-  We can also test for 'true' or 'false' values with Logical Operators.
                                    Logical operators are used to determine the logic between variables or values :-
                                    1. LOGICAL AND :- "&&" Returns true if both statements are true.
                                    2. LOGICAL OR  :- "||" Returns true if one of the statement is true.
                                    3. LOGICAL NOT :- "!"  It reverse the result, returns false if the result is true.
        */

        int x1 = 10;

        System.out.println(x1 < 5 && x1 >8);
        System.out.println(x1 <5 || x1 < 4);
        System.out.println(!(x1 < 5 && x1 >8));



    }
}