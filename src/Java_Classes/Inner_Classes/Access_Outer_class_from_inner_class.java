package Java_Classes.Inner_Classes;


class Outer{
    int x =10;

    class Inner{
        public int myInnerMethod(){
            return x;
        }
    }
}
public class Access_Outer_class_from_inner_class {

    public static void main(String[] args){
        Outer myOuter = new Outer();
        Outer.Inner myIN = myOuter.new Inner();
        System.out.println(myIN.myInnerMethod());
    }
}
