import java.util.HashMap;

class Parent {

    static HashMap<String, Integer> map = new HashMap<>();
    static String obj;

    Parent() {
        obj = this.getClass().toString();
        if (map.isEmpty())
            map.put(obj, 1);
        else {
            if (map.containsKey(obj)) {
                Integer integer = map.get(obj);
                map.put(obj, integer + 1);
            } else
                map.put(obj, 1);
        }

    }

    int getCount() {
        obj = this.getClass().toString();
        System.out.println(obj);
        return map.get(obj);

    }
}


public class GetChildObjCOuntusingParentConstrucorOnly extends Parent {
    public static void main(String[] args) {
        GetChildObjCOuntusingParentConstrucorOnly c = new GetChildObjCOuntusingParentConstrucorOnly();
        Parent p = new Parent();
        GetChildObjCOuntusingParentConstrucorOnly c2 = new GetChildObjCOuntusingParentConstrucorOnly();
        System.out.println(p.getCount());
        System.out.println(c2.getCount());
        D d = new D();
        D d2 = new D();
        D d3 = new D();
        System.out.println(d3.getCount());

        System.out.println(map.entrySet());

    }
}

class D extends GetChildObjCOuntusingParentConstrucorOnly {

}