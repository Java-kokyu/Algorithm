public class Solution_30 {

    public long solution(int[][] sizes) {
        long answer = 0;
        int max_0 = 0;
        int max_1 = 0;
        int length = sizes.length;
        for (int i = 0; i < length; i++){
            int temp = 0;
            if(sizes[i][0] < sizes[i][1]){
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            max_0 = Math.max( sizes[i][0], max_0 ); //둘 중 더 큰 값을 리턴
            max_1 = Math.max( sizes[i][1], max_1 );
        }
        answer = (long)max_0 * max_1;
        return answer;
    }

    public int solution_2(int[][] sizes){
        int length = 0, height = 0;
        for (int[] card : sizes) {
            length = Math.max(length, Math.max(card[0], card[1]));
            height = Math.max(height, Math.min(card[0], card[1]));
        }
        int answer = length * height;
        return answer;
    }
}
