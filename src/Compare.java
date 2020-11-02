class Compare implements Comparable<Object>
{
    private String string;
    private int number;
    private String  TEMPLATE = "str = %s, num = %d";

    Compare(String string, int number)
    {
        this.string = string;
        this.number = number;
    }

    @Override
    public int compareTo(Object obj)
    {
        Compare entry = (Compare) obj;
        int result = string.compareTo(entry.string);
        if(result != 0)
            return result;

        result = number - entry.number;
        if(result != 0)
            return (int) result / Math.abs( result );

        return 0;
    }

    @Override
    public String toString()
    {
        return String.format(TEMPLATE, string, number);
    }
}