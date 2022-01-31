public class finalAttr{
    final int x = 34;

    public static void main(String[] args){
	finalAttr myObj = new finalAttr();
	myObj.x = 25;
	System.out.println(myObj.x);
    }
}
