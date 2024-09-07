class LL {
    Node head;
    private int size;
    LL(){
        this.size=0;
    }

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    //add first
    public void addFirst(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
           return;
        }
        newnode.next=head;
        head=newnode;
    }
    //addlast
    public void addLast(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
           return;
        }
        Node currnode = head;
        while(currnode.next!=null){
            currnode=currnode.next;
        }
        currnode.next=newnode;
    }
    //print
    public void printList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currnode = head;
        while(currnode!=null){
            System.out.print(currnode.data+" -> ");
            currnode=currnode.next;
        }
        System.out.println("NULL");
    }
    //deletefirst
    public void deleteFirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }size--;
        head=head.next;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondlast=head;
        Node lastNode=head.next;
        while (lastNode.next!=null) {
            lastNode=lastNode.next;
            secondlast=secondlast.next;
            
        }
        secondlast.next=null;
    }
    public int getSize(){
        return size;
    }
    public void reverseList(){
        if(head==null||head.next==null){
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while (currNode!=null) {
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;            
        }
        head.next=null;
        head=prevNode;
    }

    public static void main(String[] args) {
        LL list = new LL();
        
        /*list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();
        list.addFirst("this");
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        
        System.out.println(list.getSize());
        list.addFirst("this");
        list.printList();
        System.out.println(list.getSize());*/
        
        list.addFirst("1");
        list.addLast("2");
        list.addLast("3");
        list.reverseList();
        list.printList();
        
    }
    
}