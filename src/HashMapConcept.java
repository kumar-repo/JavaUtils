import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,String> hashMapList= new HashMap<String,String>();
		
		hashMapList.put("key1","value1");
		hashMapList.put("key2","value2");
		hashMapList.put("key3","value3");
		hashMapList.put("key4","value4");
		
		System.out.println("get value fro followig Key: " +hashMapList.get("key3"));
		System.out.println("size of current hashmap: " +hashMapList.size());
		
		//virutal capacity is 16
		
	}

}
