package Trees_Demo;

public class Binary_Tree
{
    private TreeNode root;

    private class TreeNode
    {
        private TreeNode left;
        private TreeNode right;

        private int data;//Can be any generic type

        public TreeNode(int data)
        {
            this.data=data;
        }

    }
    public void createBinaryTree()
    {
        TreeNode first=new TreeNode(1);
        TreeNode second=new TreeNode(2);
        TreeNode third=new TreeNode(3);
        TreeNode fourth=new TreeNode(3);
        TreeNode fifth=new TreeNode(3);
        TreeNode six=new TreeNode(3);
        TreeNode seventh=new TreeNode(3);

        root=first;
        first.left=second;
        first.right=third;
        second.left=fourth;
        second.right=fifth;
        third.left=six;
        third.right=seventh;

    }

    public static void main(String[] args) {
        Binary_Tree bt=new Binary_Tree();
        bt.createBinaryTree();
    }
    public void preOrder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        System.out.println(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

}
