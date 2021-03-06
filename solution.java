import java.util.*;

public class solution<Key extends Comparable<Key>, Value> {
    private Node root;             

    private class Node {
        private Key key;           
        private Value val;         
        private Node left, right;  
        private int size; 
       

        public Node(Key key, Value val, int size) {
            this.key = key;
            this.val = val;
            this.size = size;
        }
    }
    public solution() {
        root=null;
    }
    public boolean isEmpty() {
        if(size()==0)
            return true;
        return false;      
    }
    public int size() {
        return size(root);    
    }

    private int size(Node x) {
        if(x==null) return 0;
        return x.size;      
    }
    public Value get(Key key) {
        
        return get(root,key);     
    }

    private Value get(Node x, Key key) {
        if(key==null)
            throw new IllegalArgumentException ("Key is null............!!!!!!!!!!");
        if(x==null) return null;
        int cmp=key.compareTo(x.key);
        if (cmp < 0) return get(x.left, key);
        else if(cmp > 0) return get(x.right,key);
        else return x.val;
    }
    public void put(Key key, Value val) {
        if(key==null)
        {
            throw new IllegalArgumentException ("Key is null..............!!!!!!!!!!!!");   
        }
         root = put(root,key,val);
    }
    private Node put(Node x, Key key, Value val) {
         if(x==null) return new Node (key, val, 1);
        int cmp = key.compareTo(x.key);
        if      (cmp < 0) x.left = put(x.left, key, val);
        else if (cmp > 0) x.right = put(x.right, key,val);
        else if (cmp== 0) x.val = val;
        x.size =  size(x.left) + size(x.right)+1;
        return x;
    }   
      public void deleteMin() {
        
        root = deleteMin(root);
        
    }
    private Node deleteMin(Node x) {
        if (x.left == null) return x.right;
        x.left = deleteMin(x.left);
        x.size = size(x.left) + size(x.right) + 1;
        return x;
    }
    public void delete(Key key) {
        root = delete(root, key);   
    }

    private Node delete(Node x, Key key) {
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if      (cmp < 0) x.left  = delete(x.left,  key);
        else if (cmp > 0) x.right = delete(x.right, key);
        else { 
            if (x.right == null) return x.left;
            if (x.left  == null) return x.right;
            Node t = x;
            x = min(t.right); 
            x.right = deleteMin(t.right);
            x.left = t.left;
        } 
        x.size = size(x.left) + size(x.right) + 1;
        return x;
    } 
    public Key min() {
       return min(root).key;
    } 

    private Node min(Node x) { 
         if(x.left==null) 
            return x;
         return min(x.left);
    }


     public Key floor(Key key) {
         Node newest = floor(root, key);
        return newest.key;
        
    }
    private Node floor(Node x, Key key) {
         if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if(cmp == 0) return x;
        if(cmp < 0) return floor(x.left, key);

        Node t = floor( x.right, key);
        if(t != null) return t;
        else{
            return x;
        }
    } 
    public Key select(int k) {
         if (k < 0 || k >= size())  return null;
        Node x = select(root, k);
        return x.key;
    }
    private Node select(Node x, int k) {
        if (x == null) return null;
        int t = size(x.right);
        if      (t > k) return select(x.right,  k);
        else if (t < k) return select(x.left, k -t - 1); 
        else                  return x;    
    } 
    public Iterable<Key> keys(Key lo, Key hi) {
         if (lo == null) throw new IllegalArgumentException("first argument to keys() is null............");
        if (hi == null) throw new IllegalArgumentException("second argument to keys() is null............");

        LinkedList<Key> arr = new LinkedList<Key>();
        keys(root, arr, lo, hi);
        return arr;  
    } 

     private void keys(Node x,LinkedList<Key> arr, Key lo, Key hi) { 
        if (x == null) return; 
        int cmplo = lo.compareTo(x.key); 
        int cmphi = hi.compareTo(x.key); 
        if (cmplo < 0) keys(x.left, arr, lo, hi); 
        if (cmplo <= 0 && cmphi >= 0) arr.add(x.key); 
        if (cmphi > 0) keys(x.right, arr, lo, hi);
        
    } 
     public static void main(String[] args)
    {
        solution<String,Integer> obj = new solution <String,Integer>();
        obj.put("Ada",1);
        obj.put("Ballerina",3);
        System.out.println(obj.get("Ada"));
        obj.put("Html",5);
        obj.put("Java",7);
        System.out.println(obj.get("Java"));
        System.out.println(obj.size());
        System.out.println(obj.min());
        System.out.println(obj.floor("Ballerina"));
        System.out.println(obj.select(3));
        obj.put("Java",8);
        obj.put("Dart",9);
        System.out.println(obj.get("Java"));
        System.out.println(obj.size());
        obj.deleteMin();

        obj.delete("Java");



    }
}
