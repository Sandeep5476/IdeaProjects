package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Lc349 {
    //bruteforce approach
    static int[] findIntersect(int[] nums1,int[] nums2){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    if(!result.contains(nums1[i])){
                        result.add(nums1[i]);
                    }
                    break;
                }
            }
        }
        int[] ans = new int[result.size()];
        for(int i=0;i<result.size();i++){
            ans[i]=result.get(i);
        }
        return ans;
    }

    //approach 2 with sorting
    static int[] intersect(int[] nums1,int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        HashSet<Integer> set = new HashSet<>();
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                set.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        int[] ans = new int[set.size()];
        int k=0;
        for(int num: set){
            ans[k++]=num;
        }
        return ans;
    }

    //approach3 important in interviews using both hashsets
    static int[] intersectElements(int[] nums1,int[] nums2){
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums1){
            set.add(num);
        }
        HashSet<Integer> resultSet = new HashSet<>();
        for(int num:nums2){
            if(set.contains(num)){
                resultSet.add(num);
            }
        }
        int[] ans=new int[resultSet.size()];
        int k=0;
        for(int num:resultSet){
            ans[k++]=num;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {2,3,4,7,4,9};
        int[] nums2 = {1,11,13,4,9,4,9};
        System.out.println(Arrays.toString(intersectElements(nums1,nums2)));
        System.out.println(Arrays.toString(intersect(nums1,nums2)));
//        int[] ans1 = findIntersect(nums1,nums2);
//        System.out.println(Arrays.toString(ans1));
    }
}
