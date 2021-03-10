package Leetcode.Doublelinked;

public class T167_sumof2nums {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        //java 记得一定要初始化！！！

//        int num[] = new int[2];

        int head = 0,tail = numbers.length - 1;
        //循环直到头尾相遇：
        while(head<tail){
            int sum = 0;
            sum = numbers[head] + numbers[tail];
            if(sum == target){
                /*num[0] = head+1;
                num[1] = tail+1;
                return num;*/
                System.out.println(head + 1);
                System.out.println(tail+1);
                break;
            }else if(sum < target){
                //如果小于目标，就向大取：
                head+=1;
            }else {
                //小于目标，tail指向前一个：
                tail -= 1;
            }
        }

    }
}
