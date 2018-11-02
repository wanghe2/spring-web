package entity;

import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name;
    private String sex;


    public Person() {
        name="wang";
        sex="man";
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
}
