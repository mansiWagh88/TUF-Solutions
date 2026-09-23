class Solution {

    public int paint(int A, int B, int[] C) {

        long low = 0;
        long high = 0;

        for (int x : C) {
            low = Math.max(low, x);
            high += x;
        }

        while (low < high) {

            long mid = low + (high - low) / 2;

            int painters = 1;
            long sum = 0;

            for (int x : C) {

                if (sum + x > mid) {
                    painters++;
                    sum = x;

                
                    if (painters > A) {
                        break;
                    }
                } else {
                    sum += x;
                }
            }

            if (painters <= A) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return (int) ((low % 10000003 * (long) B) % 10000003);
    }
}