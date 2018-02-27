package by.htp.jd01.unit06.notebook.dao;

import by.htp.jd01.unit06.notebook.dao.impl.FileNoteDAO;
import by.htp.jd01.unit06.notebook.dao.impl.FileUserDAO;

public class DAOFactory {
	
	private static final DAOFactory instance = new DAOFactory();
	
	private final UserDAO userDAO = new FileUserDAO();
	private final NoteDAO noteDAO = new FileNoteDAO();

	private DAOFactory() {}
	
	public static DAOFactory getInstance() {
		return getInstance();
	}
	
	
	public UserDAO getUserDAO() {
		return userDAO;
	}

	public NoteDAO getNoteDAO() {
		return noteDAO;
	}
	
	
}
