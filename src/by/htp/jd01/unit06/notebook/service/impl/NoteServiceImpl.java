package by.htp.jd01.unit06.notebook.service.impl;

import java.util.Calendar;
import java.util.List;

import by.htp.jd01.unit06.notebook.dao.DAOFactory;
import by.htp.jd01.unit06.notebook.dao.NoteDAO;
//import by.htp.jd01.unit04.notebook.dao.impl.FileNoteDAO;
import by.htp.jd01.unit06.notebook.entity.Note;
import by.htp.jd01.unit06.notebook.service.NoteService;

public class NoteServiceImpl implements NoteService{

	@Override
	public void create(Note note) {
		//data validation
		
		DAOFactory daoFactory = DAOFactory.getInstance();
		NoteDAO noteDAO = daoFactory.getNoteDAO();
		noteDAO.create(note);
	}

	@Override
	public List<Note> find(Calendar date) {
		
		DAOFactory daoFactory = DAOFactory.getInstance();
		NoteDAO noteDAO = daoFactory.getNoteDAO();
		
		return null;
	}



}
