public class HuffmanPair implements Comparable<HuffmanPair> {
	
	private char symbol;
	private int frequency;
	
	public HuffmanPair(int f) {
		
		setSymbol((char)0);
		frequency = f;
		
	}
	
	public HuffmanPair(char c, int f) {
		setSymbol(c);
		frequency = f;
	}
	

	public char getCharacter() {
		
		return getSymbol();
	}
	
	public int getFrequency() {
		
		return frequency;
	}
	
	public void setCharacter(char c) {
		
		setSymbol(c);
	}
	
	public void setFrequency(int f) {
		
		frequency = f;
	}
	
	public void incrementFrequency() {
		
		frequency += 1;
	}
	
	public int compareTo(HuffmanPair otherPair) {
		
		return this.frequency - otherPair.getFrequency();
	}

	public boolean equals(Object obj) {
		
		HuffmanPair other = (HuffmanPair) obj;
		if (getSymbol() != other.getSymbol())
			return false;
		return true;
	}

	public String toString() {
		
		String s = "";
		s = "(" + Character.toString(getSymbol()) + ", " + 
Integer.toString(frequency) + ")\n" ;
		return s;
	}

	public char getSymbol() {
		return symbol;
	}

	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}

	
}

