
public class LinkedListTester {
	
	public static void main(String[] args) {
		
		LinkedList list1 = new LinkedList();
		
		list1.insertFirst("alligator");
		list1.insertFirst("baboon");
		list1.insertFirst("chimpanzee");
		list1.insertFirst("dinosaur");
		list1.insertFirst("elephant");
		list1.insertFirst("fox");
		list1.deleteFirst();
		
		Node marker = list1.findNode("chimpanzee");
		list1.deleteNode(marker);

		marker = list1.findNode("baboon");
		list1.insertAfter("bear", marker);
		
		System.out.println("FIRST LIST FROM HEAD TO TAIL...");
		list1.traverseAndPrint();
		System.out.println("Should be: elephant -> dinosaur -> baboon ->");
		System.out.println("bear -> alligator\n\n");
		
		LinkedList list2 = new LinkedList();
		
		list2.insertLast("Alice");
		list2.insertFirst("Bob");
		list2.insertFirst("Candace");
		list2.insertLast("David");
		list2.insertLast("Emma");
		list2.deleteLast();
		
		list2.insertLast("Fiona");
		list2.insertLast("George");
		list2.insertLast("Harry");
		list2.insertFirst("Imogene");
		
		marker = list2.findNode("Emma");
		list2.insertAfter("John", marker);
		
		marker = list2.findNode("David");
		list2.deleteNode(marker);
		
		System.out.println("SECOND LIST FROM HEAD TO TAIL...");
		list2.traverseAndPrint();
		System.out.println("Should be: Imogene -> Candace -> Bob ->");
		System.out.println("Alice -> Fiona -> George -> Harry");
	}

}
