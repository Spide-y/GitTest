public class MaxPoint {

    public static int[][] t = new int[][]{{100,50},{110,60},{120,65}};

    public static void main(String[] args) {
        int result;
        result = getMostPoint(t);
        System.out.println(result);
    }

    private static int getMostPoint(int[][] t) {
        int score = 0;
        int max = 0;
        for (int i=0;i<t.length;i++){
            if (i!=0){
                for (int j=0;j<i;j++){
                    if (t[i][0]>t[j][0]&&t[i][1]<t[j][1]){
                        score += 2;
                    }
                    if (t[i][1]>t[j][1]&&t[i][0]<t[j][0]){
                        score += 1;
                    }
                    if (t[i][1]>t[j][1]&&t[i][0]>t[j][0]){
                        score += 5;
                    }
                }
                if (max<score){
                    max = score;
                }
                score=0;
            }
        }
        return max;
    }

}
