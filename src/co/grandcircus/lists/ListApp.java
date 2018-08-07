package co.grandcircus.lists;


public class ListApp {

	public static void main(String[] args) {
		MyList list = new MyLinkedList();
		test(list);
		// list = new MyArrayList();
		// test(list);
	}
	
	private static void test(MyList list) {
		list.addAtBeginning("B");
		list.addAtBeginning("A");
		list.addAtEnd("C");
		list.addAtEnd("D");
		list.insertAt(2, "Z");
		System.out.println(list);
		list.removeAt(2);
		list.insertAt(0, "W");
		// list.removeAt(list.size());
		System.out.println(list);
		list.removeFromEnd();
		System.out.println(list);
		// list.removeFromBeginning();
		// list.removeFromEnd();
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list.get(1));
	}

}
