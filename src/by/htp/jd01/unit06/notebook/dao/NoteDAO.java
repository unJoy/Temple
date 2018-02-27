package by.htp.jd01.unit06.notebook.dao;

import by.htp.jd01.unit06.notebook.entity.Note;

public interface NoteDAO {
	
	void create(Note note);
	void remove(int id);

}
