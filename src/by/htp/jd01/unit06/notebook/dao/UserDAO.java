package by.htp.jd01.unit06.notebook.dao;

import by.htp.jd01.unit06.notebook.entity.User;
import by.htp.jd01.unit06.notebook.entity.UserInfo;


public interface UserDAO {
	
	boolean logination(User user);
	void edit(int id, UserInfo user);

}
