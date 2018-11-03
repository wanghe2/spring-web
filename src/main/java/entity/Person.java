package entity;

import org.springframework.stereotype.Component;

@Component
public class Person {

    private int id;
    private String firstname;
    private String deptid;
    private String dowork;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    public String getDowork() {
        return dowork;
    }

    public void setDowork(String dowork) {
        this.dowork = dowork;
    }
}
