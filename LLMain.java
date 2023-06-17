public class LLMain {

  public static void main(String[] args) {
    LL list = new LL();

    list.insertFirst(1);
    list.insertFirst(2);
    list.insertFirst(3);
    list.insertLast(-4);
    list.insert(2, 8);
    list.display();
  }
}
