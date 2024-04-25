package DSA.LinkedList.Implementation;

import java.lang.reflect.AnnotatedArrayType;

public class LinkedList {
    private    Node head;
    private Node tail;
    int size;
    public LinkedList() {
        this.size = 0;
    }
    public void addFirst(int value){

        Node node=new Node(value);


        node.next=head;
        //declare current node as head.
        head=node;

        //if LL contains only one element , tail and head will point to same element
        if (tail==null){
            tail=head;
        }
        ///increase the size of LL by 1
        size+=1;
    }

    // to return head
    public int peek(){

        if (size==0){
            throw new RuntimeException("LL is Empty");
        }
        return head.val;
    }

    //to return tail
    public int poll(){
        if (size==1){
            return peek();
        }
        Node node=head;

       for (int a=0;a<size-1;a++){
           node=node.next;
       }
        return node.val;
    }
    public void addLast(int val){
        //if LL is null then add that element to first index
        // for that we are calling insertFirst(val) method.
        if (tail==null){
            addFirst(val);
            //by writing return below code will not get executed.
            return;
        }
        //create new node for inserting
        Node node=new Node(val);


        tail.next=node;

        //do tail of LL current node.
        tail=node;

        //increment the size of LL by 1
        //because we are adding element into LL.
        size+=1;

    }
    public  void set( int index,int val){
       if (index==0){
           addFirst(val);
           return;
       }
       if (index==size){
           addLast(val);
           return;
       }
       Node temp= head;
       for (int a=1;a<index;a++){
           temp=temp.next;
       }
       Node node=new Node(val, temp.next);

       temp.next=node;
    }
    //delete node present at any index
     public  void remove(int index){

        if (index==0){
         removeFirst();
         return;
        }
        if (index==size-1){
            removeLast();
            return;
        }
        Node previous =get1(index-1);
        previous.next= previous.next.next;

        size--;
     }

     //get any Node reference  by giving index
     public Node get1(int index){

         if (index>size){
             return null;
         }
         Node temp =head;

         for (int a=0;a< index;a++){
             temp=temp.next;
         }
         return temp;
     }
     public int get(int index){
        Node temp =head;

        for (int a=0;a< index;a++){
            temp=temp.next;
        }
        return temp.val;
    }
    public  void removeFirst(){
        Node temp =head;

        head=temp.next;

        if (head==null){
            tail=null;
        }

        size--;
    }
    public void removeLast(){

        if (size<=1){
            removeFirst();
            return;
        }
        Node node=head;
        for (int a=0;a<size-2;a++){
            node=node.next;
        }
       node.next=null;
        tail=node;
        size--;
    }
    public  void display(){
        Node temp=head;
        System.out.print("[ ");
        while (temp != null){
            System.out.print(temp.val );

            if (temp.next!=null){
                System.out.print(" , " );
            }
            temp=temp.next;

        }
        System.out.print(" ]");
    }
    private class Node{
        private int val;
        private Node next;
        public Node(int val) {
            this.val = val;
        }
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

}
