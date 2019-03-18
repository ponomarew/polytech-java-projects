package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Notebook notebook = new Notebook();

        notebook.addRec(new RecordInNotebook("1"));
        notebook.addRec(new RecordInNotebook("2"));
        notebook.addRec(new RecordInNotebook("3"));
        notebook.addRec(new RecordInNotebook("4"));
        notebook.displayAll();

        notebook.delete(2);
        notebook.setRec(2, new RecordInNotebook("1"));

        notebook.displayAll();

    }
}

