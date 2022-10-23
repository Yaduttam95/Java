class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        
  if (lists == null || lists.length == 0) { return null;}
        
  return divideAndConquer(lists, 0, lists.length - 1);
}

private ListNode divideAndConquer(ListNode[] lists, int lo, int hi) {
  if (lo > hi) { return null;}
    
  if (lo == hi) {  return lists[lo];}
    
  int mid = lo + (hi - lo) / 2; 
    
  ListNode left = divideAndConquer(lists, lo, mid);
  ListNode right = divideAndConquer(lists, mid + 1, hi);
    
  return mergeList(left, right);
}

private ListNode mergeList(ListNode l1, ListNode l2){
     ListNode head = new ListNode(-1);
        ListNode pointer = head;
    
            while(l1 != null && l2 != null)
            {
                if(l1.val <= l2.val)
                {
                    pointer.next = l1;
                    l1 = l1.next;
                } else{
                    pointer.next = l2;
                    l2 = l2.next;
                }
                pointer = pointer.next;
            } 
              if(l1 != null)
            {
                pointer.next = l1;
                l1 = l1.next;
                pointer = pointer.next;
            } else if(l2 != null)
            {
                pointer.next = l2;
                l2 = l2.next;
                pointer = pointer.next;
            }
        
        return head.next;
    }
}
