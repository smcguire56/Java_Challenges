package ie.gmit.ch;

public class Challenge_1 {
	public static void main(String[] args) 
	{

	    System.out.println(find_missing(new int[]{1,2,3,5,6,7},
				new int[]{1,2,3,4,5,6,7}));
	    
	    System.out.println(find_missing(new int[]{5,6,7,8,9},
				new int[]{5,6,7,8,9,10}));
	    
	    System.out.println(find_missing(new int[]{1}, new int[]{0}));
  
	}
	
	public static int find_missing(int[] list1,int[] list2) {
	    int xor = 0;
		for(int i = 0; i < list1.length; i++){
	        xor^= list1[i];
	    }
	    
	    for(int i = 0; i < list2.length; i++){
	        xor^= list2[i];
	    }
	    return xor;
	}	
}
