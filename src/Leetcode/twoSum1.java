package Leetcode;

import java.util.HashMap;

/**
 * @Description
 * @params $
 * @returns $
 * @Author Jingyi Yan
 * @Date $
 * @Note
 */
public class twoSum1 {

    public static int[] twoSumSolution1(int[] nums, int target) {
        int [] ans =new int[2];
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            for(int j=i;j<nums.length;j++){
                if(temp+nums[j]==target&&j!=i){
                    ans[0]=i;
                    ans[1]=j;
                    break;
                }
            }
        }
        return ans;
    }

    public static int[] twoSumSolution2(int[] nums, int target){
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int complement = target-nums[i];
            if(map.containsKey(complement)&&map.get(complement)!=i){
                return new int[]{i,map.get(complement)};
            }

        }
        throw new IllegalArgumentException("No answer for that");
    }

    public static void main(String[] args){
        int [] testCase= new int[4];
        int [] finalAnswer1 = new int[2];
        finalAnswer1=twoSumSolution1(testCase,9);
        for(int i=0;i<finalAnswer1.length;i++){
            System.out.println(finalAnswer1[i]);
        }
    }
}
