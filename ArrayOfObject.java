class Student
{
    int rollno;
    String name;
    int marks;
}

public class ArrayOfObject {
    
    public static void main(String args[])
    {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "John";
        s1.marks = 90;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Khan";
        s2.marks = 65;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "rashid";
        s3.marks = 88;


        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for(int i = 0; i < students.length; i++)
        // {
        //     System.out.println(students[i].name + " : " + students[i].marks);
        // }

        for(Student stud : students)
        {
            System.out.println(stud.name + " : " + stud.marks);
        }


        // int nums[] = new int[4];

        // nums[0] = 1;
        // nums[1] = 2;
        // nums[2] = 3;
        // nums[3] = 4;

        // for(int i=0; i < nums.length; i++)
        // {
        //     System.out.println(nums[i]);
        // }


        // for(int n : nums)
        // {
        //     System.out.println(n);
        // }
    }
}
