package dayEx1;

//import dayEx1.*;
import dayEx1.binaryNodes.Node;

public class countingNodes 
{
	public static void main(String[] args) 
	{
		// TODO Generated Comments
		// binaryNodes node1 = new binaryNodes();
		Node root = new Node(3);
		root.leftChild = new Node(4);
		root.rightChild = new Node(77);
		root.leftChild.leftChild = new Node(88);
		root.rightChild.rightChild = new Node(199);
		root.rightChild.leftChild = new Node(33);
		root.rightChild.rightChild.rightChild = new Node(200);
		root.rightChild.rightChild.leftChild = new Node(20);
		root.rightChild.rightChild = new Node(2010);
		// You can add more nodes by adding root. left or right child and setting them to new node with a number
		System.out.println("Number of nodes in the Binary Tree are: "+ binaryNodes.CountingNodes(root));
		System.out.println("Depth of the nodes in the tree are : "+ binaryNodes.depthNode(root));

	}

}
