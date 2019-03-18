package com.company;

public class Main
{

    public static void main(String[] args)
    {
        ValueReader vr = new ValueReader("config.properties");
        ValueReader vr2 = new ValueReader("config.properties");
        ValueReader vr3 = new ValueReader("file.properties");
    }

}