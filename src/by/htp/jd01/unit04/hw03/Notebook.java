package by.htp.jd01.unit04.hw03;

import java.util.ArrayList;
import java.util.List;


public class Notebook {

    private static Notebook notebook;
    private List<Note> note = new ArrayList<>();

    static {
        notebook = new Notebook();
    }


    public static Notebook getNoteBook() {
        return notebook;
    }

    
    public List<Note> getNotes() {
        return note;
    }
}