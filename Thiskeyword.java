package co;
	
	class Student {
	    String name;
	    int age;

	    
	    Student(String name, int age) {
	        this.name = name;  
	        this.age = age;
	    }

	   
	    Student() {
	        this("Unknown", 0);  
	    }

	    // . Using 'this' to call an instance method
	    void display() {
	        System.out.println("Name: " + this.name);
	        System.out.println("Age: " + this.age);
	    }

	    // . Using 'this' as a method argument
	    void showDetails(Student obj) {
	        System.out.println("Student Details: " + obj.name + ", " + obj.age);
	    }

	    void passCurrentInstance() {
	        showDetails(this);  // Passing the current object
	    }
	

	// Main class
	public class Thiskeyword {
	    public static void main(String[] args) {
	       
	        Student s1 = new Student("shivangi", 22);
	        s1.display();

	        System.out.println();

	       
	        Student s2 = new Student();
	        s2.display();

	        System.out.println();

	        // Passing current instance using 'this'
	        s1.passCurrentInstance();
	    }
	}
	}


