class T1{

    static void overload1(int i){
        System.out.println("t1 "+i);
    }

    static void override1(String s){
        System.out.println("t1 "+s);
    }

}

public class OverrideOverload extends T1 {

    static void overload1(int a,int b){
        System.out.println("main "+(a+b));
    }

    static void override1(String s){ //method hiding happens and the parent class method gets hidden
       System.out.println("main "+s);
    }

    public static void main(String[] args) {
        overload1(1);
        overload1(1,2);

        override1("hi");
        /*output:-  t1 1
            main 3
            main hi
        */



    }

}
