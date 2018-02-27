package by.htp.jd01.unit05.hw01;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		Note note1 = new Note ("note1", new Data(2018, 2, 15), true);
		Note note2 = new Note ("note2", new Data(2019, 3, 15), true);
		Note note3 = new Note ("note3", new Data(2020, 4, 15), true);
		Note note4 = new Note ("note4", new Data(2021, 5, 15), true);

	    note1.compareTo(note2);
		
		//TreeSet<Note> set = new TreeSet<Note>();

		NoteComparator comparator = new NoteComparator();
		TreeSet<Note> set = new TreeSet<>(comparator);

		set.add(note1);
		set.add(note2);
		set.add(note3);
		set.add(note4);

		for (Note n: set){
			System.out.println(n.getDate().getYear());
		}

		

		/*
		set2.add(note1);
		set2.add(note2);
		set2.add(note3);
		
		for (Note n: set2){
			System.out.println(n.getDate().getYear());
		}*/
		

	}

}
