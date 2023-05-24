import java.util.*;

class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val = val;
    }
}
class TreeNode{
    int val;
    TreeNode right;
    TreeNode left;
    public TreeNode(int val){
        this.val = val;
    }
}
public class DataStruct {
    public static void main(){
        // Array
        int[] nums = new int[10];
        nums[0] = 1;
        System.out.println("1.Array");
        //打印array內容
//        for (int n : nums){
//            System.out.println(n);
//        }
        System.out.println(nums[0]);
        System.out.println(Arrays.toString(nums));
        System.out.println(nums.length);

        //String
        String s = new String("hello world");
        s = new String(new char[]{'h','e','l','l','o'});
        System.out.println("2.String");
        System.out.println(s);
        System.out.println(s.charAt(0)); //h
        System.out.println(s.substring(0,2));//he ,[0,2)
        System.out.println("a".compareTo("b")); //-1 ,a < b
        System.out.println(s.contains("h")); //true ,是否包含

        //ListNode
        //初始化
        ListNode head = new ListNode(0);
        //賦值
        head.next = new ListNode(1);
        System.out.println("3.ListNode");
        //取值 head.val
        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
        //Tree
        //初始化
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        System.out.println("4.Tree");
        /*
        *       0
        *      / \
        *     1   2
        *    / \
        *   3   4
        * */

        //Stack，甲骨文doc推薦使用Deque取代stack
        //Stack常用於實現DFS
        //初始化
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.add(3); //更推薦用push
        System.out.println("5.Stack");
        System.out.println(stack.peek()); //只看輾頂不移除元素
        System.out.println(stack.pop()); //輾頂元素彈出來
        System.out.println(stack.pop()); //輾頂元素彈出來
        System.out.println(stack.pop()); //輾頂元素彈出來
        System.out.println(stack.isEmpty());; //檢查是否為空

        //Queue
        //Queue常用來實現BFS
        //初始化
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1); //推薦使用offer而不是add
        queue.offer(2);
        queue.add(3);
        System.out.println("6.Queue");
        System.out.println(queue.peek());//讀取先進元素且不移除
        System.out.println(queue.poll());//移除先進元素，推薦使用poll而非remove，poll處理了空不會報錯
        System.out.println(queue.poll());
        System.out.println(queue.remove());
        System.out.println(queue.poll()); //以為空輸出null

        //Deque
        //Deque和Queue最大的差別在不止從頭獲取資料，也能從尾獲取
        //初始化
        Deque<Integer> deque = new LinkedList<>();
        deque.offerLast(1);
        deque.addLast(2);
        deque.offerFirst(3);
        System.out.println("7.Deque");
        System.out.println(deque.peekFirst());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
    }
}
