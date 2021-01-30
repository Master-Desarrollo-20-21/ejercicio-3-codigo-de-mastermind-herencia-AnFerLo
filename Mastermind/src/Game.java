
public class Game {

	private SecretCombination secretCombination;
	private ProposedCombination[] proposedCombination;
	private Result[] result;
	private int turn;
	private Console console;
	
	public Game() {
		secretCombination = new SecretCombination();
		proposedCombination = new ProposedCombination[10];
		result = new Result[10];
		turn = 0;
		console = new Console();
	}

	public void play() {
		console.out("----- MASTERMIND -----\n");
		this.secretCombination.generate();
		this.showStatus();
		do {
			this.proposedCombination[turn] = new ProposedCombination();
			this.proposedCombination[turn].getFromUser();
			result[turn] = secretCombination.VerifyCombination(proposedCombination[turn]);
			turn++;
			this.showStatus();
		} while (!result[turn-1].isWinner() && turn < 10);
		if (result[turn - 1].isWinner()) {
			console.out("You've won!!! ;-)\n");
		} else {
			console.out("You've lost!!! :-(\n");
		}
	}
	private void showStatus() {
		console.out(turn + " attempt(s)\n");
		this.secretCombination.show();
		for (int i = 0;i <= turn - 1; i++) {
			proposedCombination[i].show();
			console.out(" --> ");
			result[i].show();
		}
	}
}
