package t_11;
// kontenery nie przechowuja typów podstawowych
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Statistics {
	public static void main(String[] args) {
		
		Random rand = new Random(47);  // 47 to ziarno powodujace generowanie ciagu tych samych liczb! za kazdym wywolaniem, w 99% przypadków uzywany do testów
		
		Map<Integer,Integer> map = new TreeMap<Integer, Integer>();
		for (int i = 0; i < 10000; i++) {
			int r = rand.nextInt(20);
			Integer freq = map.get(r);
			map.put(r, freq == null ? 1 : (freq + 1));
		}
		System.out.println("Mapa: " + map);
		System.out.println("Contain key: " + map.containsKey(10));
		System.out.println("Contain value: " + map.containsValue(503));
	}
}
