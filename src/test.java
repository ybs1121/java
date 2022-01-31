class A{

    void speak(){
        System.out.print("a");

    }

}

interface C{
    public void speak2();

}

class B extends A implements C{
    public void speak2(){
        System.out.print("C");
    }

}








public class test
{

    public static void main(String args[]){
        B b = new B();
        b.speak2();


    }
}
