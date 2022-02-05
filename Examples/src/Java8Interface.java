interface Honda {

    default void start(){
        System.out.println("Honda start");
    }

    default void hondaLogo(){
        System.out.println("Honda hondaLogo");
    }

     static void hondaPrice(){
        System.out.println("Honda static hondaPrice");
    }
}

interface Maruti {

    default void start(){
        System.out.println("Maruti start");
    }
}

public class Java8Interface implements Honda, Maruti {
    // here we need to compulsory override default since
    //both interface has same method
    @Override
    public void start() {
        Honda.super.start();
        Maruti.super.start();
    }

    public static void main(String[] args) {
        Java8Interface obj = new Java8Interface();
        obj.start();// here we need to compulsory override default since
        //both interface has same method

        obj.hondaLogo(); // no need to override in implementation class directly class interface method

        Honda.hondaPrice();//since its static any class can call this method

        /*
        Honda start
        Maruti start
        Honda hondaLogo
        Honda static hondaPrice
        */
    }

}
