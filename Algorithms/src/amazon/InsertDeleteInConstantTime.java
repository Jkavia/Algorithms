package amazon;
import java.util.*;


public class InsertDeleteInConstantTime {

	public static void main(String[] args) {
		Randomize rm = new Randomize();
		System.out.println(rm.insert(1));
		System.out.println(rm.insert(1));
		System.out.println(rm.insert(2));
		System.out.println(rm.insert(3));
		System.out.println(rm.remove(4));
		System.out.println(rm.remove(1));
		System.out.println(rm.getRandom());


	}

}

class Randomize{
	Map<Integer, Integer> map = new HashMap<>();
	List<Integer> list = new ArrayList<>();
	
	public boolean insert(int input) {
		if(map.containsKey(input)) {
			return false;
		}else {
			map.put(input, input);
			list.add(input);
			return true;
		}
	}
	
	public boolean remove(int input) {
		if(map.containsKey(input)) {
			map.remove(input);
			list.remove(list.indexOf(input));
			return true;
		}else {
			return false;
		}
	}
	
	public int getRandom() {
		int randomindex = (int)Math.random()*(list.size()-1);
		int key = list.get(randomindex);
		return map.get(key);
	}
	
}
