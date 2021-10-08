import java.util.Random;

public class Die{

    private String name;
    private int numSides;
    private int currentSideUp;

	// constructor with no argument
    public Die() {
        name = "D6";
        numSides = 6;
        currentSideUp = 6;
    }

	// constructor with 1 argument
    public Die(int numSides) {
        this.numSides = numSides;
    }

	// constructor with 2 arguments
    public Die(int numSides, String name) {
        this.name = name;
        this.numSides = numSides;
    }

	// getters for name
    public String getName() {
        return name;
    }
	
	// setter for name
	public void setName(String name) {
        this.name = name;
    }
	
	// getter for numSides
    public int getNumSides() {
        return numSides;
    }

	// setter for numSides
    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

	// getter for currentSideUp
    public int getCurrentSideUp() {
        return currentSideUp;
    }

	// setter for currentSideUp
    public void setCurrentSideUp(int currentSideUp) {
        this.currentSideUp = currentSideUp;
    }

	/**
	* roll method generates a random integer value
	* and updates the currentSideUp variable
	*/
    public void roll(){
        currentSideUp = new Random().nextInt(numSides - 1 + 1) + 1;
    }
}
