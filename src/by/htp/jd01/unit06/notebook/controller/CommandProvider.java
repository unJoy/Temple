package by.htp.jd01.unit06.notebook.controller;

import java.util.HashMap;
import java.util.Map;

import by.htp.jd01.unit06.notebook.controller.impl.CreateNoteImpl;
import by.htp.jd01.unit06.notebook.controller.impl.EditNoteImpl;
import by.htp.jd01.unit06.notebook.controller.impl.LoginUserImpl;

public class CommandProvider {
	
	private Map<String, Command> commands = new HashMap<String, Command>();
	
	public CommandProvider(){
		commands.put("CREATE_NOTE", new CreateNoteImpl());
		commands.put("EDIT_NOTE", new EditNoteImpl());
		commands.put("LOGIN_USER", new LoginUserImpl());
	}
	
	public Command getCommand(String commandName){
		Command command = commands.get(commandName);//LOGIN_USER
		return command;
	}

}
