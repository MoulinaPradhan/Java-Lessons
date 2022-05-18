
class Node{
	Node links[]= new Node[26];
	Node get(char ch){
		return links[ch-'a'];
	}
	void put(char ch, Node node){
		links[ch-'a' ] = node;
	}
	boolean contains(char ch){
		return links[ch-'a'] != null;
	}
}
public class CountDistinct
{
    public static void main(String[] args) {

        String s1 = "ababa";
        System.out.println("Total number of distinct substrings : " + 
        countDistinctSubstrings(s1));
    
        String s2 = "ccfdf";
        System.out.println("Total number of distinct substrings : " + 
        countDistinctSubstrings(s2));
    
      }

	public static int countDistinctSubstrings(String s) 
	{
		Node root = new Node();
		int count =0;
		for(int i=0;i<s.length();i++){
			Node node = root;
			for(int j=i;j<s.length();j++){
				char ch = s.charAt(j);
				if(!node.contains(ch)){
					node.put(ch,new Node());
					count++;
				}
					node = node.get(ch);
					
				
			}
		}
		return count+1;
	}
}
