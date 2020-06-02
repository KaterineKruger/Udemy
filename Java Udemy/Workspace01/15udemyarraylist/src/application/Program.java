package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("Guilherme");
		list.add("Julia");
		list.add("Katerine");
		list.add("Samantha");
		list.add("Sérgio");
		list.add(1, "Tânia");
		
		System.out.println("List size: " + list.size());
		System.out.println();
		
		for(String x : list) {
			System.out.println(x);
		}
		
		list.remove(3);
		
		System.out.println();
		System.out.println("List size: " + list.size());
		System.out.println();
		
		for(String x : list) {
			System.out.println(x);
		}
		
		list.removeIf(x -> x.charAt(0) == 'S');
		
		System.out.println();
		System.out.println("List size: " + list.size());
		System.out.println();
		
		for(String x : list) {
			System.out.println(x);
		}
		
		list.add(0, "Katerine");
		list.add(1, "Samantha");
		list.add(4, "Sérgio");
		
		System.out.println();
		System.out.println("List size: " + list.size());
		System.out.println();
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println();
		System.out.println("Index of Tânia: " + list.indexOf("Tânia"));
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'S').collect(Collectors.toList());
		
		System.out.println();
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println();
		String name = list.stream().filter(x -> x.charAt(0) == 'S').findFirst().orElse(null);
		System.out.println(name);
	}

}