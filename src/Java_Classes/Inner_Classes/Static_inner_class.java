package Java_Classes.Inner_Classes;

class outer{
    int x =10;

    static class inner{
        int y =5;
    }
}

public class Static_inner_class {
    public static void main(String[] args){
        outer.inner myIn = new outer.inner();
        System.out.println(myIn.y);
    }
}


