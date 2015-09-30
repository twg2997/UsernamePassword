import javax.swing.JOptionPane;
public class BooleanandIfelse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String peopleNum;
		peopleNum = JOptionPane.showInputDialog("Enter the number of people");
		int numPeople = Integer.parseInt(peopleNum);
		int groupSize = 0;
		
		
		if (numPeople > 10)
		{
			groupSize = numPeople/2;
			JOptionPane.showMessageDialog(null, "The number of people is " + numPeople + " and the group-size is " + groupSize + ".");
		}
					
		else if (numPeople >= 3){
				
			groupSize = numPeople/3;
			JOptionPane.showMessageDialog(null, "The number of people is " + numPeople + " and the group-size is " + groupSize + ".");
		}
		
		else{
			
			JOptionPane.showMessageDialog(null, "The number of people must be at least 3.");
		}
		String playersNum;
		playersNum = JOptionPane.showInputDialog("Enter the number of players.");
		int numPlayers = Integer.parseInt(playersNum);
		int teamSize = 0;
		
		if (numPlayers >= 11 && numPlayers <= 55){
			teamSize = numPlayers/11;
			JOptionPane.showMessageDialog(null, "The number of players is " + numPlayers + " and team-size is " + teamSize + ".");
		}
		else{
			teamSize = 1;
			JOptionPane.showMessageDialog(null, "The number of players is " + numPlayers + " and the team-size is " + teamSize + ".");
					
		}
		

	}

}

