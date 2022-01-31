import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
	ArrayList<String> cars = new ArrayList<String>();
	cars.add("Volvo");
	cars.add("BMW");
	cars.add("Ford");
	cars.add("Mazda");
	System.out.println(cars);
	System.out.println(cars.get(0));
	System.out.println(cars.get(2));
	cars.set(0,"Opel");
	System.out.println(cars);
	cars.remove(0);
	System.out.println(cars);
	for (String i : cars) {
	    System.out.println(i);
	}
	
	cars.clear();

	ArrayList<Integer> myNumbers = new ArrayList<Integer>();
	myNumbers.add(33);
	myNumbers.add(89);
	myNumbers.add(78);
	myNumbers.add(64);
	myNumbers.add(52);
	myNumbers.add(27);

	Collections.sort(myNumbers);

	for (int i : myNumbers){
	    System.out.println(i);
	}
    }
}


	
