import java.lang.Math;
public class extraction_way1{
    public static void main(String args[])
    {
        int n = 12345;
        int count = (int) (Math.log10(n) + 1);
        System.out.println(count);
    }
}