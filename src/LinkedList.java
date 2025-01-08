public class LinkedList {
    Node head;

    LinkedList(){
        this.head = null;
    }

    public void AppendNode(Node newNode){
        Node current = this.head;
        if(current == null){
            this.head = newNode;
        }else {
            // Anda até o final da lista
            while(current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void InsertNode(Node newNode, int index){
        Node current = this.head;

        for(int i =0; i < index -1 && current != null; i++){
            current = current.next;
        }

        if(current != null){
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public int DeleteNode(int index){

        Node current = this.head;
        Node prev = null;
        int deletedValue = -1;

        if(index == 0){
            deletedValue = current.data;
            this.head = this.head.next;
            return deletedValue;
        }

        for (int i = 0; i < index && current != null; i++) {
            prev = current;
            current = current.next;
        }
        if(current != null){
            deletedValue = current.data;
            prev.next = current.next;
        }
        return deletedValue;
    }

    public void DisplayList(){
        Node current = this.head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}

