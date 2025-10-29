package Java_Classes.Inner_Classes;
//    unline "regular" class, an inner class can be "private" or "protected"
//    if we dont want outside objects to access inner class, declare the class private


class outerClass{
    int x = 10;

    private class innerClass{
        int y =5;
    }
}

public class Private_Inner_class {
    public static void main(String[] args){
        outerClass myOuter = new outerClass();
     //   outerClass.innerClass myInner = myOuter.new innerClass(); // cannot access private
     //   System.out.println(myInner.y + myOuter.x);
    }

}