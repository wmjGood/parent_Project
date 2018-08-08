package cn.project;

import java.io.Serializable;

public class bean implements Serializable {
    private  Integer id;
    private  String Name;
    private  String  pwd;
    @Override
    public String toString() {
        return "bean{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }


    public bean(Integer id, String name, String pwd) {
        this.id = id;
        Name = name;
        this.pwd = pwd;
    }

    public bean() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
