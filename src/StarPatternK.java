public class StarPatternK {
    public static void main(String[] args) {

        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=3;j++)
            {
                if( j==1 || i+j==4 || i-j==0)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
