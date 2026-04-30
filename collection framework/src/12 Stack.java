import java.util.Stack;

class stack {
     public static void main(String[] args) {
         Stack st=new Stack();
        st.push(200);
        st.push(300);
        st.push(400);
        st.push(500);
        st.push(600);
        st.push("jya");
        st.push("khan");
        st.push("arif");
         System.out.println(st);
         System.out.println(st.pop());//it is used to retrieve the element from the top of the stack and remove this element from the stack
         System.out.println(st);
         System.out.println(st.peek());//it is used to retrieve the element from type top of the stack without removing of the stack
         System.out.println(st);
         System.out.println(st.search("jya"));
         //it is return  the index of the object in stack index is start from 1 and
         // if object is not present in stack then it returns -1
         System.out.println(st.empty());
         //it check the stack is empty or not
     }
}
