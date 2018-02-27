package by.htp.jd01.unit04.hw03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class UILoader {

	private static Notebook noteBook = Notebook.getNoteBook();
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	
	private static void addNote() throws IOException {
		System.out.println("Please, enter the information about a new note:\n" + "\"First name\" \"Last name\" \"Telephone\"");

		String[] data = reader.readLine().split(" ");
		noteBook.getNotes().add(new Note(data[0], data[1], data[2]));
	}

	
	private static void deleteNote() throws IOException {
		System.out.println("Please, enter information about the note\n" + "First name + Last name + Telephone");

		String[] data = reader.readLine().split(" ");
		Note note = new Note(data[0], data[1], data[2]);
		int index = -1;

		for (int i = 0; i < noteBook.getNotes().size(); i++) {
			if (noteBook.getNotes().get(i).equals(note)) {
				index = i;
				break;
			}
		}

		if (index == -1) {
			System.out.println("No matches found.");
			return;
		}

		noteBook.getNotes().remove(index);
		System.out.println("Note has been removed.");
	}
	

	private static void findNote() throws IOException {
		System.out.println("Please, enter first name and/or last name and/or telephone number: ");

		String line = reader.readLine().toLowerCase().trim();

		int count = 0;
		for (Note n : noteBook.getNotes()) {
			if (n.searchNote(line) != null) {
				System.out.println(n.toString());
				count++;
			}
		}

		if (count == 0)
			System.out.println("No matches found.");
	}
	

	private static void printAllNotes() {

		for (Note n : noteBook.getNotes()) {
			System.out.println(n.toString());
		}
	}


	public static void main(String[] args){

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try{
		    while (true) {
				System.out.println("Choose what you want to do:\n"
						+ "\"c\" - create note\n"
						+ "\"f\" - find note\n"
						+ "\"d\" - delete note\n"
						+ "\"s\" - show all notes\n"
						+ "Command: ");

				String commandLauncher = reader.readLine().toLowerCase().trim();

				switch (commandLauncher) {
					case "c":
						addNote();
						break;
					case "f":
						findNote();
						break;
					case "d":
						deleteNote();
						break;
					case "s":
						printAllNotes();
						break;
					default:
						System.out.println("Wrong request.");
						break;
				}

				System.out.println("\nDo you want anything else? y/n");
				String commandCloser = reader.readLine().toLowerCase();

				if (commandCloser.equals("n")) {
					System.exit(0);
				} else if (!commandCloser.equals("y")) {
					System.out.println("Wrong request");
				}
			}
		} catch(IOException exc){
        	System.out.println("Wrong request.");
		}
	}
}
