import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
public class WordLadder {
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
 int length =0;
 if(!wordList.contains(endWord)) return 0;
 Set<String> set = new HashSet<>(wordList);
 Queue<String> q = new LinkedList<>();
 q.add(beginWord) ;
 while(!q.isEmpty()){
    int size = q.size();
    for(int i=0;i<size;i++){
        String w = q.poll();
        if(w.equals(endWord))return length+1;
        wordMatch(w,set,q);
    }
   
    length++;
 }
return 0;
    
 };
 public static void wordMatch(String w,Set<String> set, Queue q){
    for(int i=0;i<w.length();i++){
        char [] word = w.toCharArray();
        for(int j=0;j<26;j++){
            char c=(char)('a'+j);
            if(word[i] == c) continue;
        word[i] =c;
        String s = String.valueOf(word);
        if(set.contains(s)){
            set.remove(s);
            q.offer(s);
        }
        }
    }
 }
    public static void main(String[] args) {
      String  beginWord = "hit", endWord = "cog";
      String arr[] = {"hot","dot","dog","lot","log","cog"};
      List<String> wordList =Arrays.asList(arr);
      System.out.println(ladderLength(beginWord, endWord, wordList)); 
    }
}
