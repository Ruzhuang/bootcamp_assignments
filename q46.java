import java.util.*;  
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list=new ArrayList<Integer>();
        for(int num:nums){
            list.add(new Integer(num));
        }
        return recursion(list);
    }
    public List<List<Integer>> recursion(List<Integer> list){
        List<List<Integer>> output=new ArrayList<List<Integer>>();;
        if(list.size()==1){
            output.add(list);
            return output;
        }
        for (int i=0;i<list.size();i++){
            List<Integer> clone = new ArrayList<Integer>(list);
            clone.remove(i);
            List<List<Integer>> results=recursion(clone);
            for(List<Integer> current:results){
                current.add(list.get(i));
            }
            output.addAll(results);
        }
        return output;
    }
}
