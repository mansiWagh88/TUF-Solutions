import java.util.*;

class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {

        List<Integer> Union = new ArrayList<>();

        int n = nums1.length;
        int m = nums2.length;

        int i = 0;
        int j = 0;

        while (i < n && j < m) {

            if (nums1[i] < nums2[j]) {

                if (Union.isEmpty() || Union.get(Union.size() - 1) != nums1[i]) {
                    Union.add(nums1[i]);
                }
                i++;

            } else if (nums2[j] < nums1[i]) {

                if (Union.isEmpty() || Union.get(Union.size() - 1) != nums2[j]) {
                    Union.add(nums2[j]);
                }
                j++;

            } else {

                if (Union.isEmpty() || Union.get(Union.size() - 1) != nums1[i]) {
                    Union.add(nums1[i]);
                }
                i++;
                j++;
            }
        }

        while (i < n) {
            if (Union.isEmpty() || Union.get(Union.size() - 1) != nums1[i]) {
                Union.add(nums1[i]);
            }
            i++;
        }

        while (j < m) {
            if (Union.isEmpty() || Union.get(Union.size() - 1) != nums2[j]) {
                Union.add(nums2[j]);
            }
            j++;
        }

        int[] ans = new int[Union.size()];
        for (int k = 0; k < Union.size(); k++) {
            ans[k] = Union.get(k);
        }

        return ans;
    }
}