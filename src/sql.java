import java.util.*;

public class sql {

    private static int[][] t = new int[][]{{1,2,3},{4,5,6},{7,8,3},{4,2,3}};

    public static void main(String[] args) {

        int[][] result;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入abc");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        result=calSql(t,a,b,c);
        for (int i=0;i<result.length;i++){
            for (int j=0;j< result[i].length;j++){
                System.out.println(result[i][j]);
            }
        }
    }

    public static int[][] calSql(int[][] t, int a,int b, int c){
        Set<Integer> set=new TreeSet<>();
        for (int i=0;i<t.length;i++){
            for (int j=0;j< t[i].length;j++){
                if (j==c-1){
                    if (!set.contains(t[i][j])){
                        set.add(t[i][j]);
                    }
                }
            }
        }
        int[][] result = new int[set.size()][3];
        int start = 0,end = 1;

        for (Integer in:set){
            result[start][0]=in;
            for (int i=0;i<t.length;i++){
                if (t[i][c-1]==in){
                    result[start][end]++;
                    result[start][end+1]+=t[i][b-1];
                }
            }
            start++;
        }
        return result;
    }

}
