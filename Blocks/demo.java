package Blocks;

public class demo {

    /*
     * STATIc BLOCK
     * whenever class is compiled static blocks are executed first becos static
     * blocks or variables are initiated when the class is loaded into JVM
     */

    static {
        demo d = new demo();
        d.hashCode();
        System.out.println("Hello i am from static block");
    }

    /*
     * The below code with the braces is called as instance block
     * It will automaticlly get executed when we create object for the class
     * 
     * for suppose when we create constructor for the object which will get executed
     * first? block or constructor
     * Instance block will get executed first rather than constructor
     * Blocks are having more priority than constructors
     * 
     */
    {
        System.out.println("i am from instance block ");
    }

    public demo() {
        System.out.println("i am from constructor ");
    }

    public static void main(String[] args) {
        // demo d = new demo();
        System.out.println(" hello i am from main method");
        // demo d = new demo();
    }

}

/*
 * When to go for blocks ?
 * STATIC BLOCK *
 * When you want to execute some piece of code before the main method is
 * executed then we need to go for Static block
 * Static block will be executed when the class is loaded
 ** INSTANCE BLOCK
 * When you want to execute some piece of code when you create the object you
 * need to go for INSTANCE block
 */

/*
 * STATIC CONTROL FLOW
 * If we want to access instance variables or methods in instance block in
 * static block we need to create object in the static block then
 * only we can access
 * 
 * Static members can be accessed directly in instance area directly becoz
 * memory is already created/allocated for the static members
 * at the time of class loading
 */