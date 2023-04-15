import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] res = decompressRLElist(arr);
        System.out.println(Arrays.toString(res));
    }

    static int[] decompressRLElist(int[] nums) {
        int len = 0;
        for(int i = 0; i < nums.length; i += 2)
            len += nums[i];

        int[] res = new int[len];

        for(int j = 0; j < nums.length; j += 2) {
            for(int n = 0, s = j; n < nums[j]; n++, s++) {
                res[s] = nums[j + 1];
            }
        }
        return res;
    }
}