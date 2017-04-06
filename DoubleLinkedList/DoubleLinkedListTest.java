public class DoubleLinkedListTest
{
	public static void main(String[] args)
	{
		// Create a DoubleLinkedList of up to 20 integers (Integer is the wrapper class for int)
		DoubleLinkedList<Integer> dll_of_integers = new DoubleLinkedList<Integer>();

		System.out.println("Demonstrating dll_of_integers...");
		System.out.println("Calling insertBack(5)...");
		dll_of_integers.insertBack(5);
		System.out.print("Content of dll_of_integers: ");
		dll_of_integers.display();
		System.out.printf("\n");
		System.out.println("Calling insertBack(2)...");
		dll_of_integers.insertBack(2);
		System.out.print("Content of dll_of_integers: ");
		dll_of_integers.display();
		System.out.printf("\n");
		System.out.println("Calling insertFront(12)...");
		dll_of_integers.insertFront(12);
		System.out.print("Content of dll_of_integers: ");
		dll_of_integers.display();
		System.out.printf("\n");
		System.out.println("Calling insertFront(8)...");
		dll_of_integers.insertFront(8);
		//System.out.println("Insert onto end of double linked list: 0 to 999...");
		//for(int i=0;i<1000;i++)
		//{
		//	dll_of_integers.insertAtNext(i);
		//}
		System.out.print("Content of dll_of_integers: ");
		dll_of_integers.display();

		// test deletes
		dll_of_integers.deleteFront();
		System.out.print("Content of dll_of_integers: ");
		dll_of_integers.display();
		
		dll_of_integers.deleteBack();
		System.out.print("Content of dll_of_integers: ");
		
		System.out.printf("\n\n");				
		
	}
}