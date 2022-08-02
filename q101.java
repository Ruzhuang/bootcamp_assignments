/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root.left==null){
            if(root.right==null){
                return true;
            }
            else{
                return false;
            }
        }
        if(root.right==null){
            if(root.left==null){
                return true;
            }
            else{
                return false;
            }
        }
        return compare(root.left, root.right);
    }
    public boolean compare(TreeNode left, TreeNode right){
        boolean one=false;
        boolean two=false;
        if(left.val!=right.val){
            return false;
        }
        if(left.left==null){
            if(right.right!=null){
                return false;
            }
        }
        else{
            if(right.right==null){
                return false;
            }
            if(!compare(left.left,right.right)){
                return false;
            };
        }
        if(left.right==null){
            if(right.left!=null){
                return false;
            }
        }
        else{
            if(right.left==null){
                return false;
            }
            if(!compare(left.right,right.left)){
                return false;
            };
        }
        return true;
           
    }
}
