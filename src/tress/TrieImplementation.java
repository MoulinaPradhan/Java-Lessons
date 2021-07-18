import java.util.*;

import java.io.*;

public class TrieImplementation {
 
    public static class Trie {
    
    private class Node{
        Node [] childs;
        boolean isEnd;

        Node(){
            childs = new Node[26];
        }
    }

    final private Node root;
    public Trie(){
        root = new Node();
    }

    /*Insert a word*/
    public void insert(String word){
    
    Node curr = root;
    for (int i = 0; i < word.length(); i++){
        char ch = word.charAt(i);

        if(curr.childs[ch-'a'] == null){
            curr.childs[ch-'a'] = new Node();
        }
        curr = curr.childs[ch-'a'];
    }
    }
    /*Search a word*/
    public boolean search(String word){
Node curr = root;

for(int i = 0; i < word.length(); i++){
    char ch = word.charAt(i);

    if(curr.childs[ch-'a'] == null) return false;
    curr = curr.childs[ch-'a'];
}
return curr.isEnd;
    }
    
    /*bolean if there is word starts with another word*/  
    
    public boolean startsWith(String prefix){

        Node curr = root;

        for(int i = 0; i < prefix.length(); i++){
            char ch = prefix.charAt(i);
            if(curr.childs[ch-'a'] == null) return false;
            curr= curr.childs[ch-'a'];
        }
        return true;
    }





    }

     public static void main(String[] args) throws IOException {
       System.out.println("w"); 
       String m = "Lu";

       System.out.println(m.startsWith("l"));
    }
}
