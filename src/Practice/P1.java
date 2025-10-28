package Practice;

public class P1 {
    public static void main(String[] args){
        String name = "John";
        System.out.println(name);

        var a1 = 14;
        System.out.println(a1);



//        type  casting
//        1. widening - (small to large) - auto
        double doubleInt = 23.4;
        int d = (int) doubleInt;
        System.out.println(d);

//        2. Narrowing - (large to small ) - manual
        int value1 = 34;
        double dd = value1;

        System.out.println(dd);


//        operator
//        1. arithmation

        var a =3;
        var b = 4;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a++);
        System.out.println(a--);

//String operations

        String greeting = "Hello";
        System.out.println("String length : " + greeting.length());
        System.out.println(greeting.toLowerCase());
        System.out.println(greeting.toUpperCase());

        String txt = "Hey, have a nice day !!";
        System.out.println(txt.indexOf("have"));
        System.out.println(txt.charAt(3));

//        compare string
        System.out.println(greeting.equals(txt));

//        remove whitespace

        System.out.println(txt.trim());


//        concat
        System.out.println(greeting+ " "+ txt);


//        concat() method

        System.out.println(greeting.concat(txt));

        String greet = "how are you ???";
        String result = greeting.concat(txt).concat(greet);
        System.out.println(result);
//Math function

       int max =  Math.max(1,2);
        System.out.println(max);

        int min = Math.min(3,4);
        System.out.println(min);

        var square = Math.sqrt(2);
        System.out.println(square);

        double absolute = Math.abs(-3.4);   //returns positive value
        System.out.println(absolute);

        double power = Math.pow(2,4);
        System.out.println(power);

//        rounding method
//        1. round
        System.out.println(Math.round(3.5));
//        2. ceil
        System.out.println(Math.ceil(4.6));

//        3. floor
        System.out.println(Math.floor(4.9));

//random value

        double rand = Math.random();
        System.out.println(rand);

        int randomNum = (int)(Math.random() * 101);
        System.out.println(randomNum);


//boolean

        boolean isJavaFun = true;
        System.out.println(isJavaFun);














    }
}
