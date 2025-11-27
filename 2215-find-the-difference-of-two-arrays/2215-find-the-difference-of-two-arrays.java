class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet <Integer> set = new HashSet<>();
        HashSet <Integer> set2 = new HashSet<>();
        ArrayList <Integer> list = new ArrayList<>();
        ArrayList <Integer> list2 = new ArrayList<>();

        for(int i:nums1){
            set.add(i);
        }

        for(int i:nums2){
            set2.add(i);
        }

        for(int i:set){
            if(!set2.contains(i)){
                list.add(i);
            }
        }

        for(int i:set2){
            if(!set.contains(i)){
                list2.add(i);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(list);
        result.add(list2);
        return result;
    }
}