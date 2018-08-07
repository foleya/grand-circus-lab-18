package co.grandcircus.lists;


public interface MyList {

	/**
	 * Add the specified string to the beginning of the list.
	 * @param data string to add
	 */
	void addAtBeginning(String data);

	/**
	 * Remove the first item from the list.
	 */
	void removeFromBeginning();

	/**
	 * Add the specified string to the end of the list.
	 * @param data string to add
	 */
	void addAtEnd(String data);

	/**
	 * Remove the last item from the list.
	 */
	void removeFromEnd();

	/**
	 * Get the item from the list at the specified index. Do not modify the list.
	 * @param index zero-based index at which to find the item.
	 * @return the item
	 */
	String get(int index);

	/**
	 * How many items are in the list?
	 * @return how many items are in the list
	 */
	int size();

	
	/** 
	 * 
	 * TODO: write some javadocs
	 * 
	 * @param index
	 * @param data
	 * @return
	 */
	boolean insertAt(int index, String data);
	
	/** 
	 * TODO: write some javadocs
	 * @param index
	 * @return
	 */
	boolean removeAt(int index);

}