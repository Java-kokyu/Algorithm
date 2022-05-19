public class Test {
    public long check(int[] checkIn, int[] checkOut){
        int answer = 0;
        int[] realCheckOut = new int[7];


        for(int i = 0; i < checkOut.length; i++){
            realCheckOut[i] = checkOut[i];
            if(checkOut[i] >= 29) realCheckOut[i] = 21;
            answer += realCheckOut[i] - checkIn[i];
        }
        return answer;
    }
}
