class TreeNode {
  int value;
  TreeNode left;
  TreeNode right;
  TreeNode(int value) {
       this.value=value;
       }
}
public class TreeTraversal{
  public void preorder(TreeNode node) {
      if (node == null) 
          return;
          System.out.print(node.value + " ");
          inorder(node.left);
          inorder(node.right);
  }
  public void inorder(TreeNode node) {
      if (node == null) 
          return;
          inorder(node.left);
          System.out.print(node.value + " ");
          inorder(node.right);
  }
  public void postorder(TreeNode node) {
      if (node == null) 
          return;
          inorder(node.left);
          inorder(node.right);
          System.out.print(node.value + " ");
  }
  public static void main(String[] args) {
      TreeNode root = new TreeNode(1);
      root.left = new TreeNode(2);
      root.right = new TreeNode(3);
      root.left.left = new TreeNode(4);
      root.left.right = new TreeNode(5);
      root.right.left = new TreeNode(6);
      root.right.right = new TreeNode(7);
      root.left.right.left=new TreeNode(8);
      root.right.right.left = new TreeNode(9);
      root.right.right.right = new TreeNode(10);
      TreeTraversal tree=new TreeTraversal();
      System.out.print("Preorder traversal of binary tree is:");
      tree.preorder(root);
      System.out.println();
      System.out.print("inorder traversal of binary tree is:");
      tree.inorder(root);
      System.out.println();
      System.out.print("postorder traversal of binary tree is:");
      tree.postorder(root);
      System.out.println();
  }
}