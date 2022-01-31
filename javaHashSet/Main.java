import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
	HashSet<String> mountains = new HashSet<String>();
	mountains.add("Catoctin");
	mountains.add("Kanchenjunga");
	mountains.add("K2");
	mountains.add("Hood");
	mountains.add("Uluru");
	System.out.println(mountains);
	System.out.println(mountains.contains("Hood"));
	System.out.println(mountains.contains("Matterhorn"));
	mountains.remove("Hood");
	System.out.println(mountains.contains("Hood"));
	System.out.println(mountains.size());

	for (String i : mountains) {
	    System.out.println(i);
	}
	
	mountains.clear();
	System.out.println(mountains);
    }
}

