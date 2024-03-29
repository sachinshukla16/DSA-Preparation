import java.util.PriorityQueue;

public class MinimumNumberGame {
    private static int[] numberGame(int[] nums) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int ans[] = new int[nums.length];
        for(int num: nums) {
            minHeap.add(num);
        }
        int j = 0;
        for(int i = 0; i < nums.length/2; i++) {
            int alice = minHeap.poll();
            int bob = minHeap.poll();
            ans[j++] =bob;
            ans[j++] =alice;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{5,4,2,3};
        int[] arr = numberGame(nums);
        for(int num : arr) {
            System.out.print(num + " ");
        }

    }
}
