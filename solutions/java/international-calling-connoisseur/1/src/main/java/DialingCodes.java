import java.util.Map;
import java.util.HashMap;

public class DialingCodes {
    public Map<Integer, String> codes = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return codes;
    }

    public void setDialingCode(Integer code, String country) {
        codes.put(code, country);
    }

    public String getCountry(Integer code) {
        return codes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (codes.containsKey(code) == false && codes.containsValue(country) == false) {
            this.setDialingCode(code, country);
        }
    }

public Integer findDialingCode(String country) {
    for (Map.Entry<Integer, String> entry : codes.entrySet()) {
    if (entry.getValue().equals(country)) {
        return entry.getKey();
    }
    }
    return null;
}

    public void updateCountryDialingCode(Integer code, String country) {
        if (codes.containsValue(country) == true) {
            int codeKey = findDialingCode(country);
            codes.remove(codeKey);
            this.setDialingCode(code, country);
        }
    }
}
