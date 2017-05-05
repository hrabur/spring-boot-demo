package bg.proxiad.cours;

public class TenisCounterCongfig {
	public static enum TenisRules {
		OLD, NEW
	}

	public static enum GamesNumber {
		TWO_OF_THREE, THREE_OF_FIVE
	}

	private String player1;
	private String player2;

	private TenisRules rules;
	private GamesNumber games;

	public String getPlayer1() {
		return player1;
	}

	public void setPlayer1(String player1) {
		this.player1 = player1;
	}

	public String getPlayer2() {
		return player2;
	}

	public void setPlayer2(String player2) {
		this.player2 = player2;
	}

	public TenisRules getRules() {
		return rules;
	}

	public void setRules(TenisRules rules) {
		this.rules = rules;
	}

	public GamesNumber getGames() {
		return games;
	}

	public void setGames(GamesNumber games) {
		this.games = games;
	}

}
