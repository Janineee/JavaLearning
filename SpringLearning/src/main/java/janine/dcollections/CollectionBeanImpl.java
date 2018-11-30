package janine.dcollections;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionBeanImpl implements CollectionBean {
    private String[] arrs;
    private List<String> list;
    private Set<String> set;
    private Map<String, String> map;

    public void setArrs(String[] arrs) {
        this.arrs = arrs;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "CollectionBean: "
                + "\n\tarrs = " + Arrays.toString(arrs)
                + "\n\tlist = " + list.toString()
                + "\n\tset = " + set.toString()
                + "\n\tmap = " + map.toString()
                + "\n"
                ;
    }
}
