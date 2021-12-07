package Trees_Demo;

import java.util.Stack;

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
        //Recursion
        if(root==null)
        {
            return;
        }
        System.out.println(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public  void preOrderTraverse()
    {
        //Iteration
        if(root==null)//Exception check for tree traversal
        {
            return;
        }
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty())
        {
            TreeNode temp=stack.pop();
            System.out.print(temp.data+" ");
            if(temp.right!=null)
            {
                stack.push(temp.right);//i push the nodes right child push into the stack
            }
            if(temp.left!=null)
            {
                stack.push(temp.left); //Output -> 1,2,4,5,3,6,7
            }

        }
    }
    //recursive
    public void inOrder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);

    }

    //iteration
    public void iterativeInorder()
    {
        if(root==null)
        {
            return;
        }
        Stack<TreeNode> stack=new Stack<>();
        TreeNode temp=root;
        while(!stack.isEmpty()||temp!=null)
        {
            if(temp!=null)
            {
                stack.push(temp);
                temp=temp.left;
            }
            else
            {
                temp=stack.pop();
                System.out.print(temp.data+" ");
                temp=temp.right;

            }
        }
    }



}
