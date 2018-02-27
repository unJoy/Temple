package by.htp.jd01.unit06.notebook.controller.impl;

import by.htp.jd01.unit06.notebook.controller.Command;
import by.htp.jd01.unit06.notebook.entity.Note;
import by.htp.jd01.unit06.notebook.service.NoteService;
import by.htp.jd01.unit06.notebook.service.ServiceFactory;

public class CreateNoteImpl implements Command{

	@Override
	public String execute(String[] params) {
		String newContent;
		int year;
		int month;
		int day;
		
		String[] elements;
		for(int i=1; i<params.length; i++){
			elements = params[i].split("=");
			
			switch(elements[0]){
			case "newContent":
				newContent = elements[1];
			case "year":
				year = Integer.parseInt(elements[1]);
			}
			
		}
		
		ServiceFactory factory = ServiceFactory.getInstance();
		NoteService noteService = factory.getNoteService();
		
		Note newNote = new Note();
		noteService.create(newNote);
		
		String response = "OK";
		
		return response;
	}

}
