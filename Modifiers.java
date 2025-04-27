package Sample;

// User-defined class
class Modi {

    public int a = 100;        // Public - accessible anywhere
    protected int b = 200;     // Protected - accessible within package and subclasses
    int c = 300;               // Default (no modifier) - accessible within package
    private String d;          // Private - accessible only within this class

    // Getter method for 'd'
    public String getName() {
        return d;
    }

    // Setter method for 'd'
    public void setName(String d) {
        this.d = d;
    }
}

// Main class
public class Modifiers {

    public int a = 100;         // Public variable
    protected int b = 200;      // Protected variable
    int c = 300;                // Default variable
    private String d = "Sudhakar"; // Private variable

    public static void main(String[] args) {

        // Main class object
        Modifiers m = new Modifiers();
        System.out.println("Main Class:");
        System.out.println("a value: " + m.a);
        System.out.println("b value: " + m.b);
        System.out.println("c value: " + m.c);
        System.out.println("d value: " + m.d);

        // User-defined class object
        Modi m1 = new Modi();
        System.out.println("\nUser-Defined Class:");
        System.out.println("a value: " + m1.a);
        System.out.println("b value: " + m1.b);
        System.out.println("c value: " + m1.c);
        m1.setName("Sudhakar");
        System.out.println("d value: " + m1.getName());
    }
}
