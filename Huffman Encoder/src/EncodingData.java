public class EncodingData {
/**
 * Initializing symbol and Encoding
 */
    private char symbol;
    private String encoding;
    /**
     * 
     * @param symbol
     * @param encoding
     */
    public EncodingData( char symbol, String encoding) {
	this.symbol = symbol;
	this.encoding = encoding;
	
    }

    
    /**
     *@return symbol 
     */
    // Getter and setter methods for symbol
    public char getSymbol() {
	return symbol;
    }
    /**
     * @param char s
     */
    public void setSymbol(char s) {
	symbol = s;
    }
    
   
    /**
     * Getter and setter method for encoding
     * @return encoding
     */
    public String getEncoding() {
	return encoding;
    }
    /**
     * 
     * @param String e
     */
    public void setEncoding(String e) {
	encoding = e;
    }
    
    
    /**
     *  Determines if two EncodingData objects are equal based on the symbol
     *  @param Object 
     *  @return Boolean - True of False
     */
    public boolean equals(Object obj)
    {
	EncodingData other = (EncodingData) obj;
	if (symbol != other.getSymbol())
		return false;
	return true;
    }
    /**
     * @return String representation of the symbol and its Huffman code
     */
    public String toString() {
	
	String s = "";
	s = "(" + Character.toString(symbol) + ", " +  //changes
        Integer.toString(symbol) + ")\n" ;
	return s;
    }
    
}
