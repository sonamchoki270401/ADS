import java.util.*;
public class SequentialSearchST<Key, Value> {
    /**
     * Initializes an empty symbol table.
     */
    int size;//total number of element
    Node head;//first element

    //class Node
    class Node {
        Key key;           
        Value val;
        Node next;  
        //constructor
        public Node(Key key, Value val, Node next) {
            this.key = key;
            this.val = val;
            this.next = next ;
            
        }
    }
    public SequentialSearchST() {
        size=0;
        head = null; 
     }

    /**
     * Returns the number of key-value pairs in this symbol table.
     *
     * @return the number of key-value pairs in this symbol table
     */
    public int size() {
        return size;
    }

    /**
     * Returns true if this symbol table is empty.
     *
     * @return {@code true} if this symbol table is empty;
     *         {@code false} otherwise
     */
    public boolean isEmpty() {
        if(size==0)
        {
            return true;
        }
        return false;
    }

    /**
     * Returns true if this symbol table contains the specified key.
     *
     * @param  key the key
     * @return {@code true} if this symbol table contains {@code key};
     *         {@code false} otherwise
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public boolean contains(Key key) {
        if(key==null)
        throw new IllegalArgumentException("You fool!! issa error");
       
         else if(get(key)==null)
            {
                return false;
            }
        return true;
        
    }

    /**
     * Returns the value associated with the given key in this symbol table.
     *
     * @param  key the key
     * @return the value associated with the given key if the key is in the symbol table
     *     and {@code null} if the key is not in the symbol table
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public Value get(Key key) {
        for(Node x=head;x!=null;x=x.next){
              if (key == x.key) 
                return x.val;
        }
        return null;
        }
    

    /**
     * Inserts the specified key-value pair into the symbol table, overwriting the old 
     * value with the new value if the symbol table already contains the specified key.
     * Deletes the specified key (and its associated value) from this symbol table
     * if the specified value is {@code null}.
     *
     * @param  key the key
     * @param  val the value
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public void put(Key key, Value val) {
       if (key == null) {
        //throw new IllegalArgumentException("the argument put() is null");
        System.out.println("head argument to put() is null");
        return; 
          
        }
        Node newest = new Node(key,val,null);
        if(head==null)
            {
                head=newest;
                size++;//increment the size by 1
            }
        else if(head.next==null || head.next!=null){
            for (Node x = head; x != null; x = x.next) {
            if (key==x.key) {
                x.val = val;
                return;
            }
        }
        newest.next=head;
        head=newest;
        size++;
    }

}

    /**
     * Removes the specified key and its associated value from this symbol table     
     * (if the key is in this symbol table).    
     *
     * @param  key the key
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public void delete(Key key) {
        if (key == null) throw new IllegalArgumentException("issa null yar.."); 
        head = delete(head, key);
        
    }

    // delete key in linked list beginning at Node x
    // warning: function call stack too large if table is large
    private Node delete(Node x, Key key) {
     if (x == null) 
            return null;
        if (x.key==key) {
            size--;//decrement the size by 1
            return x.next; 
        }
        x.next = delete(x.next, key);
        return x;

    
    }

    /**
     * Returns all keys in the symbol table as an {@code Iterable}.
     * To iterate over all of the keys in the symbol table named {@code st},
     * use the foreach notation: {@code for (Key key : st.keys())}.
     *
     * @return all keys in the symbol table
     */
    public Iterable<Key> keys()  {
        LinkedList<Key> link = new LinkedList<Key>();
        for (Node x = head; x != null; x = x.next)
        link.add(x.key);
        return link; 
    }
    /**
         main method
     */
    public static void main(String[] args) {
        SequentialSearchST<String, Integer> st = new SequentialSearchST<String, Integer>();
        st.put("Pema",3);
        st.put("Choki",6);
        st.put("Sonam",2);
        st.put("chimi",9);
        st.put(null,10);

        st.delete("Pema");
        
        System.out.println(st.keys());
       
        System.out.println(st.isEmpty());
        System.out.println(st.size());
        System.out.println(st.contains("Choki"));
        System.out.println(st.get("Choden"));
        System.out.println(st.get("chimi"));
        // Testing the functions
        assert(st.isEmpty() == false);

        System.out.println("All the functions are working.");
    }
}
