public class conParams {
    int x;

    public conParams(int y) {
	x = y;
    }

    public static void main(String[] args){
	conParams myObj = new conParams(5);
	System.out.println(myObj.x);
	conParams obj2 = new conParams(2);
	System.out.println(obj2.x);
    }
}
