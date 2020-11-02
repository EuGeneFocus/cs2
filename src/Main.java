import java.util.TreeSet;

public class Main
{
    public static void main(String[] args)
    {
        TreeSet<Compare> data = new TreeSet<Compare>();
        data.add(new Compare("а"  , 110));
        data.add(new Compare("а"  , 109));
        data.add(new Compare("г"    , 208));
        data.add(new Compare("б"     , 304));
        data.add(new Compare("е", 305));
        for (Compare e : data)
            System.out.println(e.toString());
    }
}
