package co.grandcircus.lists;

public class MyLinkedList implements MyList {

	// head is the first node in the list. if null, the list is empty.
	private Node head = null;
	// for convenience, keep track of how many items are in the list
	private int length = 0;

	@Override
	public void addAtBeginning(String data) {
		// add a new node and set it as the new head
		head = new Node(data, head);
		length++;
	}

	@Override
	public void removeFromBeginning() {
		// find the second node and set it as the new head
		head = head.getNext();
		length--;
	}

	@Override
	public void addAtEnd(String data) {
		// find the last node and, as its next node, set a Node with data and a null next
		getNodeAt(length - 1).setNext(new Node(data, null));
		length++;

	}
	
	@Override
	public boolean insertAt(int index, String data) {
		if (index < 0 || index > length) {
			// out of bounds
			return false;
		} else if (index == 0) {
			// head
			addAtBeginning(data);
		} else if (index == length) {
			// tail?
			addAtEnd(data);
		} else {
			// thorax? abdomen??
			Node newPreviousNode = getNodeAt(index - 1);
			newPreviousNode.setNext(new Node(data, newPreviousNode.getNext().getNext()));
			length++;
		}
		return true;
		
	}
	
	@Override
	public boolean removeAt(int index) {
		if (index < 0 || index > length) {
			// out of bounds
			return false;
		} else if (index == 0) {
			// head
			removeFromBeginning();
		} else if (index == length) {
			// tail?
			removeFromEnd();
		} else {
			// thorax? abdomen??
			Node nodePreviousToNodeToRemove = getNodeAt(index - 1);
			nodePreviousToNodeToRemove.setNext(nodePreviousToNodeToRemove.getNext().getNext());
			length--;
		}

		return true;
	}
	
	public void removeAll(Object o) {
		// Start at head
		Node node = head;		
		
		while (node.getData() != null) {
			if (node == head && node.getData() == o) {
				// Remove head if it has the specified data
				removeFromBeginning();
			
			} else if (node.getNext().getData() == o) {
				
				
				node.setNext(node.getNext().getNext());
				
				length--;
			}
			
				
		}
		
	}
		

	@Override
	public void removeFromEnd() {
		if (length < 2) {
			// The beginning is the end.
			removeFromBeginning();
		} else {
			// find the node right before the end.
			Node beforeTail = getNodeAt(length - 2);
			// set its next to null. This ends the list here.
			beforeTail.setNext(null);
			length--;
		}
	}

	@Override
	public String get(int index) {
		return getNodeAt(index).getData();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		// start at the head
		Node node = head;
		// follow the links between nodes until it reaches the end
		while (node != null) {
			sb.append(node.toString());
			node = node.getNext();
		}
		return sb.toString();
	}

	@Override
	public int size() {
		return length;
	}

	private Node getNodeAt(int index) {
		// start at the head
		Node node = head;
		// follow the links between nodes until it counts off the right number
		for (int i = 0; i < index; i++) {
			if (node == null) {
				// In case we run out of nodes before we get up to the desired index, return
				// null
				return null;
			}
			node = node.getNext();
		}
		return node;
	}

}
