package Single;
public class NodeTree{

	/*
	 * Node of single linked list that contains two pointers next and previous
	 */
public int data;
NodeTree left,right;


public NodeTree(int value) {

data=value;
left=null;
right=null;
}
NodeTree()
{
	left=null;
	right=null;
}


}