package linkedList;

public class Test {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<>();
		
		
		linkedList.add("number 1 ");
		linkedList.add("number 2 ");
		linkedList.add("number 3 ");
		linkedList.add("number 4 ");
		
		System.out.println(linkedList.getSize());
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.getLast());
		
		System.out.println(linkedList.contains("number 2 "));
		System.out.println(linkedList.contains("number 100 "));
		
		System.out.println(linkedList.popAndRemove());
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.getLast().getPerv());
		
	}

}
