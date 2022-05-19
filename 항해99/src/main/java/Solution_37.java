class Solution_37 {
    public boolean[] visit;
    public int[] arr;
    public int sum;
    public int answer = 0;

    public int solution(int[] nums) {

        visit=new boolean[nums.length];
        arr = new int[3];
        dfs(0,nums,0);

        return answer;
    }

    public void dfs(int depth, int[] nums, int start) {
        if (depth == 3) {
            for (int val : arr) {
                sum += val;
            }
            System.out.println(sum);
            if (isPrime(sum)) {
                answer++;
            }

            sum = 0;
            return;
        }
        for (int i = start; i < visit.length; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = nums[i];
                dfs(depth + 1, nums, i);
                visit[i] = false;
            }
        }
    }

    public boolean isPrime(int x) {
        if (x == 0 || x == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }
}


