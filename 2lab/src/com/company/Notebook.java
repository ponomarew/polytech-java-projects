package com.company;

import java.util.ArrayList;

public class Notebook
{
    private ArrayList<RecordInNotebook> arrayList = new ArrayList<RecordInNotebook>();

    public void addRec(RecordInNotebook newRecord)
    {
        arrayList.add(newRecord);
    }

    public void setRec(int index, RecordInNotebook newRecord)
    {
        arrayList.set(index, newRecord);
    }

    public void delete(int index)
    {
        arrayList.remove(index);
    }

    public void displayAll()
    {
        for (int i = 0; i < arrayList.size(); i++)
        {
            RecordInNotebook record = arrayList.get(i);
            System.out.println(record.record);
        }
    }

}
