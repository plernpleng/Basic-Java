package initlization_block;
class Test{
    static int a;
    // initlization block
    static
    {
        a = 5;
        System.out.println("Initlization Block of Parent Class");
    }
    Test(){
        System.out.println("Constructor of Parent Class");
    }
}
class Test2 extends Test{
    {
        System.out.println("Initlization Block of Child Class");
    }
    Test2()
    {
        System.out.println("Constructor of Child Class");
    }
}

public class InitllzationBlock {
    public static void main(String[] args) {
        Test2 t2 = new Test2();
    }
}
