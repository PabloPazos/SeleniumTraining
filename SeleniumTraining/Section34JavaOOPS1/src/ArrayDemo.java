// Arrays.
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* int a;
		   a = 4;
		   
		   - A container which stores multiple values of same data type.
		*/
		
		//Declares an array and allocates memory for the values.
		int a[] = new int[5];
		
		//Initialized values into array
		a[0] = 2; 
		a[1] = 6;
		a[2] = 1;
		a[3] = 9;
		a[4] = 12;
		
		for(int i=0; i<a.length; i++) {
			System.out.println("En la posicion " + (i+1) + ": " + a[i]);
		}
		
		/*
		  -------------------------------------------------------------------
		  De forma más práctica
		  -------------------------------------------------------------------
		*/
		int b[] = {1,4,3,5,7,8};
		
		for(int i=0; i<b.length; i++) {
			System.out.println("En la posicion " + (i+1) + ": " + b[i]);
		}

	}

}
