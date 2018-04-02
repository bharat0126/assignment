package problem2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermutaionWords {

    private static List<String> permutations(String s) {
	// TODO Auto-generated method stub
	List<String> combinations = new ArrayList<String>();
	if (s.length() == 1) {
	    combinations.add(s);
	} else {
	    for (int i = 0; i < s.length(); i++) {
		List<String> temp = permutations(s.substring(0, i)
			+ s.substring(i + 1));
		for (String string : temp) {
		    combinations.add(s.charAt(i) + string);
		}
	    }
	}
	return combinations;
    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	String s = "abc";
	List<String> combinations = new ArrayList<String>();
	combinations = permutations(s);
	Collections.sort(combinations);
	System.out.println(combinations);
    }
}
