package com.company;

public class Notebook
{
    private RecordInNotebook[] notes;
    private int size;
    private int last;

    Notebook()
    {
        size = 10;
        notes = new RecordInNotebook[size];
        last = 0;
    }


    public void add(RecordInNotebook record)
    {
        if (last == size - 1)
        {
            increaseArray();
        }
        notes[last++] = record;
    }

    public void increaseArray()
    {
        RecordInNotebook[] rin = new RecordInNotebook[size + 1];
        System.arraycopy(notes, 0, rin, 0, last);
    }



    public void delete(int index)
    {
        System.arraycopy(
                this.notes, index, this.notes,
                index - 1, this.last - index);
        this.last--;
    }

    public void edit(int index, String newRecorod)
    {
        notes[index - 1].setRecord(newRecorod);
    }


    public void displayAll()
    {
        for (int i = 0; i <= last - 1; i++)
        {
            System.out.println(notes[i].getRecord());
        }
    }

}
