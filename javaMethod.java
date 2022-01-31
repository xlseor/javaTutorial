public class javaMethod {
    static void myMethod(){
	    System.out.println("I just got executed!");
	}
    public static void main(String[] args){
	for(int i=5; i>0; i--){
	    myMethod();
	}
    }	
}
