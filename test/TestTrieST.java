package test;

import trie.TrieST;

/**
 * Created by Silocean on 2016-05-13.
 */
public class TestTrieST {
    public static void main(String[] args) {
        TrieST<Integer> st = new TrieST<>();
        st.put("by", 4);
        st.put("sea", 6);
        st.put("sells", 1);
        st.put("shells", 3);
        st.put("sho", 0);
        st.put("shore", 7);
        st.put("the", 5);
        for (String s : st.keysWithPrefix("sh")) {
            System.out.println(s);
        }
    }
}
