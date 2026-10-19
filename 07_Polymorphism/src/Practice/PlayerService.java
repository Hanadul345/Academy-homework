package Practice;

public class PlayerService {
	
	private Player[] players = new Player[3];
		
	public void savePlayer(Player p) {
	for(int i = 0; i < this.players.length; i++) {
		if(this.players[i] == null) {
			this.players[i] = p;
			return;
		}
	}
	}
	
	public void giveGift() {
		
	}
}
