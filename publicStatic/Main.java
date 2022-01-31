public class Main{
    //static method
    static void myStaticMethod() {
	System.out.println("Static methods can be called without creating objects.");
    }

    // Public method
    public void myPublicMethod() {
	System.out.println("Public methods must be called by creating objects.");
    }

    //Main method
    public static void main(String[] args){
	myStaticMethod();
	//	myPublicMethod();

	Main myObj = new Main();
	myObj.myPublicMethod();

    }
}
