class Computer
{
    public void playMusic()
    {
        System.out.println("Playing Music");
    }

    public String getMePen(int cost)
    {
        if(cost > 10)
        {
            return "Parker Pen";
        }
        else
        {
            return "Cello Pen";
        }
    }
}


public class DemoOopMethod {
    
    public static void main(String args[])
    {
        Computer obj = new Computer();

        obj.playMusic();

        String result = obj.getMePen(10);

        System.out.println(result);
    }
}
