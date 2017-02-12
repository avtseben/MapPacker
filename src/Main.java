import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by sas on 12.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        List<Person> list = new LinkedList<>();
        list.add(new Person("Alex","Valley",30));
        list.add(new Person("Linda","Hamilton",32));
        list.add(new Person("Vasiliy","Voropaev",36));
        list.add(new Person("Jessie","Jane",26));
        list.add(new Person("Lena","Tsebenko",28));

        MapPacker<Person> mapPacker = new MapPacker();
        Map map = mapPacker.pack(list);
        map.forEach((k,v) -> System.out.println("key: "+k+" value:"+v));

        mapPacker.packSumField(list);
    }

}
