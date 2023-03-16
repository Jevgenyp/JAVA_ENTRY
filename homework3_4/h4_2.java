//Реализуйте очередь с помощью LinkedList со следующими методами:
//• enqueue() — помещает элемент в конец очереди,
//• dequeue() — возвращает первый элемент из очереди и удаляет его,
//• first() — возвращает первый элемент из очереди, не удаляя.

    import java.util.LinkedList;
    import java.util.LinkedList;
    import java.util.Queue;

public class h4_2 {
    LinkedList<Integer> list;

    public LinkedList<Integer> Queue() {
        list = new LinkedList<Integer>();
        return list;
        
    }

    public void enqueue(int data) {
        list.addLast(data);
    }

    public int dequeue() {
        if (list.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return list.removeFirst();
    }

    public int first() {
        if (list.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    
    
    
        public static void main(String[] args) {
            Queue<Integer> queue = new LinkedList<>();
            queue.add(1);
            queue.add(2);
            queue.add(3);
            System.out.println(queue.peek()); // 1
            System.out.println(queue.remove()); // 1
            System.out.println(queue.remove()); // 2
            System.out.println(queue.remove()); // 3
            System.out.println(queue.isEmpty()); // true
        }
    
    
    
}

    

