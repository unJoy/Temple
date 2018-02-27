package by.htp.jd01.unit06.notebook.service;

import java.util.Calendar;
import java.util.List;

import by.htp.jd01.unit06.notebook.entity.Note;

public interface NoteService {
	
	void create(Note note);
	List<Note> find(Calendar date);

}
