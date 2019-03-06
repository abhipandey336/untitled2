

    class Node {
        int data;
        Node prev;
        Node next;
    }
    class DoublyLinkedList{
        int size = 0;
        Node head = null;
        Node tail = null;

        void insert(Node node) {
            if (head == null) {
                head = node;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                node.prev = temp;
                temp.next = node;
            }
        }
        public static void main(String[] args) {
            DoublyLinkedList obj = new DoublyLinkedList();
            for (int i =0; i < 5; i++) {
                Node node = new Node();
                node.data = (i + 1) * 1000;
                obj.insert(node);
            }
            obj.display();
            obj.delete();
            obj.display();
        }

        void delete(){
            if (head == null) {
                System.out.println("empty list");
            }else{
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                System.out.println("deleting node" + temp.data + "from last");
                temp = temp.prev;
                temp.next = null;
            }

        }
        void display(){
            System.out.println("Doubly LinkedList");
            Node temp = head;
            System.out.println("null<---->");
            while (temp != null) {
                System.out.println(temp.data + "<---->");
                temp = temp.next;
            }
            System.out.println("null");
        }


    }




