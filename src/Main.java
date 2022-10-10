
// LinkedList = NODE -> NODE -> NODE .....
// Node = data, next
public class Main {

	private static Node<Integer> createLinkedList() {
		// First I created a 4 independent nodes seperately, 10 20 30 40
		// I have made a connection between those nodes using next reference
		// 10 -> 20 -> 30 -> 40
		// And I return the head node of this linkedlist (n1 which holds the data 1).
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> n4 = new Node<>(40);
		Node<Integer> n5 = new Node<>(50);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		return n1;
	}

	private static void printLinkedList(Node<Integer> head) {
		// To traverse a linkedlist, first we need head node, we can traverse every node
		// using its next reference.
		Node<Integer> temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next; // It is used to visit every node.
		}
		System.out.println("");
	}

	private static void increment(Node<Integer> head) {
		Node<Integer> temp = head;
		while (temp != null) {
			temp.data = temp.data * 10;
			temp = temp.next;
		}
	}

	private static int length(Node<Integer> head) {
		Node<Integer> temp = head;
		int length = 0;
		while (temp != null) {
			length++;
			temp = temp.next;
		}
		return length;
	}

	private static void printIthNode(Node<Integer> head, int i) {
		Node<Integer> temp = head;
		int count = 0;
		while (temp != null && count < i) {
			count++;
			temp = temp.next;
//			if(i == count) {
//				break;
//			}
		}
		System.out.println(temp.data);
	}

	public static void main(String[] args) {

		Node<Integer> head = createLinkedList();
		increment(head);
		printLinkedList(head);
		System.out.println(length(head));
		printIthNode(head, 4);
	}
}
