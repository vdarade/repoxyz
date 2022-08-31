package program;

import java.util.Arrays;
import java.util.Collections;

public class Demo6 {

	public static void main(String[] args) {
		 // Initializing array of integers
		Integer [] a= {4,7,9,3,2,78};
		
		  // using Collections.max()
        // to find maximum element
        // using only 1 line
		
	int max=	Collections.max(Arrays.asList(a));
	
	 // using Collections.min() to
    // find minimum element
    // using only 1 line.
	int min=	Collections.min(Arrays.asList(a));
	
	System.out.println("max no in array :"+max);
	System.out.println("min no in array :"+min);

	}

}
