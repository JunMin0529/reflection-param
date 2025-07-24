package ex03;

import java.util.HashMap;
import java.util.Map;

public class Model {

    private static Model instance = new Model();

    private Model() {
        attributes.put("username", "ssar");
    }

    public static Model getInstance() {
        return instance;
    }

    private Map<String, Object> attributes = new HashMap<>();

    public void addAttribute(String name, Object value) {
        attributes.put(name, value);
    }

    public Object getAttribute(String name) {
        return attributes.get(name);
    }
}