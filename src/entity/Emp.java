package entity;

import java.nio.file.Path;
import java.util.Date;

/**
 * @Author yml
 * Date on 2019/12/21  9:30
 */
public class Emp {
    private int id;
    private String username;
    private String dept;
    private Date chkDate;
    private int sid;

    public Emp() {
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", dept='" + dept + '\'' +
                ", chkDate=" + chkDate +
                ", sid=" + sid +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Date getChkDate() {
        return chkDate;
    }

    public void setChkDate(Date chkDate) {
        this.chkDate = chkDate;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public Emp(int id, String username, String dept, Date chkDate, int sid) {
        this.id = id;
        this.username = username;
        this.dept = dept;
        this.chkDate = chkDate;
        this.sid = sid;
    }
}
