package com.example.demo.Termal.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by zhoutaimin on 2019/5/24.
 */
@Entity
@Table(name="User")
public class Emp {

    private int eid;
    private String ename;
    private String sex;
    private Date hire;
    private float sar;
    private int did;

    @Id
    @GeneratedValue
    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getHire() {
        return hire;
    }

    public void setHire(Date hire) {
        this.hire = hire;
    }

    public float getSar() {
        return sar;
    }

    public void setSar(float sar) {
        this.sar = sar;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }
}
