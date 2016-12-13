package colecoes;

import java.util.HashMap;
import java.util.Map;

public class InterandoHashMap {

	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<>();

		map.put("asdf", "1");
		map.put("asdf1", "11");
		map.put("asdf2", "111");
		map.put("asdf3", "123");
		map.put("asdf4", "14");
		map.put("asdf5", "15555");
		
		StringBuffer buffer = new StringBuffer();
		for (Map.Entry<String, Object> entry : map.entrySet()) {
		    String key = entry.getKey();
		    Object value = entry.getValue();
		    
		    buffer.append(key + ":" + value + "|");
		}
		System.out.println(buffer);
	}

}
