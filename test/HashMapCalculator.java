import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapCalculator {

	public int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		// TODO Auto-generated method stub
		int numMatch = 0;
		
		Object[] arr1 = hashmap1.keySet().toArray();
		Object[] arr2 = hashmap2.keySet().toArray();
		
		for(int i = 0; i < hashmap1.size(); i++) {
			for(int j = 0; j < hashmap2.size(); j++) {
				if(hashmap1.get(arr1[i]).equals(hashmap2.get(arr2[j])) && arr1[i].equals(arr2[j])) {
					numMatch++;
				}
			}
		}
		System.out.println(numMatch);
		return numMatch;
		
	}

}
