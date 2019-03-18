public class Main
{
    private static class NuclearSubmarine
    {
        private class NuclearSubmarineEngine
        {
            NuclearSubmarineEngine()
            {
                System.out.println("Engine start");
            }
        }
    }

    public static void main(String[] args)
    {
        NuclearSubmarine outerClass = new NuclearSubmarine();
        NuclearSubmarine.NuclearSubmarineEngine innerClass = outerClass.new NuclearSubmarineEngine();
    }
}
