package src.Strings;


public class RearrangeSpaces {
    public static void main(String[] args) {
        String text = "  this   is  a sentence ";

     System.out.println(reorderSpaces(text));
    }
    public static String reorderSpaces(String text) {
        
        // create array of words only
        String[] words = text.trim().split("\\s+");
        
        // letters count
        int letters_count  = 0;
        
        // count sum of letters (not spaces)
        for (String ss : words) {
            letters_count += ss.length();
        }
        
        int count_spaces_between = 0;
        int count_spaces_after = 0;
        
        // decide how many spaces
        if (words.length == 1) {
            count_spaces_after = text.length() - letters_count;
        } else {
            count_spaces_after = (text.length() - letters_count) % (words.length - 1);
            count_spaces_between = (text.length() - letters_count) / (words.length - 1);
        }
        
        // create spaces between words
        String spaces_between = "";
        for(int i = 0; i < count_spaces_between; i++) {
            spaces_between +=" ";
        }
        
        // create spaces after words if have
        String spaces_after = "";
        for(int i = 0; i < count_spaces_after; i++) {
            spaces_after += " ";
        }
        
        // create final string
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < words.length; i++) {
            if(i == words.length-1) {
                sb.append(words[i]);
            }else{
                sb.append(words[i]);
                sb.append(spaces_between);
            }
        }
        
        // add spaces after words to the end of string
        sb.append(spaces_after);
        return sb.toString();
    }
}
