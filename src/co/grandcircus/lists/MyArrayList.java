package co.grandcircus.lists;
import java.util.Arrays;

public class MyArrayList implements MyList {
	
	// The allocated array of memory. This might be bigger than the actual list.
	private String[] array = new String[4];
	// How many items are actually in the list. May be less than the length of the array.
	private int length = 0;

	@Override
	public void addAtEnd(String data) {
		if (isFull()) {
			// If our array is out of space, double the size.
			doubleLength();
		}
		// Set the next item in the array and increment the length.
		array[length] = data;
		length++;
	}

	@Override
	public void removeFromEnd() {
		// Clear the last slot and decrement the length.
		array[length - 1] = null;
		length--;
	}

	@Override
	public void addAtBeginning(String data) {
		if (isFull()) {
			// If our array is out of space, double the size.
			doubleLength();
		}
		// Loop backwards and shift all the items over to make room for the new one.
		for (int i = length; i > 0; i--) {
			array[i] = array[i - 1];
		}
		// Set first element and increment length
		array[0] = data;
		length++;
	}

	@Override
	public void removeFromBeginning() {
		// Loop forwards through list and shift all items back one position
		for (int i = 0; i < length - 1; i++) {
			array[i] = array[i + 1];
		}
		length--;
		array[length] = null;
		
	}

	@Override
	public String get(int index) {
		return array[index];
	}

	@Override
	public int size() {
		return length;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[ ");
		for (int i = 0; i < length; i++) {
			sb.append(array[i]);
			if (i != length - 1) {
				// Add comma, except after last item
				sb.append(", ");
			}
		}
		sb.append(" ]");
		return sb.toString();
	}
	
	private boolean isFull() {
		return length == array.length;
	}
	
	private void doubleLength() {
		// make a new copy of the array that is twice as long
		array = Arrays.copyOf(array, array.length * 2);
	}

	@Override
	public boolean insertAt(int index, String data) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAt(int index) {
		// TODO Auto-generated method stub
		return false;
	}

}
