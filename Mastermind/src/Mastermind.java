
public class Mastermind {
	
	Game game;
	
	public void play() {
		do {
			game = new Game();
			this.game.play();
		} while (this.isResumed());
	}
	private boolean isResumed() {
		Console g = new Console();
		char answer;
		do {
			g.out("RESUME? (y/n): ");
			answer = g.inChar();
		} while (!(answer == 'y') && !(answer == 'n'));
		return answer == 'y';
	}
	public static void main(String[] args) {
		new Mastermind().play();
	}
}
