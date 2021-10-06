public final class Immutable {

    /*Info:- Wrapper classes Integer, Long, Float, Double and String class is immutable.
     * Step 1 :- final class
     * Step 2:- variable private and Final
     * Step 3:- Only Getters
     * */

    private final int id;
    private final String name;

    public Immutable(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static void main(String... args) {
        Immutable im = new Immutable(1, "a");
        //im.name="b"; this cannot be done since variable is final

    }
}
