package Interface;

interface Computer{

    void code();

}

class Laptop implements Computer{

    public void code()
    {
        System.out.println("Coding, compiling and running the code...");
    }
}

class Desktop implements Computer{

    public void code()
    {
        System.out.println("Coding, compiling and running the code by desktop much faster...");
    }

}

class Developer{

    public void developApp(Computer lap)
    {
        lap.code();
    }
}

public class Demo {

    public static void main(String[] args) {

        Computer desk = new Desktop();

        Computer lap = new Laptop();

        Developer d = new Developer();
        d.developApp(lap);
        
    }
}

