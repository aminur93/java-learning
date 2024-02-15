class Human
{
    private int age;
    private String name;

   

    public Human() { // default constructor
        age = 20;
        name = "John";
    }

    
    public Human(int age, String name) { // parameterized constructor
        this.age = age;
        this.name = name;
    }


    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

public class Encapsulation {
    
    public static void main(String args[])
    {
        Human h = new Human();

        Human obj1 = new Human(35, "Rashid");

        System.out.println("Name: " + h.getName() + " Age: " + h.getAge());

        System.out.println("Name: " + obj1.getName() + " Age: " + obj1.getAge());

        // h.setAge(20);
        
        // h.setName("John");

        //System.out.println("Name: " + h.getName() + " Age: " + h.getAge());
    }
}
