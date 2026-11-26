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
    public int diameterOfBinaryTree(TreeNode root) {
        return diaUtil(root).dia;
    }
    public Pair diaUtil(TreeNode root){
        if(root==null){
            return new Pair();
        }
        Pair left=diaUtil(root.left);
        Pair right=diaUtil(root.right);
        int h=1+Math.max(left.height, right.height);
        int diaFroot=left.height+right.height;
        int dia=Math.max(diaFroot, Math.max(left.dia, right.dia));
        return new Pair(dia, h);
    }
}
class Pair{
    int dia;
    int height;

    public Pair(){
        dia=0;
        height=0;
    }
    public Pair(int dia, int height){
        this.dia=dia;
        this.height=height;
    }
}