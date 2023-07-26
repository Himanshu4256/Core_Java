package Learning_Java11.collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo{
//    int id;
//    String names,author,publisher;
//
//    public PriorityQueueDemo(int id, String names, String author, String publisher) {
//        this.id = id;
//        this.names = names;
//        this.author = author;
//        this.publisher = publisher;
//    }
//
//    @Override
//    public int compareTo(PriorityQueueDemo o) {
//        if (id>o.id){
//            return 1;
//        }
//        else if (id<o.id){
//            return -1;
//        }
//        else {
//            return 0;
//        }
//    }

    public static void main(String[] args) {
        PriorityQueue<String> q = new PriorityQueue<String>();
        q.add("Amit Sharma");
        q.add("Vijay");
        q.add("JaiShankar");
        q.add("Raj");

        System.out.println("head :"+q.element());
        System.out.println("head :"+q.peek());
        System.out.println("Iterating the queue element");
        Iterator itr = q.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        q.remove();
        q.poll();
        System.out.println("after removing two element");
        Iterator<String> itr2 = q.iterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}
