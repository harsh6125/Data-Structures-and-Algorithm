import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
            }
        }
        return ans;
    }
}

public class _3sum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            int[] nums = new int[n];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            Solution solution = new Solution();
            List<List<Integer>> result = solution.threeSum(nums);
            System.out.println("Triplets that sum to zero are: " + result);
            System.out.println(
                    "The time complexity of this solution is O(n^2) and the space complexity is O(1) if we don't consider the space used for the output.");
        }

    }

}
