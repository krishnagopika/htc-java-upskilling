package com.htc;
import java.util.*;
public class Rare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> nameCount = new HashMap<>();

        String[] names = scanner.nextLine().split(" ");
        for (String name : names) {
            nameCount.put(name, nameCount.getOrDefault(name, 0) + 1);
        }

        String rareName = null;
        int minCount = Integer.MAX_VALUE;
        for (Map.Entry<String, Integer> entry : nameCount.entrySet()) {
            if (entry.getValue() < minCount) {
                minCount = entry.getValue();
                rareName = entry.getKey();
            }
        }

        System.out.println(rareName);
	}

}
