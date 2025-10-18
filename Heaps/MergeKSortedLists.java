package Heaps;

public class MergeKSortedLists {

    /*
    public ListNode mergeKLists(ListNode[] lists) {
    PriorityQueue<ListNode> minHeap = new PriorityQueue<>(
        (a, b) -> Integer.compare(a.val, b.val)
    );

    // Add the head of each list
    for (ListNode node : lists) {
        if (node != null) {
            minHeap.add(node);
        }
    }

    ListNode dummy = new ListNode();
    ListNode cur = dummy;

    while (!minHeap.isEmpty()) {
        // Pop smallest node
        ListNode node = minHeap.poll();
        cur.next = node;
        cur = cur.next;

        // Push its next node if available
        if (node.next != null) {
            minHeap.add(node.next);
        }
    }

    return dummy.next;
    }
     */
}
