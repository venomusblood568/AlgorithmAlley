import java.io.*;
import java.util.* ;

/************************************************************

    Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/

public class Solution {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		if(first == null) return second;
        if(second == null) return first;

        if(first.data > second.data){
            LinkedListNode temp = first;
            first = second;
            second = temp;
        }

        LinkedListNode res = first;
        while(first != null && second != null){
            LinkedListNode temp = null;
            while(first != null && first.data <= second.data){
                temp = first;
                first = first.next;
            }
            temp.next = second;
            temp = first;
            first = second;
            second = temp;
        }
        return res;
	}
}
