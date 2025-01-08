public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        list.AppendNode(node1);
        list.AppendNode(node2);
        list.AppendNode(node3);
        list.AppendNode(node4);
        list.AppendNode(node5);
        list.DisplayList();

        list.DeleteNode(3);
        list.DisplayList();

        list.InsertNode(node4, 3);
        list.DisplayList();
    }
}



