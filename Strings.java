// Strings in Java 

public class Strings {
    public static void main(String[] args){

        // Strings are anything that is inside the Quotation.
        // A String variable contains a collection of characters surrouded by double quotes, as given below :-
        String Name = "Shivansh" ;
        System.out.println(Name);

        /* String Length :- A String in java is actually an object, which contain methods that can perform certain operations 
                            on strings.
                            By using "length()" method, we can find length of string in java.

        */
        System.out.println("The Length of String 'Name' is :- " + Name.length());

        /* MORE STRINGS METHODS :-  There are many string methods available, such as :-
                                    1. toUpperCase()    :- To make all characters in uppercase
                                    2. toLowerCase()    :- To make all characters in lowercase
                                    3. indexOf()        :- Finding a character in a string
        */

        String name = "Ram is good Player" ;
        System.out.println("In Uppercase, the string is :- " + name.toUpperCase());
        System.out.println("In Lowercase, the string is :- " + name.toLowerCase());
        System.out.println("To Find the character in given string :- " + name.indexOf("good"));

        /* Java String Concatenation :- The '+' operator can be used between strings to combine them. This is called
                                        "concatenation".
                                        We can also use "concat()" method to concatenate two strings.
        */
        String firstName = "Shivansh" ;
        String lastName = "Tiwari" ; 
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(lastName));

        /*  JAVA NUMBERS and STRINGS :- "Adding Numbers and Strings", it means :
                                        1.  When we add two numbers, then result will be a number and this is known 
                                            as addition.
                                        2.  When we use '+' operator between two strings, then result will be string 
                                            and it is known as concatenation.          
        */

        int x2 = 10, y2 = 20 ;
        System.out.println(x2 + y2); // Its Result will be Integer not String.

        String x3 = "10", y3 = "20" ;
        System.out.println(x3 + y3); // Its Result will be string not an Integer. 
         
        // But if We Add one Number and one String, the Result will be a string concatenation.

        String x4 = "Shiv" ;
        int y4 = 20;
        System.out.println(x4 + y4);

        // But if We Multiply a String with a Number say 'n' then String is repeated 'n' times, This is known as 
        // Replication.

        System.out.println(y4 * 4);   // This is Normal Multiplication
        String NAME = "Shiv" ;
        System.out.println(NAME.repeat(5));


    }
}





