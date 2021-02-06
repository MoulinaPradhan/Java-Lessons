package src.ArrayList;
import java.util.*;

public class RankTeamsVote {
    public static void main(String[] args) {
        String votes[] = {"ABC","ACB","ABC","ACB","ACB"};
  
  }

    private  Map<Character, Map<Integer, Integer>> votesMap = new HashMap<>(26);

    public String rankTeams(String[] votes) {
        
        if (votes.length == 1) {
            return votes[0];
        }
        
        for (String vote: votes) {
            char[] ranking = vote.toCharArray();
            //very string in votes is a collection of ordered parties
            // the highest rank is the first - rank 0
            for (int rankNumber = 0; rankNumber < ranking.length; rankNumber++) {
                char party = ranking[rankNumber];
                votesMap.putIfAbsent(party, new HashMap<>(26));
                Map<Integer,Integer> partyVotes = votesMap.get(party);
                partyVotes.put(rankNumber, partyVotes.getOrDefault(rankNumber, 0) +1);
            }
        }
        
        // Not all characters might have been collected, so we will get a list of all the parties
        // the list's size will be less or equal to 26
        List<Character> parties = votesMap.keySet().stream().collect(Collectors.toList());
        
        // Sorting the list using a comparator
        //  we go over the 26 possible ranks (as there are most 26 parties), and
        // for each rank we check if the left party has the same number of votes
        // as the right one, if it does, we will continue to then next round
        // the usage of abs is to have the compare method return -1 or 1
        // if  compare returns 1 it means the left element in the pair wins over the right element
        // and will come first in the sort
        Collections.sort(parties, new Comparator<Character>() {
            public int compare(Character lhs, Character rhs) {
                for (int counter = 0; counter < 26; counter++) {
                    int lhsPositionVotes = votesMap.get(lhs).getOrDefault(counter,0);
                    int rhsPositionVotes = votesMap.get(rhs).getOrDefault(counter,0);
                    if (lhsPositionVotes == rhsPositionVotes) {
                        continue;
                    }
                    
                    // -1 -> lhs has more votes, and should be before rhs
                    // 1 -> rhs has more votes , and should be before lhs
                    int result =  (rhsPositionVotes - lhsPositionVotes) / Math.abs(rhsPositionVotes - lhsPositionVotes);
                    return result;
                }
                
                // rhs == lhs 
                return Character.compare(lhs, rhs) / Math.abs(Character.compare(lhs, rhs));
            }
        });
        
        // Go over the list using an intetor, and add it element by element to  the StringBuilder
        StringBuilder sb = new StringBuilder();
        Iterator<Character> iter = parties.iterator();
        while (iter.hasNext()) {
            sb.append(iter.next());
        }
        return sb.toString();
    }
}