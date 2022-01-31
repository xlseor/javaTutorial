public class finalAttrObj{
    final int x = 9;

    public static void main(String[] args){
	finalAttrObj myObj = new finalAttrObj();
	myObj.x = 25;
	System.out.println(myObj.x);
    }
}
