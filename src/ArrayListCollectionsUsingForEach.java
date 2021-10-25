import java.util.ArrayList;
import java.util.Collections;
public class ArrayListCollectionsUsingForEach {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		//virutal capacity is 10, once it is filled it will add 5 more slots of memeory
		list.add("hello");
		list.add("kumar");
		list.add("hi");
		list.forEach(name -> myPrint(name));
		Collections.sort(list);
		System.out.println("sorted array list items:" + list);
		System.out.println("Size of arraylist:" +list.size());
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("sorting in desc order:" +list);
		System.out.println("Search string in arraylist (t/f):" +list.contains("hi"));
		System.out.println("get index number for element in arraylist:" +list.indexOf("hello"));
	}
	static void myPrint(String arraylistitems) {
		System.out.println("arraylist items:" + arraylistitems);
	}
}