public class recursion_reverseLinkedList {

    class node {
        String data;
        node next;

        node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    node head;
    // add last
    public void add(String data) {
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    // remove last
    public void remove() {
        node currNode = head;
        node lastNode = head.next;
        while (lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
        currNode.next = null;
    }

    // print list
    public void printList() {
        node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data);
            currNode = currNode.next;
        }
    }

    //recursive reverse 
    public node recursiveReverse(node head){
        if(head==null||head.next==null)
            return head;

        node newHead = recursiveReverse(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public static void main(String[] args) {
        recursion_reverseLinkedList list = new recursion_reverseLinkedList();
        list.add("this ");
        list.add("is ");
        list.add("an ");
        list.add("example ");
        list.add("of ");
        list.add("linked ");
        list.add("list");
        list.printList();
        list.head = list.recursiveReverse(list.head);
        System.out.println();
        list.printList();
    }
}
