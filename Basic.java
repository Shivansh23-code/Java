// Every Java Program must have a class and the name of class should be name of the file and having first letter
// in uppercase
public class Basic {
    // this is main function of java 
    public static void main(String[] args) {
    // This is "Text section" 
        // // This is used to print anything in java
        // // As we're using 'println()' method, it will print each time in next line whenever we use it 
        System.out.println("Hello,World!");
        System.out.println("I am learning Java.");
        System.out.println("It is awesome!"); 

        // // But if we use 'print()' method then it will print on same line until we use next line character 
        System.out.print("Hi, Nice to meet you! \t"); // We use tab space character as '\t'
        System.out.print("I am Shivansh"); // if we dont use nextline character in this, then next println or print method will print in same line 
        // But inside method if we're using nextline "\n" character then it will print in nextline

        // This is number section
        // to print number we use same 'println()' method but without double qoutes inside this
        System.out.println(3);
        System.out.println(2454); 

        // We can also perform mathematical calculations inside the "println()" method
        System.out.print(3+30+" ");
        System.out.print(30/10+" ");
        System.out.print(3*3+" ");
        System.out.print(30-10+" ");

        

    }
}