public class APattern {
    public static void main(String[] args) {
        int height=5; //5
        int width=(2 * height) - 1;//9
        int n = width / 2; //4
        //int row=6;
        //int col=6;
        for (int i = 0; i < height; i++)
        {
            for (int j =0; j <= width; j++)
            {
                if (j == n || j == (width - n) || (i == height / 2 && j > n && j < (width - n)))
                //if (row == 0 || row == 3 || col == 0 || col == 5)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
            n--;
        }
    }
}
