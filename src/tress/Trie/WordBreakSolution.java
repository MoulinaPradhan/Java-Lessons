// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
public class WordBreakSolution
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n;
                    n = sc.nextInt();
                    ArrayList<String> arr = new ArrayList<String>();
                    for(int i = 0;i<n;i++)
                        {
                            String p = sc.next();
                            arr.add(p);
                        }
                    String line = sc.next();
                    Solution obj = new Solution();  
                    System.out.println(obj.wordBreak(line,arr));  
                    
                }
        }
}// } Driver Code Ends


//User function Template for Java
class Node{
    Node links[]= new Node[26];
    boolean isEnd = false;
    Node get(char ch){
        return links[ch-'a'];
    }
    boolean contain(char ch){
        return links[ch-'a']!= null;
    }
    void put(char ch,Node node){
        links[ch-'a']= node;
    }
}
class Trie{
    public static Node root;
    Trie(){
        root = new Node();
    }
    
    public static void insert(String word){
        Node node = root;
        for(int i=0;i< word.length();i++){
            char ch = word.charAt(i);
            if(!node.contain(ch)){
                node.put(ch, new Node());
            }
            node = node.get(ch);
        }
        node.isEnd = true;
    }
    public static int search (String word){
        Node node = root;
        for(int i=0;i<word.length();i++){
              char ch = word.charAt(i);
            if(!node.contain(ch)) return 0;
        }
        if(node.isEnd == false) return 0;
        return 1;
    } 
}
class Solution
{
    public static int wordBreak(String A, ArrayList<String> B )
    {
        Trie trie = new Trie();
        for(String s: B){
            trie.insert(s);
        }
     for(int i=0;i<A.length();i++)
     {
if((trie.search(A.substring(0,i))==1) && (wordBreak(A.substring(i,A.length()),B)==1))
         return 1;
     }
     return 0;
    }
}