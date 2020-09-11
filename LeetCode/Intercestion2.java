package LeetCode;

import java.util.*;

//Intersection of Two Arrays II
public class Intercestion2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : nums1) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i : nums2) {
            if (map.containsKey(i)) {
                if (map.get(i) > 1) {
                    map.put(i, map.get(i) - 1);
                } else {
                    map.remove(i);
                }
                list.add(i);
            }

        }
        int[] arr = new int[list.size()];
        int i = 0;
        while (i < list.size()) {
            arr[i] = list.get(i);
            i++;
        }
        return arr;
    }
}

/*
 * public int[] intersect(int[] nums1, int[] nums2) { if(nums1.length <
 * nums2.length) return intersect(nums2, nums1); Arrays.sort(nums1);
 * Arrays.sort(nums2); int i = 0, j = 0, k = 0; while(i < nums1.length && j <
 * nums2.length){ if(nums1[i] < nums2[j]){ i++; } else if (nums1[i] > nums2[j]){
 * j++; } else { nums1[k++] = nums1[i++]; j++; } } return
 * Arrays.copyOfRange(nums1, 0, k); }
 */