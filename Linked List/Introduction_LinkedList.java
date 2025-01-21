import java.util.LinkedList;
public class Introduction_LinkedList {
    public static void main(String[] args) {

    LinkedList <String> linkedList = new LinkedList <String>();

    linkedList.offer("A");
    linkedList.push("B");
    linkedList.push("C");
    linkedList.push("D");
    linkedList.push("F");

    linkedList.pop();

    System.out.println(linkedList);

    }
    
}
