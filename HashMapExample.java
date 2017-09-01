package collections;

//using HashMap showing the properties of key-value pair
import java.util.*;

//creating a name as HashMapExample
public class HashMapExample { 

	//Creating main method
	public static void main(String[] args) {
		
		//Creating HashMap object taking arguments of integer and string types
		HashMap<Integer,String>hashMap = new HashMap<Integer,String>();
		
		//Here we are Adding  key-value pairs to the HashMap object
		hashMap.put(1,"Samgung");
		hashMap.put(5,"Sony");
		hashMap.put(6,"Panasonic");
		hashMap.put(3,"Reliance");
		hashMap.put(4,"Apple");
		
		//  Here we are  Adding a key-value pair to the HashMap that  
		// object if the key-value pair doesn’t exist already
		hashMap.put(2, "LG");
		
		// here we are  Retrieving a value associated with a given key from the HashMap object 
	    //has we have given the key as 2 it gives the  String value of the key 2
		Integer key = 2; 
		String value = hashMap.get(key);
		System.out.println("Key: " + key); 
        System.out.println("Value is : "+value);

	     // Here it Clears all the key-value pair elements present in the HashMap.
		 hashMap.clear();
		 
		//to sort the key-value pairs we are using the HashMap object 
		HashMap<Integer, String>sortedMap = new HashMap<Integer,String>(hashMap);
		//displays in the form of sorted order 
		System.out.println("After sorting the list: "+sortedMap);

		
	}

}
