public class linkedList_swapInPairs {

    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    node head = null;

    // add element
    public void add(int data) {
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // print list
    public void print() {

        node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void swap() {
        if (head == null || head.next == null) {
            return;
        }
        node prevNode = head;
        node currNode = head.next;
        head = currNode;
        while (true) {
            node nextNode = currNode.next;
            currNode.next = prevNode;
            if(nextNode==null){
                prevNode.next = nextNode;
                return;
            }
            if (nextNode.next==null) {
                prevNode.next = nextNode;
                return;
            }
            prevNode.next = nextNode.next;

            prevNode = nextNode;
            currNode = prevNode.next;
        }
    }

    public static void main(String[] args) {
        linkedList_swapInPairs list = new linkedList_swapInPairs();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        list.swap();
        list.print();
    }
}
