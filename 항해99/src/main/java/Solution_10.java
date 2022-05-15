public class Solution_10 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int row = arr1.length;
        int column = arr1[0].length;
        int[][] answer = new int[row][column];
        // int[][] answer = arr1 할당 후 arr2 추가
        for (int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
    //기본타입(Primitive type)의 배열인 경우 초기값을 가지고 있는 반면에(int = 0)
    //참조타입(Reference type)의 배열을 선언했을 경우 배열내 엘리먼트의 초기값이 null
    //참조타입은 초기화 필수, int[][] answer = {}은 빈 배열로 초기화해서 공간이 할당되지 않음
}
