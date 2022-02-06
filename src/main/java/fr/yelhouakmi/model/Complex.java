package fr.yelhouakmi.model;

import java.util.Map;

public class Complex {
    private long id;
    private String name;
    private String[] description;
    private Map<String, String> map;

    public Complex(long id, String name, String[] description, Map<String, String> map) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.map = map;
    }
    
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
