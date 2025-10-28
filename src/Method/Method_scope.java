package Method;

public class Method_scope {
    int y =5;

    public static void main(String[] age){
        Method_scope myObj = new Method_scope();
        int x =100;
        System.out.println(x);


//        block scope
//        can be accessed only inside {}

//        if,while or for loop - var declared inside it cannot be used outsdie

//        loop scope

        for(int i=0;i<5;i++){
            System.out.println(i);
        }


//        class scope
//        var declared inside class but outside any method have class scope (called fields)


        System.out.println(myObj.y);

    }
}
