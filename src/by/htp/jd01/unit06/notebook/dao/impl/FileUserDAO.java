package by.htp.jd01.unit06.notebook.dao.impl;

import java.io.FileReader;

import by.htp.jd01.unit06.notebook.dao.UserDAO;
import by.htp.jd01.unit06.notebook.entity.User;
import by.htp.jd01.unit06.notebook.entity.UserInfo;


public class FileUserDAO implements UserDAO {

	@Override
	public boolean logination(User user) {
		
		
		//FileReader reader = new FileReader("t.txt");
		return false;
	}

	
	@Override
	public void edit(int id, UserInfo user) {
		
		
		//FileReader reader = new FileReader("t.txt");
	}
	

}
