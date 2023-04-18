// Create a Main class
public class myClass {
    // Create a class attribute integer called x
    int x;
    // Create a class constructor for the Main class
    public myClass () {
        // Set the initial value for the class attribute x as 5
        x = 5;
    }
    //Add a main method
    public static void main(String[] args) {
        // Create an object of class Main (This will call the constructor) called myObj
        myClass myObj = new myClass();
        // Print the value of x by calling t method myObj
        System.out.println(myObj.x);
    }
}
