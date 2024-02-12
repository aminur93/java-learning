public class Array {

    public static void main(String args[])
    {
        //first way to declare an array
        int nums[] = {3,4,7,8};
        nums[1] = 6;
        System.out.println(nums[1]);


        // second way to declare an array
        int nums1[] = new int[5];
        nums1[0] = 10;
        nums1[1] = 20;
        nums1[2] = 30;
        nums1[3] = 40;
        nums1[4] = 50;
        for(int i = 0; i < nums1.length; i++)
        {
            System.out.println(nums1[i]);
        }

        
    }
    
}
