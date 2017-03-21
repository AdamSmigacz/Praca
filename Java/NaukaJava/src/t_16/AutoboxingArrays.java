package t_16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AutoboxingArrays {
//autopakowanie w obiekty typów podstawowych

	public static void main(String[] args) {
		Integer [][] a = {
				{1,2,3,4,5,6,7,8},
				{1,2,3,4,5,6,7,8,9},
				{1,2,3,4,5,6},
				{1,2,3,4,5,6,7,8}
		};
		System.out.println(Arrays.deepToString(a));
	List<Integer> list = new ArrayList<Integer>();
	int[] b ={1}; 
	list.add(1);
	
	System.out.println(list.get(0));
	Map<Integer, String> map= new HashMap<Integer,String>();
	map.put(0, "jeden");
	System.out.println(map.size() + " element " + map.get(0));
	
	}
}