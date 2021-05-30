import java.util.Scanner;

public class Order {

    static Room[][] rooms = new Room[3][10];

    static void getRoom(){
        for (int i=0;i< rooms.length;i++){
            for (int j=0;j<rooms[i].length;j++){
                Room room = new Room();
                room.setNo((i+1)*100+j+1);
                room.setStatus(1);
                if (i==0){
                    room.setType("普通双床房");
                }else if (i==1){
                    room.setType("普通大床房");
                }else {
                    room.setType("总统套房");
                }
                rooms[i][j]=room;
            }
        }
    }

    public static void main(String[] args) {
        getRoom();
        System.out.println("提示(输入10086查询所有住房信息)");
        System.out.print("请输入要查询的房间号：");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i==10086) {
            Show();
        }else {
            Room r = findRoom(i);
            if (r==null) System.out.println("输入房号错误");
            else if (r.getStatus()==1){
                System.out.print("需要订房吗(输入1订房 2退出):");
                int order = sc.nextInt();
                if (order==1) {
                    r.setStatus(0);
                    System.out.println("您的住房信息为"+r);
                }
            }else if (r.getStatus()==0){
                System.out.print("需要退房吗(输入1退房 2退出):");
                int order = sc.nextInt();
                if (order==1) {
                    r.setStatus(1);
                    System.out.println("退房信息"+r);
                }
            }
        }
    }

    static Room findRoom(int no){
        for (int i=0;i<rooms.length;i++){
            for (int j=0;j< rooms[i].length;j++){
                if (rooms[i][j].getNo()==no){
                    return rooms[i][j];
                }
            }
        }
        return null;
    }
    static void Show(){
        for (int i=0;i<rooms.length;i++){
            for (int j=0;j< rooms[i].length;j++){
                if (rooms[i][j].getStatus()==1)
                System.out.println(rooms[i][j]);
            }
        }
    }

}
