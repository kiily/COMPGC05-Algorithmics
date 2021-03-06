package udemy_tutorial;

public class DoublyLinkedListTest {

	public static void main(String[] args) throws Exception {

		DoublyLinkedList<Integer> myList =  new DoublyLinkedList<Integer>();
		
		myList.insertFirst(new Integer(999));
		myList.insertFirst(new Integer(2020));
		myList.insertLast(new Integer(334));
		myList.insertFirst(new Integer(2000));
		myList.insertLast(new Integer(303));
		myList.insertFirst(new Integer(24420));
		myList.insertLast(new Integer(999999));
		myList.deleteFirst();//24420 should be deleted
		myList.deleteLast();//999999 should be deleted
		
			
		myList.printListForward();
		
		DoublyLinkedList<Integer> myList1 =  new DoublyLinkedList<Integer>();
		myList1.insertFirst(new Integer(999999));
		myList1.insertAt(new Integer(1010), 1);
		myList1.insertAt(new Integer(10390), 2);
		myList1.insertAt(new Integer(101033), 3);
		myList1.insertAt(new Integer(999), 4);
		myList1.deleteAt(4);
		
		myList1.printListForward();
		myList1.printListReversed();
	}

}
