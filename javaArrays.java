public class javaArrays{
    public static void main(String[] args){
	String[] rocks = {"lignite", "gneiss", "opal", "micah"};
	System.out.println(rocks[2]);
	System.out.println("looping through rocks.");
	for(int i=0; i<4; i++){
	    System.out.println(rocks[i]);
	}
	System.out.println("rocks length:");
	System.out.println(rocks.length);
	System.out.println("looping through the array with for:each");
	for (String j : rocks){
	    System.out.println(j);
	}
	System.out.println("multidimensional array of integers:");
	int[][] numbers = {{1,2,3,4},{5,6,7,9}};
	for (int k = 0; k<2; k++){
	    for (int p = 0; p<4; p++){
		System.out.println(numbers[k][p]);
	    }
	}
    }
}
