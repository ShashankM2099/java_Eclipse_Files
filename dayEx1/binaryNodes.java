package dayEx1;

//import javax.xml.soap.Node;

public class binaryNodes {
	static class Node {
		// makking static variables nodes...left child and right child setting to nul
		Node leftChild;
		Node rightChild;
		int data;

		public Node(int data) {
			this.leftChild = null;
			this.rightChild = null;
			this.data = data;
		}
	}

	public static int CountingNodes(Node rootNumbers) {
		if (rootNumbers == null) {
			return 0;

		}

		return 1 + CountingNodes(rootNumbers.leftChild) + CountingNodes(rootNumbers.rightChild);

	}

	public static int depthNode(Node nodeDepth) {
		if (nodeDepth == null) {
			return 0;

		} else {
			int leftDepth = depthNode(nodeDepth.leftChild);
			int rightDepth = depthNode(nodeDepth.rightChild);
			if (leftDepth > rightDepth)
				return (leftDepth + 1);
			else
				return (rightDepth + 1);

		}

	}

}
