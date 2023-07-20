class Parent 
{
    void Parent() 
    {
        System.out.println("This statement is from Parent class");
    }
}

class Child extends Parent 
{
    void Child() 
    {
        System.out.println("This statement is from Child Class");
    }
}

class GrandChild extends Child 
{
    void GrandChild() 
    {
        System.out.println("This statement is from Grandchild class");
    }

}

public class MultilevelinheritanceExample 
{
    public static void main(String[] args) 
    {
        GrandChild G = new GrandChild();
        G.Parent();
        G.Child();
        G.GrandChild();
    }
}
