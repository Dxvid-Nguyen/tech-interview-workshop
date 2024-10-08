import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }
        
        HashSet<Integer> diff1 = new HashSet<>(set1);
        HashSet<Integer> diff2 = new HashSet<>(set2);
        
        diff1.removeAll(set2);
        
        diff2.removeAll(set1);
        
        List<Integer> list1 = new ArrayList<>(diff1);
        List<Integer> list2 = new ArrayList<>(diff2);
        
        List<List<Integer>> result = new ArrayList<>();
        result.add(list1);
        result.add(list2);
        
        return result;
    }
}
