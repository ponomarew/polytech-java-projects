import java.util.*;

public class Main
{
    public static <T> List<T> toArray(T[] a)
    {
        List<T> list =  new ArrayList<T>();
        Collections.addAll(list, a);
        return list;
    }

    public static void main(String[] args)
    {
        String [] stringArray = {"2", "a5", "6", "7"};
        Integer [] intArray = {2, 4, 5, 6, 2};

        List<String> stringList = toArray(stringArray);
        List<Integer> integerList = toArray(intArray);
        stringList.add("$");
        integerList.add(3);
        System.out.println(stringList);
        System.out.println(integerList);

    }
}
