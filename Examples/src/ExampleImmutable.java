final class MyImmutable {

    /*
    Advantage of immutable obj in multithreading and obj as key in hashmap
    */
    private final int id;
    private final String name;

    public MyImmutable(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class ExampleImmutable {

    public static void main(String[] args) {
        MyImmutable my = new MyImmutable(1,"abc");



    }
}




