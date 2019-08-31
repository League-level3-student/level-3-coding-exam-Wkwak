import java.util.ArrayList;

public class VoteProcessor {

	public String calculateElectionWinner(ArrayList<String> votes) {
		// TODO Auto-generated method stub
		int popeVotes = 0;
		int edVotes = 0; 
		
		for(int i = 0; i < votes.size(); i++) {
			if(votes.get(i).equalsIgnoreCase("pope francis")) {
				popeVotes++;
			}else {
				edVotes++;
			}
		}
		
		if(edVotes == popeVotes) {
			return "TIE";
		}else if(edVotes>popeVotes) {
			return "edward snowden";
		}else {
			return "pope francis";
		}
	}

}
