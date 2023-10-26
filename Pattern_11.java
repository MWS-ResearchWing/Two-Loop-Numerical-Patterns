public class Pattern_11 {
    public static void main(String []args)
    {
        int i=0,j=0;
        for (i=5;i>=1;i--)
        {
            for(j=5;j>=i;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
