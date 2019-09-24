public class Corgi extends Dog {

    // additional class variables
    // private access modifiers are used to promote encapsulation
    private int weight;
    private int age;

    // constructors
    /* Two constructors are defined.  The default constructor
     * takes no parameters and the parameterized constructor
     * incorporates the type, breed, name, weight, and age fields.
     * If any constructor is defined, the compiler does not implicitly define a 
     * default constructor.  Per zyBooks, best practice is to explicitly
     * define a default constructor and rely on method overloading 
     * for other constructors so that an object creation statement 
     * like Corgi corgi = new Corgi() without arguments remains
     * supported.  The compiler will throw an error if the 
     * default constructor is not defined and a call is made to it. 
     */    
    
    // default constructor
    /* int data types are typically initialized to -1 when
     * the method signature does not call for a parameter pertaining
     * to the initialization of the given field.
     */
    
    public Corgi() {
        // invoke Dog class (super class) constructor
        super();
        weight = -1;
        age = -1;
    }
    
    // parameterized constructor
    public Corgi(String type, String breed, String name, int pounds, int years) {

        // invoke Dog class (super class) constructor
        super(type, breed, name);
        weight = pounds;
        age = years;
    }

    // mutator methods
    
    // set the member field weight to the argument provided
    public void setWeight(int pounds) {
        weight = pounds;
        return; // good practice is to return even when
                // return type is void to clear the stack frame.
    }
    
    // set the member field age to the argument provided
    public void setAge(int years) {
        age = years;
        return;
    }

    // override toString() method to include additional dog information
    @Override
    public String toString() {
        return (super.toString() + "\nThe Corgi is " + age +
                " years old and weighs " + weight + " pounds.");
    }

}
