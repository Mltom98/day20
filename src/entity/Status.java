package entity;

/**
 * @Author yml
 * Date on 2019/12/21  9:31
 */
public class Status {
    private int sid;
    private String statusName;

    public Status() {
    }

    @Override
    public String toString() {
        return "Status{" +
                "sid=" + sid +
                ", statusName='" + statusName + '\'' +
                '}';
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public Status(int sid, String statusName) {
        this.sid = sid;
        this.statusName = statusName;
    }
}
