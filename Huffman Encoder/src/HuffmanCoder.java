import java.util.Iterator;

public class HuffmanCoder {
	/**
	 * Constructor initalizes hufftree and encoding list
	 */
	    private HuffmanTree huffTree;
	    private ArrayUnorderedList<EncodingData> encodingList;
	    /**
	     * 
	     * @param pairsList
	     */
	    public HuffmanCoder(ArrayOrderedList<HuffmanPair> pairsList){
	        huffTree = new HuffmanTree(pairsList);
	        encodingList = new  ArrayUnorderedList<EncodingData>();
	        buildEncodingList(huffTree.getRoot(),"");
	       
	    }
	    /**
	     * 
	     * @param String code
	     * @return Character
	     * Method for decoding 
	     */
	   	public char decode(String code){
	   	
	   		//convert String to char[] array
	     //   char[] chars = code.toCharArray();
	        BinaryTreeNode<HuffmanPair> root = huffTree.getRoot();
	      
	       // String[] str = new String[code.length()];
	       
	        for(int i =0; i<code.length();i++) {
	        	//String string = str[i];
	        	char ch =  code.charAt(i);
	        	//if its a 0 get the left location
	        	if(root.isLeaf()==true) 
	        		 return (char)0;
	        	else if(ch == '0'){
	               root =root.getLeft();
	            }
	            //if its a 1 get the right location
	            else if( ch == '1'){
	              root =  root.getRight();
	            }
	            //if its a rootleaf get the character
	            
	            }
	        
	           if(root.isLeaf() == true){
	                return root.getElement().getCharacter();
	        }
	        
	        return (char)0;
	    }
	        
	       
	       /* //iterate over char[] array using enchanced For loop or For Each loop
	      for(String ch: str ){
	        	//if its a 0 get the left location
	        	if(root.isLeaf()==true) 
	        		 return (char)0;
	        	else if(ch == '0'){
	               root =root.getLeft();
	            }
	            //if its a 1 get the right location
	            else if( ch == '1'){
	              root =  root.getRight();
	            }
	            //if its a rootleaf get the character
	            
	            }
	        
	           if(root.isLeaf() == true){
	                return root.getElement().getCharacter();
	        }
	        
	        return (char)0;
	    }
	    */
	   	/**
	   	 * 
	   	 * @param c
	   	 * @return
	   	 * @throws ElementNotFoundException
	   	 * 
	   	 */
	    public String encode(char c)throws ElementNotFoundException 
	    	{
	        //takes the specified character and returns the string representation of the
	        //binary Huffman encoding of that character
	    	String s = String.valueOf(c);
	    	Iterator<EncodingData> list ;
	    	list = encodingList.iterator();
	    	while(list.hasNext())
	    	{
	    		EncodingData d = list.next();
	    		if (d.getSymbol()==c)
	    		return d.getEncoding();
	    		
	    	}
	    	throw new ElementNotFoundException("Was not found");}
			
		//	list = iteratorInOrder();
			//while (list.hasNext()) {
				//s += list.next().toString();
			
	  //@return a string representation of the encoding list.
	    /**
	     * @return String representation of the encoding list
	     */
	    public String toString(){
	        return "s";
	    }
	    
	    /**
	     * 
	     * @param node
	     * @param encoding
	     */
	    private void buildEncodingList(BinaryTreeNode<HuffmanPair> node, String encoding){
	        //build the unordered list encodingList
	 //       buildEncodingList(huffTree.getRoot(), null);
	        
	        if (node.isLeaf() == true){ //if leaf node
	           EncodingData data = new EncodingData(node.getElement().getCharacter(), encoding);
	           encodingList.addToFront(data);
	        }
	        
	        else{
	            buildEncodingList(node.getLeft(), encoding + '0');
	            buildEncodingList(node.getRight(), encoding + '1');
	        }   
	    }  
	}
/*  if(root.getLeft()==null && root.getRight()==null) {
System.out.println(root.getElement().toString().charAt(ch));

}*/



