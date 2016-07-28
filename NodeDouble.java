package Single;

/*
 * Node of doubly linked list that contains two pointers next and previous
 */
public class NodeDouble<T> {

	public T data;
	NodeDouble<T> next, previous;

	public NodeDouble() {

		data = null;
		next = null;
		previous = null;

	}
}
