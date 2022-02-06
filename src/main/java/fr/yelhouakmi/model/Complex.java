package fr.yelhouakmi.model;

import java.lang.reflect.Array;
import java.util.Map;

public class Complex {
    private long id;
    private String name;
    private String[] description;
    private Map<String, String> map;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String[] getDescription() {
        return description;
    }
    public void setDescription(String[] description) {
        this.description = description;
    }
    public Map<String, String> getMap() {
        return map;
    }
    public void setMap(Map<String, String> map) {
        this.map = map;
    }
}
