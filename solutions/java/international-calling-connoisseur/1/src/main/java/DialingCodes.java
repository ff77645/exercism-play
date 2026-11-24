import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.List;
import java.util.Collection;

public class DialingCodes {

    private Map<Integer, String> map = new HashMap<>();
    public Map<Integer, String> getCodes() {
        return map;
    }

    public void setDialingCode(Integer code, String country) {
        map.put(code,country);
    }

    public String getCountry(Integer code) {
        return map.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        Set<Integer> codes = map.keySet();
        Collection<String> list = map.values();
        if(codes.contains(code) || list.contains(country)) return;
        map.put(code,country);
    }

    public Integer findDialingCode(String country) {
        for(Integer code:map.keySet()){
            if(country == map.get(code)) return code;
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        Collection<String> values = map.values();
        if(!values.contains(country)) return;
        for(Integer co:map.keySet()){
            if(map.get(co) == country) {
                map.remove(co);
                break;
            }
        }
        map.put(code,country);
    }
}
