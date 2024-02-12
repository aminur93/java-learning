public class JaggedArray {
    
    public static void main(String args[])
    {
        // Jagged array start here
        int nums[][] = new int[3][];

        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];

        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums[i].length; j++)
            {
                nums[i][j] = (int) (Math.random() * 10);
            }
        }

        for(int n[] : nums)
        {
            for(int m: n)
            {
                System.out.print(m + " ");
            }

            System.out.println();
        }
        // Jagged array ends here

        // 3d array start here
        int threeD[][][] = new int[3][4][5];

        for(int x = 0; x < 3; x++)
        {
            for(int y = 0; y < 4; y++)
            {
                for(int z = 0; z < 5; z++)
                {
                    threeD[x][y][z] = (int) (Math.random() * 10);
                }
            }
        }

        for(int twoD[][] : threeD)
        {
            for(int oneD[] : twoD)
            {
                for(int three : oneD)
                {
                    System.out.print(three + " ");
                }

                System.out.println();
            }

            System.out.println();
        }
        // 3d array ends here
    }
}
