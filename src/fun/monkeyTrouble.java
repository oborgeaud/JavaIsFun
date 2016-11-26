package fun;

public class monkeyTrouble {
	
	boolean aSmile, bSmile, trouble;
	
	public monkeyTrouble(){
		
	}
	
	public boolean inTrouble(boolean _aSmile, boolean _bSmile) {
		
		aSmile = _aSmile; 
		bSmile = _bSmile;
		
		if (aSmile == true && bSmile == true) 
			trouble = true;
		
		else if (aSmile == false && bSmile == false)
			trouble = true;
		else
			trouble = false;
		return trouble;
		
		// return (aSmile == aSmile);
		
	}

}
