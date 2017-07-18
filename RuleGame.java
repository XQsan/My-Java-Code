package rule;

public class RuleGame {
	public void RulesGame() {
		String[][] rule = {
				{"1", "Don't leave the game."},
				{"2", "League is the beat and worst way to win"},
				{"3", "If servant choice the peaceful, that will kill servant"},
				{"4", "Servant mustn't choice the peaceful or don't join in the battle"},
				{"5", "If servants fight with Bella(Master of the game), servants will die"},
				{"6", "If Servant can't find the noble phantasm, The servant can be killed in 3 days"},
				{"7", "The winner will be got a legend present"}
		
		};
		
		
		System.out.println("Rule Game: ");
		
		for(int i = 0; i < rule.length; i++) {
			for (int i2 = 0; i2 < rule[i].length; i2++ ) {
				System.out.println(rule[i][i2]);
			}
			System.out.println();
		}
	
		
	}
	
   
	
}
