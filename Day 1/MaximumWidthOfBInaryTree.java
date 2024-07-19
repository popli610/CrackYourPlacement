class Pair {
    int idx;
    TreeNode node;

    Pair(TreeNode node, int idx) {
        this.node = node;
        this.idx = idx;
    }
}

public class MaximumWidthOfBInaryTree {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root, 0));
        int ans = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            int currMin = queue.peek().idx;
            int st = 0, end = 0;
            for (int i = 0; i < size; i++) {
                Pair curr = queue.poll();
                if (i == 0)
                    st = curr.idx;
                if (i == size - 1)
                    end = curr.idx;
                if (curr.node.left != null)
                    queue.offer(new Pair(curr.node.left, (curr.idx - currMin) * 2 + 1));
                if (curr.node.right != null)
                    queue.offer(new Pair(curr.node.right, (curr.idx - currMin) * 2 + 2));
            }
            ans = Math.max(ans, end - st + 1);
        }
        return ans;
    }
}
