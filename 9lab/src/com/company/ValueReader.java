package com.company;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Properties;

public class ValueReader
{
    private Properties property;
    private static ArrayList<String> list = new ArrayList<>();

    public ValueReader(String filename)
    {
        property = new Properties();
        if (check(filename))
        {
            readFile(filename);
            outputValue();
        }
    }

    public boolean check(String filename)
    {
        boolean flag = false;
        if (!list.contains(filename))
        {
            list.add(filename);
            flag = true;
        }
        return flag;
    }

    private void readFile(String filename)
    {
        try(FileInputStream fis = new FileInputStream(filename))
        {
            property.load(fis);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private void outputValue()
    {
        for (String i : property.stringPropertyNames())
        {
            System.out.println(property.getProperty(i));
        }
    }
}
