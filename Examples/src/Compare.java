import java.util.Arrays;
import java.util.Comparator;

public class Compare implements Comparable<Compare> {

    private int id;
    private String name;
    private int salary;

    public Compare(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Compare o) {
        return this.id - o.id;
    }

    public static Comparator nameComparator = new Comparator<Compare>() {
        @Override
        public int compare(Compare o1, Compare o2) {
            return o1.name.compareTo(o2.name);
        }
    };

    public static Comparator salHighComparator = new Comparator<Compare>() {
        @Override
        public int compare(Compare o1, Compare o2) {
            return o2.salary - o1.salary;
        }
    };

    @Override
    public String toString() {
        return "Compare{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String... args) {

        Compare[] com = new Compare[]{
                new Compare(2, "a", 10), new Compare(1, "b", 20),
                new Compare(3, "c", 30)};

        //default comparable based on id
        Arrays.sort(com);
        System.out.println(com[0]); //output:- Compare{id=1, name='b', salary=20}

        //nameComparator
        Arrays.sort(com, nameComparator);
        System.out.println(com[0]); //output:- Compare{id=2, name='a', salary=10} Since Name is "a"

        //salHighComparator
        Arrays.sort(com, salHighComparator);
        System.out.println(com[0]); //output:- Compare{id=3, name='c', salary=30} Since sal is "30"

    }


}
