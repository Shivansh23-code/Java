// In this section, we will discuss about "Java Type Casting".
public class Java_Type_Casting {
    public static void main(String[] args){
        // Type Casting is when we assign a value of one primitive data type to another type.
        
        /*  In java, there are two types of casting :-
            1.  Widening Casting (automatically) :- converting a smaller type to a larger type size.
                " 'byte' -> 'short' -> 'char' -> 'int' -> 'long' -> 'float' -> 'double' "
            2.  Narrowing Casting (manually) :- converting a larger type to a smaller size type
                " 'double' -> 'float' -> 'long' -> 'int' -> 'char' -> 'short' -> 'byte' "
        */
        
        //  Below is the illustration for Widening Casting :-
        int myInt = 9;
        double myDouble = myInt;    // Automatic casting: int to double
        System.out.println(myInt);  //Outputs 9
        System.out.println(myDouble);   //Outputs 9.0

        // Below is the illustration for Narrowing Casting :-
        double A1 = 23.012001d ;
        int A = (int) A1;
        System.out.println(A1); // This gives Output 23.012001
        System.out.println(A);  // This gives Output 23 
        

    }
}
