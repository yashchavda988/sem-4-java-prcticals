class Parent{
    public void parentclass(){
        System.out.println("Class Parent");
    }
}

class Base extends Parent{
    public void baseclass(){
        System.out.println("Class Base");
    }
}

public class p14 {
    public static void main(String[] args){
        Base obj = new Base();
        obj.parentclass();
        obj.baseclass();
    }
}
