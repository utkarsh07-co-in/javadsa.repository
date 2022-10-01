class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
for(int i=m;i<nums1.length;i++)
{
nums1[i]=nums2[j];
j++;
}

     int temp;
for (int i = 0; i < nums1.length; i++) {
for (int k = i; k > 0; k--) {
if (nums1[k] < nums1 [k - 1]) {
temp = nums1[k];
nums1[k] = nums1[k - 1];
nums1[k - 1] = temp;
}
}
    }
    }
}
