package com.example.lab4;
import org.json.simple.JSONObject;

public class Student {
    private String name;
    private String lastname;
    private int age;
    private String group;
    private String telephoneNumber;

    public Student(String name, String lastname, int age, String group, String telephoneNumber) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.group = group;
        this.telephoneNumber = telephoneNumber;
    }

    // getters
    public String getName() {
        return name;
    }
    public String getLastname() {
        return lastname;
    }
    public int getAge() {
        return age;
    }
    public String getGroup() {
        return group;
    }
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public JSONObject toJSON() {
        JSONObject json = new JSONObject();
        json.put("name", name);
        json.put("lastname", lastname);
        json.put("age", age);
        json.put("group", group);
        json.put("telephoneNumber", telephoneNumber);
        return json;
    }

    public static Student fromJSON(JSONObject json) {
        try {
            String name = (String) json.get("name");
            String lastname = (String) json.get("lastname");
            int age = ((Long) json.get("age")).intValue();
            String group = (String) json.get("group");
            String telephoneNumber = (String) json.get("telephoneNumber");

            return new Student(name, lastname, age, group, telephoneNumber);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}