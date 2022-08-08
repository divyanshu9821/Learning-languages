public class linkedList_findElements {

    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    node head;

    // add number
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
    // public void print() {
    //     if (head == null) {
    //         System.out.println("List is empty");
    //         return;
    //     }
    //     node currNode = head;
    //     while (currNode != null) {
    //         System.out.println(currNode.data);
    //         currNode = currNode.next;
    //     }
    // }

    // find element
    public int findElement(int data) {
        if (head == null) {
            System.out.println("List is empty");
        }
        node currNode = head;

        int index = 0;
        while (currNode != null) {
            if (currNode.data == data) {
                return index;
            }
            currNode = currNode.next;
            index++;
        }
        return -1;
    }

    public static void main(String[] args) {
        linkedList_findElements list = new linkedList_findElements();
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(3);
        // list.print();
        System.out.println("Element present at index: " + list.findElement(7));
    }
}