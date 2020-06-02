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
		list.add("S�rgio");
		list.add(1, "T�nia");
		
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
		list.add(4, "S�rgio");
		
		System.out.println();
		System.out.println("List size: " + list.size());
		System.out.println();
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println();
		System.out.println("Index of T�nia: " + list.indexOf("T�nia"));
		
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