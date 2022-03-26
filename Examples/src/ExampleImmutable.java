import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



final class MyImmutable {

    /*
    Advantage of immutable obj in multithreading and obj as key in hashmap
    */
    private final int id;
    private final String name;
    private final Date birthDate;
    private final List<Integer> list;

    public MyImmutable(int id, String name, Date birthDate, List<Integer> list) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.list = list;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return (Date) birthDate.clone();
    }

    public List<Integer> getList(){
        return Collections.unmodifiableList(list);
    }
}

public class ExampleImmutable {

    public static void main(String[] args) {
        MyImmutable my = new MyImmutable(1, "abc", new Date(), Stream.of(1, 2, 3, 4).collect(Collectors.toList()));
        System.out.println(my.getBirthDate());
        my.getBirthDate().setTime(1000l); // doesnt matter bcoz in getter
        // clone is there so date wont change
        System.out.println(my.getBirthDate()); // date is now immutable bcoz of clone in getter

        System.out.println(my.getList());




    }
}




