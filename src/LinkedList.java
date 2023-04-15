public class LinkedList<T> {
    private Node<T> head;

    public void add(T value){
        if(head==null){
            head = new Node<>(value);
        }else{
            Node<T> curr = head;
            while(curr.getNext()!=null){
                curr = curr.getNext();
            }
            curr.setNext(new Node<>(value));
        }
    }

    public boolean contains(T value){
        Node<T> curr = head;
        while(curr!=null){
            if(curr.getData().equals(value)){
                return true;
            }
            curr = curr.getNext();
        }
        return false;
    }

    public LinkedListIterator<T> iterator() {
        return new LinkedListIterator<>(head);
    }


    private static class Node<T>{
        private T data;
        private Node<T> next;

        public Node(T value){
            this.data = value;
            this.next=null;
        }
        public T getData(){
            return data;
        }

        public Node<T> getNext(){
            return next;
        }

        public void setData(T value){
            data = value;
        }

        public void setNext(Node<T> next){
            this.next = next;
        }
    }
    public static class LinkedListIterator<T> {
        private Node<T> current;

        public LinkedListIterator(Node<T> head) {
            this.current = head;
        }

        public boolean hasNext() {
            return current != null;
        }

        public T next() {
            T data = current.getData();
            current = current.getNext();
            return data;
        }
    }
}
