package ru.arc.tree;

import ru.arc.stack.CustomQueueImpl;
import ru.arc.stack.CustomStackImpl;


public class MainTree {
    public static void main(String[] args) {
        Tree root =
                new Tree(20,
                        new Tree(7,
                                new Tree(4, null, new Tree(6)),
                                new Tree(9)),
                        new Tree(35,
                                new Tree(31, new Tree(28), null),
                                new Tree(40, new Tree(38), new Tree(52))));

        /*System.out.println(Tree.sumRecursive(root));
        System.out.println(Tree.sumWide(root));*/
    }

   public static class Tree {
        int value;
        Tree left;
        Tree right;

        public Tree(int value, Tree left, Tree right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public Tree(int value) {
            this.value = value;
        }

        public static int sumRecursive(Tree root) {
            int result = root.value;

            if (root.left != null) {
                result += sumRecursive(root.left);
            }
            if (root.right != null) {
                result += sumRecursive(root.right);
            }
            return result;
        }

        public static int sumDeep(Tree root) {
            CustomStackImpl<Tree> stack = new CustomStackImpl<>();
            stack.push(root);
            int result = 0;
            while (!stack.isEmpty()) {
                Tree node = stack.pop();
                System.out.println(node.value);
                result += node.value;
                if (node.left != null) {
                    stack.push(node.left);
                }
                if (node.right != null) {
                    stack.push(node.right);
                }
            }
            return result;
        }

        public static int sumWide(Tree root) {
            CustomQueueImpl<Tree> queue = new CustomQueueImpl<>();
            queue.add(root);
            int result = 0;
            while (!queue.isEmpty()) {
                Tree node = queue.remove();
                System.out.println(node.value);
                result += node.value;
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            return result;
        }
    }
}
