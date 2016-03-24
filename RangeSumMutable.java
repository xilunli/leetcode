public class NumArray {
    private int[] sums;
    private int length;
    public NumArray(int[] nums) {
        length = nums.length +1;
        if(length==1) return;
        sums = new int[length];
        for(int i = 0; i < length-1; i++) {
            createSums(i+1, nums[i]);
        }
        
    }
    private void createSums(int i, int val) {
        while(i < length ) {
            sums[i] += val;
            i = getChild(i); 
        }
    }
    private int getChild(int i) {
        return i + (i&(-i));
    }
    private int getParent(int i) {
        return i - (i&(-i));
    }
    private int getSum(int i) {
        int result = 0;
        while(i>0) {
            result += sums[i];
            i = getParent(i);
        }
        return result;
    }
    
    void update(int i, int val) {
        int index = i+1;
        int diff;
        if(index==1) diff = getSum(index)-val;
        else diff = getSum(index) - getSum(index-1) - val;
        while(index < length) {
            sums[index] -= diff;
            index = getChild(index);
        }
    }

    public int sumRange(int i, int j) {
        if(i==0) return getSum(j+1);
        else return getSum(j+1)-getSum(i);
    }
}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.update(1, 10);
// numArray.sumRange(1, 2);
