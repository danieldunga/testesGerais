package colecoes;

import java.util.HashSet;
import java.util.Set;

public class UsandoSet {

	public static void main(String[] args) {
		Set<Long> set = new HashSet<Long>();
		
		set.add(123l);
		set.add(123l);
		set.add(123l);
		set.add(123l);
		set.add(456l);
		
		for (Long num : set) {
			System.out.println(num);
		}

	}

}
