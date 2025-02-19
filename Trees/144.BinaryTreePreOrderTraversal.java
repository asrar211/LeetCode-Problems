class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }

    private void preorder(TreeNode node, List<Integer> result){
        if(node == null) return;
        result.add(node.val);
        preorder(node.left, result);
        preorder(node.right, result);
    }
}


//Iterative
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorder = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if(root == null) return preorder;
        st.push(root);
        
        while(!st.isEmpty()){
            root= st.pop();
            preorder.add(root.val);

            if(root.right != null){
                st.push(root.right);
            }
            if(root.left != null){
                st.push(root.left);
            }
        }
        return preorder;
    }
}