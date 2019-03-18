import java.io.*;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> keyList = new ArrayList<>();
        ArrayList<String> codeList = new ArrayList<>();
        ArrayList<String> listResult = new ArrayList<>();

        int counter = 0;

        final String keyFile = "KeyW.java";
        final String codeFile = "code.java";

        readFile(keyFile, keyList);
        readFile(codeFile, codeList);


        for (int i = 0; i < keyList.size(); i++)
        {
            for (int j = 0; j < codeList.size(); j++)
            {
                if (keyList.get(i).equals(codeList.get(j)))
                {
                    counter++;
                    listResult.add(codeList.get(j));
                }
            }
        }
        writeInFile(counter, listResult);
    }

    private static ArrayList<String> readFile(String fileName, ArrayList<String> stringKeyList)
    {
        ArrayList keyList = new ArrayList();
        try (FileReader fr = new FileReader(fileName))
        {
            int b = 0;

            while ((b = fr.read()) != -1)
            {
                if ((b != 10) && (b != 13) && (b != 32) && (b != 40)
                        && (b != 41) && (b != 46) && (b != 58) && (b != 59)
                        && (b != 91) && (b != 93) && (b != 123) && (b != 125))
                {
                    keyList.add((char) b);
                }
                else
                    {
                    if (!keyList.isEmpty())
                    {
                        stringKeyList.add(keyList.toString());
                        keyList.clear();
                    }
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return stringKeyList;
    }

    private static void writeInFile(int counter, ArrayList<String> list)
    {
        try (FileWriter fw = new FileWriter("file"))
        {
            for (String s : list)
            {
                for(int i = 1; i < s.length(); i += 3)
                {
                    fw.write(s.charAt(i));
                }
                fw.write('\n');
            }
            fw.write("Количество ключевых слов = " + counter);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

