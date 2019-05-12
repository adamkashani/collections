package hashMap;


public class Test {

	public static void main(String[] args) {

		//		HashMap<String , Integer> hashMap = new HashMap<>(5);
		//		
		//		System.out.println(hashMap.addNode("aaa", 10));
		//		System.out.println(hashMap.addNode("aaa", 12));
		//		System.out.println(hashMap.addNode("aaa", 15));
		//		System.out.println(hashMap.addNode("bbb", 15));
		//		
		//		System.out.println(hashMap.getSize());
		//		NodeGeneric<String , Integer>temp = hashMap.getNode("aaa");
		//		
		//		while(temp!=null) {
		//			System.out.println(temp.getValue());
		//			temp=temp.getNextNode();
		//		}
		//		hashMap.removeNode("aaa");
		//		System.out.println(hashMap.getNode("aaa"));
		HashMap<Integer , String> hashMap = new HashMap<>(5);

		System.out.println(hashMap.add(5 , "aaa"));
		System.out.println(hashMap.add( 10 , "bbb"));
		System.out.println(hashMap.add(15 , "ccc"));

		System.out.println(hashMap.getSize());
		NodeGeneric<Integer , String>temp = hashMap.get(5);
//		hashMap.getKeys().forEachRemaining(key -> {
//			System.out.println(key);
//		});

		while(temp!=null) {
			System.out.println(temp.getValue());
			temp=temp.getNextNode();
		}
		hashMap.remove(10);
		System.out.println(hashMap.get(10));
		System.out.println("after remove");
		temp = hashMap.get(5);
		while(temp!=null) {
			System.out.println(temp.getValue());
			temp=temp.getNextNode();
		}
		//		java.util.HashMap<String, String>asd = new java.util.HashMap<>();
		//		asd.
	}

}
