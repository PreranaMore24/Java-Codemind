class Vehical 
{
    private String model;
    private String name;
   
    public Vehical(String model, String name) 
    {
        super();
        this.model = model;
        this.name = name;
    }

    void showVehical() 
    {
        System.out.println("Model is : " + model);
        System.out.println("Name is : " + name);
    }
}

class Car extends Vehical 
{

    int Wheels;

    public Car(String model, String name, int Wheels) 
    {
        super(model, name);
        System.out.println("This is Car");
        this.Wheels = Wheels;
    }

    void carShow() 
    {
        showVehical();
        System.out.println("Wheels are : " + Wheels);
    }
}

class MotorCycle extends Vehical 
{

    private int Wheels;

    public MotorCycle(String model, String name,int Wheels) 
    {
        super(model, name);
        System.out.println();
        System.out.println("This is Motorcycle");
        this.Wheels = Wheels;
    }

    void MotorShow() 
    {
        showVehical();
        System.out.println("Wheels are : " + Wheels);
    }
}

public class HierarchicalInheritanceExample 
{
    public static void main(String[] args) 
    {
        Car c = new Car("City-SV", "Honda City", 4);
        c.showVehical();
        MotorCycle m = new MotorCycle("Bullet", "Royal Enfield", 2);
        m.showVehical();
    }
}