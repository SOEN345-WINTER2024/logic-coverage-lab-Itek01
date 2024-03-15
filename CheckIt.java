public class CheckIt
{

    public static String checkIt (boolean a, boolean b, boolean c)
    {
        String pvalue = "";
        if (a || (b && c))
        {
            pvalue = "P is true";
        }
        else
        {
            pvalue = "P isn't true";
        }
        return pvalue;
    }

    public static void main (String []argv)
    {  // Driver method for checkIt
        // Read an array from standard input, call checkIt()
        boolean []inArr = new boolean [argv.length];
        if (argv.length != 3)
        {
            System.out.println ("Usage: java checkIt v1 v2 v3");
            return;
        }

        for (int i = 0; i< argv.length; i++)
        {
            inArr [i] = Boolean.parseBoolean(argv[i]);
        }

        System.out.println(checkIt (inArr[0], inArr[1], inArr[2]));
    }
}