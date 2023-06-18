public class extraction_way2 {
    static  int count_digits(int n)
    {
        int x = n;
        int count = 0;
        while (x != 0) {
            x = x / 10;
            count++;
        }
        return count;
    }
    public static void main(String args[])
    {
        int n = 1432;
        System.out.println("Number of digits in "+n+" is "+count_digits(n));
    }
}
