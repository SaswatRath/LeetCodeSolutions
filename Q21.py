class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def mergeTwoLists(self, list1: ListNode, list2: ListNode) -> ListNode:
        values = []

        while list1:
            values.append(list1.val)
            list1 = list1.next

        while list2:
            values.append(list2.val)
            list2 = list2.next

        values.sort()

        dummy = ListNode(-1)
        current = dummy
        for val in values:
            current.next = ListNode(val)
            current = current.next
        
        return dummy.next

def create_linked_list(values):
    if not values:
        return None
    head = ListNode(values[0])
    current = head
    for val in values[1:]:
        current.next = ListNode(val)
        current = current.next
    return head

def linked_list_to_list(head):
    result = []
    while head:
        result.append(head.val)
        head = head.next
    return result

list1 = create_linked_list([1, 2, 4])
list2 = create_linked_list([1, 3, 4])

solution = Solution()
merged_head = solution.mergeTwoLists(list1, list2)
output = linked_list_to_list(merged_head)
print(output)  
