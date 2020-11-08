import java.util.Iterator;
/**
 * 
 * @author Shehzer Naumani
 *Class obtains 4 constructors of which each initilize fields
 *and construct the actual huffmanTree
 */
public class HuffmanTree extends LinkedBinaryTree<HuffmanPair> implements Comparable<HuffmanTree> {
	/**
	 * Initialize fields
	 * Root, Pair, First/Second removal and BuildList
	 */
public HuffmanPair root;
public HuffmanTree pair;
public HuffmanTree firstRemoval;
public HuffmanTree secondRemoval;
ArrayOrderedList<HuffmanPair> BuildList;

/**
 * Constructor for empty tree
 */
	public HuffmanTree() {
		super();
	}
	/**
	 * 
	 * @param HuffmanPair pair1
	 */
	public HuffmanTree(HuffmanPair pair1) {
		super(pair1);
		
	}
	
/**
 * 
 * @param pair3
 * @param tree1
 * @param tree2
 */
	public HuffmanTree(HuffmanPair pair3, HuffmanTree tree1, HuffmanTree tree2) {
	super(pair3, tree1, tree2);
	
	}
	/**
	 * 
	 * @param pairsList
	 */
	public HuffmanTree(ArrayOrderedList<HuffmanPair>pairsList) {
	
	
		ArrayOrderedList<HuffmanTree> buildList = new ArrayOrderedList<HuffmanTree>();
		//System.out.println(pairsList.size());	
		/**
		 * Add huffmantrees to buildList
		 */
		for( HuffmanPair pair : pairsList ) {
				HuffmanTree node1 = new HuffmanTree(pair);
				buildList.add(node1);
				
			}
			//System.out.println(buildList.size());
			
			if(buildList.size() == 1) {
			//	HuffmanTree removal = buildList.removeFirst();
			//	int node = removal.getRoot().getElement().getFrequency();
			//	HuffmanPair newNode = new HuffmanPair(node);
			//	HuffmanTree tree = new HuffmanTree(newNode,removal,null);
			//	buildList.add(tree);
				this.setRoot(buildList.removeFirst().getRoot());
				return;
			}
		//removes left and right child and merges into parent child
		while(buildList.size()>1) {
			HuffmanTree leftChild = buildList.removeFirst();
			HuffmanTree rightChild = buildList.removeFirst();
			int FrequencyNode= leftChild.getRoot().getElement().getFrequency() +
					rightChild.getRoot().getElement().getFrequency();
			HuffmanPair makePair = new HuffmanPair(FrequencyNode);
			HuffmanTree huffTree = new HuffmanTree(makePair,leftChild,rightChild);
			buildList.add(huffTree);
			}
		super.setRoot(buildList.removeFirst().getRoot());

		
	}
	
	@Override
	/**
	 * @param otherTree
	 * @return integer D
	 */
	public int compareTo(HuffmanTree otherTree) {
		HuffmanPair obj1 = this.getRoot().getElement();
		HuffmanPair obj2 = otherTree.getRoot().getElement();
		int d= obj1.compareTo(obj2);
		return d;
	}
	/**
	 * @return String "s" after pre-order iteration
	 */
	public String toString() {
String s = "";
		
		Iterator<HuffmanPair> list ;
		
		list = iteratorPreOrder();
		while (list.hasNext()) {
			s += list.next().toString();
		}
		return s;
	}
	}


