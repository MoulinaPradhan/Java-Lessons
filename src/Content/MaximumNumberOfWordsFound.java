// print the sentence with maximum number of words found
public class MaximumNumberOfWordsFound {

    public static String numOfWords(String sentences[]){
        String ans ="";int mx=0;
        for(int i =0;i<sentences.length;i++)
        {
            // converting the current sentence into array on the basis of spaces and finding its length
            String current[] = sentences[i].split(" ");
        if(mx<current.length) {
            mx= current.length;
            ans=sentences[i];
        }
        }
        return ans;
    }
   public static void main(String[] args) {
     String sentences []= {"I love GeeksForGeeks", "we want more cousres", "this is great thanks very much","Geeksforgeeks is the best website for education in whatever field you like"};
     System.out.println(numOfWords(sentences));
     System.out.println(countSpaces(sentences));
   
    } 


// for each sentence count spacse and get the max
// return 1+spacesCount which is number of words

public static String countSpaces(String sentences []){
   int max =0;String ans ="";
    for(String sentence: sentences){
        int countSpace=0;
        for(int i=0;i<sentence.length();i++){
            countSpace+=sentence.charAt(i);
            if(max < countSpace){
                max = countSpace;
                ans = sentence;
            }
        }
    }
        return ans;
    }
}



