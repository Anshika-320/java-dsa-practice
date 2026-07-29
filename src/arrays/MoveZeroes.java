package arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int i=0; //writer
        int j=0; //scanner
        while(j<n){
            if(nums[j]!=0){

                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;


            }
            j++;
        }

    }
}
