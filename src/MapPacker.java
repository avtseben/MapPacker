import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class MapPacker<T extends Keyable> {

    public Map<String,T> pack(List<T> list){
        Map<String,T> map = new HashMap();
        for(T t : list){
            map.put(t.getKey(),t);
        }
        return map;
    }

    public Map<String,T> packSumField(List<T> list){
        Map<String,T> map = new HashMap();
        for (T t : list) {
            long increment = map.containsKey(t.getKey())
                    ? map.get(t.getKey()).getIncrementField() + t.getIncrementField()

        }
        return map;
    }
}
