package Java_Classes.Inner_Classes;


class OuterClass{
    int x = 10;

    class InnerClass{
        int y = 4;
    }
}

public class Inner_Classes {
    public static void main(String[] args){
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}