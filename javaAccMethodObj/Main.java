public class Main{
    public void fullthrottle() {
	System.out.println("The car is going as fast as possible.");
    }

    public void speed(int maxSpeed){
	System.out.println("Max speed is: " + maxSpeed);
    }

    public static void main(String[] args) {
	Main myCar = new Main();
	myCar.fullthrottle();
	myCar.speed(200);
    }
}
