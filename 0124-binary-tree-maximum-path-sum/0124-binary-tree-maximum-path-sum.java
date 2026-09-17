class Solution {

    private int maxp = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        calculate(root); 
        return maxp;     
    }

    private int calculate(TreeNode node){
        if (node == null) return 0; 


        int left = Math.max(0, calculate(node.left));
        int right = Math.max(0, calculate(node.right));

        int curr = node.val + left + right;

        maxp = Math.max(curr, maxp);

        return node.val + Math.max(left, right);
    }
}
