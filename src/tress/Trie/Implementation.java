import javax.lang.model.util.ElementScanner6;
import javax.swing.text.html.HTMLDocument.BlockElement;

class Node{
    Node links[] = new Node[26];
    boolean isEnd = false;
    boolean containsKey(char ch){
        return  links[ch-'a'] != null;
    }
   void put(char ch,Node nodd){
        links[ch -'a']= nodd;
    }
    Node get(char ch){
        return links[ch-'a'];

    }


}
public class Implementation {
    public static Node root;
    Implementation(){
        root = new Node();
    }

    public static void insert(String word){
        Node node = root;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
         if(!node.containsKey(ch)){
          node.put(ch, new Node());
         }
         node = node.get(ch);
        }
        node.isEnd = true;
    }
    // search 
    public static boolean search(String word){
        Node node = root;
        for(int i=0;i<word.length();i++){
            char ch =word.charAt(i);
            if(!node.containsKey(ch))return false;
node = node.get(ch);
        }
        if(node.isEnd==true)return true;
        return false;

    }
    //startsWith
    public static boolean startsWith(String word){
        Node node = root;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(!node.containsKey(ch)) return false;
            node = node.get(ch);
        }
        return true;
    }
  
    public static void main(String[] args) {
        Implementation trie= new Implementation();
        int n = 5;
        int type[] = {1, 1, 2, 3, 2};
        String value[] = {"hello", "help", "help", "hel", "hel"};
        for(int i=0;i<n;i++){
            if (type[i] == 1) {
                trie.insert(value[i]);
            }
            else if (type[i] == 2) {
                if (trie.search(value[i])) {
                    System.out.println( "true" );
                }
                else {
                    System.out.println("false");
                }
            }
            else {
                if (trie.startsWith(value[i])) {
                    System.out.println("true" );
                }
                else {
                    System.out.println("false");
                }
        }
    }
}
}
