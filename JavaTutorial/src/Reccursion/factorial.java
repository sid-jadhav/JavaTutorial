package Reccursion;

public class factorial {
	public int fact(int val){	
		if(val<=1)
			return 1;
		else 
		return (val*fact(val-1));
	}
	}

