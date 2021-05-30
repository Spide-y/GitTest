
public class Room {

    private int no;
    private String type;
    private int status;
    private String name;
    private Integer phone;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        if (status==1){
            return "Room{" + "no=" + no + ", type='" + type + '\'' + ", status=" + "可预定" + '}';
        }else {
            return "Room{" + "no=" + no + ", type='" + type + '\'' + ", status=" + "已预定" + '}';
        }
    }

}
