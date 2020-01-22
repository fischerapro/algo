package cours;
public class Exos {

	// Main 
	public static void main(String[] args) {
		
		int list[] = {1,2,5};
		String listString[] = {"aaa","bbb","ccc"};
		display(listString);
		//System.out.println("isEmpty = " + isEmpty(listString));
		//System.out.println("isSorted = " + isSorted(list));
		//System.out.println("min = " + minimum(list));
	}
	# zone 
	// Display Int Array
	public static void display(int[]list) {
		    for (int i=0; i<list.length; i++) 
		    { 
		        System.out.println(list[i]);
		    }
	    }
	
	// Display String Array
		public static void display(String[]list) {
			    for (int i=0; i<list.length; i++) 
			    { 
			        System.out.println(list[i]);
			    }
		    }
	
	// Return minimum number of array transmitted   
	public static int minimum(int[]list) {
		if(list.length == 0)
			return -1;
		int minimum = list[0];
	    for (int i=0; i<list.length; i++) 
	    { 
	        if(list[i] < minimum) {
	        	minimum = list[i];
	        }
	    }
	    return minimum;
    }
	
	// Return isEmpty - String Array
    public static boolean isEmpty(String[]list) {
			
      int numNull = 0;
	      for (int i=0; i<list.length; i++) 
	    { 
	        if(list[i] == "")
	        {
	        	numNull += 1;
	        }
	          
	    }
	    if(numNull == list.length)
        {
           return true;
        }
	    else
        {
           return false;
        }
		
	}
    
    // Return isEmpty - Int Array
    public static boolean isEmpty(int[]list) {
		
        int numNull = 0;
  	      for (int i=0; i<list.length; i++) 
  	    { 
  	        if(list[i] <= 0)
  	        {
  	        	numNull += 1;
  	        }
  	          
  	    }
  	    if(numNull == list.length)
          {
             return true;
          }
  	    else
          {
             return false;
          }
  		
  	}
    
    public static boolean isSorted(int[]list) {
		boolean isSorted = true;
	    for (int i=0; i<list.length-1; i++) 
	    { 
	    	if(list[i] >= list[i+1])
	    	{
	    		isSorted = false;
	    	}
	    		
	    }
	    return isSorted;
    }
}
