public class SeparateChainingHashSTtest{
	public static void main(String[] args) { 
        SeparateChainingHashST<String, Integer> st = new SeparateChainingHashST<String, Integer>();
        System.out.println(st.isEmpty());
        System.out.println(st.size());

        st.put("Sonam", 1);
        st.put("Dechen",2);
        st.put("Heki",3);
        st.put("Rinchen",3);
        st.put("Dema",3);

        System.out.println(st.get("Dema"));
       
        System.out.println(st.contains("P"));
        st.delete("Heki");
        System.out.println(st.size());

        assert(st.isEmpty()==false);
        assert(st.size()==4);
        System.out.println("All the function are working");
    }
}