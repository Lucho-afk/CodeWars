package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/*
For this game of BINGO, you will receive a single array of 10 numbers from 1 to 26 as an input. 
Duplicate numbers within the array are possible.

Each number corresponds to their alphabetical order letter (e.g. 1 = A. 2 = B, etc).
Write a function where you will win the game if your numbers can spell "BINGO". 
They do not need to be in the right order in the input array. Otherwise you will lose.
Your outputs should be "WIN" or "LOSE" respectively.
*/

public class BingoOrNot {
	public static String bingo(int[] numberArray) {
		Map<Integer, Character> bolillero = new HashMap<Integer, Character>();
		bolillero.put(2, 'B');
		bolillero.put(9, 'I');
		bolillero.put(14, 'N');
		bolillero.put(7, 'G');
		bolillero.put(15, 'O');
		List<Integer> lista = new ArrayList<>();
		for (int i : numberArray) {
			lista.add(i);
		}
		Set<Integer> hashSet = new HashSet<Integer>(lista);
		lista.clear();
		lista.addAll(hashSet);
		List<Integer> vector = lista.stream().filter(e -> bolillero.containsKey(e)).collect(Collectors.toList());
		return (vector.size() == 5) ? "WIN" : "LOSE";
	}
}
