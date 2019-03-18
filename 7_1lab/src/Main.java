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

        System.out.println();

        for(int i = 0; i < keyList.size(); i++)
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

      //  System.out.println(listResult);
      //  System.out.println(counter);
        writeInFile(counter, listResult);

    }

    private static ArrayList readFile(String fileName, ArrayList codeList)
    {
        try (FileInputStream fis = new FileInputStream(fileName);
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr))
        {
          String line;
          while ((line = br.readLine()) != null)
          {
              for (String word : line.split("[,;:.!?(){}*=+\\s]+"))
              {
                  codeList.add(word);
              }
          }
      }
      catch (IOException ex)
      {
          ex.printStackTrace(System.out);
      }
      return codeList;
    }

    private static void writeInFile(int counter, ArrayList<String> list)
    {
        try
        {
            OutputStream f = new FileOutputStream("file", false);
            OutputStreamWriter writer = new OutputStreamWriter(f);
            BufferedWriter out = new BufferedWriter(writer);
            String c = String.valueOf(counter);
            for(int i = 0; i < list.size(); i++)
            {
                out.write(list.get(i));
                out.newLine();
            }
            out.newLine();
            out.write("Количество ключевых слов = " + c);
            out.flush();
        }
        catch(IOException ex)
        {
            System.err.println(ex);
        }
    }
}

