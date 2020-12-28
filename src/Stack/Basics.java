package src.Stack;

import java.util.*;

public class Basics {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
   
    st.push(10);   //adding items
    st.push(80);
System.out.println(st);
st.push(90);
st.push(60);
System.out.println(st);
System.out.println(st.peek()+" size -> "+st.size());
st.pop();   //to remove the element
System.out.println(st.peek()+" size -> "+st.size());
}
}