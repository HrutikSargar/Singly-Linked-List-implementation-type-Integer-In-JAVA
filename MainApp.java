package DSA.LinkedList.Implementation;

public class MainApp {
    public static void main(String[] args) {

        LinkedList linkedList=new LinkedList();

        linkedList.addFirst(12);
        linkedList.addFirst(13);


        linkedList.display();// [ 13 , 12 ]

        linkedList.addLast(56);
        linkedList.display();// [ 13 , 12 , 56]

        linkedList.addFirst(99);
        linkedList.display();//[ 99 , 13 , 12 , 56 ]

        //get node at specific index
        System.out.println(linkedList.get(2));//12

        System.out.println("Peek is  : "+linkedList.peek());//Peek is  : 99

        System.out.println("size "+linkedList.size);//size 4
        System.out.println("get element at index "+linkedList.get(2));

        //removes the node at specific index
        linkedList.remove(2);

        linkedList.display();//[ 99 , 13 , 56 ]

        linkedList.removeFirst();
        linkedList.display();//[ 13 , 56 ]

        linkedList.removeLast();
        linkedList.display();//[ 13 ]

    }
}
