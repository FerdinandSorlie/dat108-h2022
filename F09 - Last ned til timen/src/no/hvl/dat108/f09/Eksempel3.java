package no.hvl.dat108.f09;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Eksempel3 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);
		
		//Alle forbokstavene i fornavnene i en streng - reduce "CLTCM"
		String initialer = people.stream()
			.map(p -> "" + p.getFirstName().charAt(0))
			.reduce("", String::concat);
		System.out.println(initialer);
		
		//Antall personer - count
		long antallPersoner = people.stream().filter(p -> p.getAge()>50).count();
		System.out.println(antallPersoner);
		//Om vi har data som matcher - anyMatch, allMatch, noneMatch
		//Er alle over 30 år?
		boolean alleOver = people.stream().allMatch(p -> p.getAge()>30);
		System.out.println("alle over 30?" + alleOver);
		//Er noen over 60 år?
		boolean noenOver = people.stream().anyMatch(p -> p.getAge()>60);
		System.out.println("noen over 60?" + noenOver);

		//Summen av alle tall i [1..100]
		
		//Det minste tallet i streamen ...
		// ... min() 

		//Finn en som er 30 eller yngre
		
	}

}




