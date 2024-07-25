class MoveZeros {

    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int ptr = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                ptr = i;
                break;
            }
        }
        if (ptr == -1)
            return;
        for (int i = ptr + 1; i < n; i++) {
            if (nums[i] != 0) {
                swap(nums, ptr, i);
                ptr++;
            }
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}