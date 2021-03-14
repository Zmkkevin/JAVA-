package Swardtooffer;

public class offer57_1_doublezhizhen {
    public static void main(String[] args) {
        int[] nums = {10,26,30,31,47,60};
        int target = 40;
        //双指针：
        int head = 0,tail = nums.length - 1;
        while(head<tail){
            //1.larger than target:
            if(nums[head]+nums[tail]>target){
                tail--;
            }else if(nums[head]+nums[tail]<target){
                head++;
            }else if(nums[head] + nums[tail] == target){
                //return new int[]{nums[head],nums[tail]};
                System.out.println("["+nums[head]+","+nums[tail]+"]");
                break;
            }
        }
        //return null;
    }
}
