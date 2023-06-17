public class LL {

  private Node head;
  private Node tail;
  private int size;

  public LL() {
    this.size = 0;
  }

  public void insertFirst(int val) {
    Node node = new Node(val);
    size++;
    node.next = head;
    head = node;
    if (tail == null) {
      tail = head;
    }
    size++;
  }

  public void insertLast(int val) {
    if (tail == null) {
      insertFirst(val);
      return;
    }
    Node temp = new Node(val);
    tail.next = temp;
    tail = temp;
    size++;
  }

  public void display() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.value);
      System.out.print(" -> ");
      temp = temp.next;
    }
    System.out.print("END");
  }

  public void insert(int index, int val) {
    if (index == 0) {
      insertFirst(val);
      return;
    }
    if (index == size) {
      insertLast(val);
      return;
    }
    Node traverseNode = head;
    for (int i = 1; i < index; i++) {
      traverseNode = traverseNode.next;
    }
    Node prevNode = traverseNode;
    traverseNode = traverseNode.next;
    Node newnode = new Node(val, prevNode);
    prevNode.next = newnode;
    newnode.next = traverseNode;
    size++;
  }

  private class Node {

    private int value;
    private Node next;

    Node(int val) {
      this.value = val;
    }

    Node(int val, Node node) {
      this.value = val;
      this.next = node;
    }
  }
}
