import java.util.Random;

public class Die{

    private String type;
    private int numOfSides;
    private int currentSideUp;
	
	// 0 argument constructor
	public Die(){
		type = "D6";
		numOfSides = 6;
		currentSideUp = randomSideUp(1, 6);
	}
	
	// 1 argument constructor
	public Die(int numOfSide){
		this.type = "D" + numOfSide;
		this.numOfSides = numOfSide;
		this.currentSideUp = randomSideUp(1, numOfSide);
	}
	
	// 2 argument constructor
	public Die(int numOfSide, String type){
		this.type = "D" + type;
		this.numOfSides = numOfSide;
		this.currentSideUp = randomSideUp(1, numOfSide);
	}

    // accessors - get Methods
    public String getType(){ return type; }
    public int getNumOfSides(){ return numOfSides; }
    public int getCurrentSideUp(){ return currentSideUp; }
    
    // mutators - set methods
    public void setType(String name){
        type = name;
    }
	public void setNumOfSides(int numOfSides){
        numOfSides = numOfSides;
    }
    public void setCurrentSideUp(int upSide){
        currentSideUp = upSide;
    }
	
	public int randomSideUp(int min, int max){
		return new Random().nextInt(max - min + min) + min;
	}
}