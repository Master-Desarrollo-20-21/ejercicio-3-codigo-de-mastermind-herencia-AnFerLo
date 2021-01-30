
public class Result {

	private int totalBlack;
	private int totalWhite;

	public boolean isWinner() {
		return totalBlack == Combination.combinationSize;
	}

	public void addBlack() {
		totalBlack++;
	}

	public void addWhite() {
		totalWhite++;
	}

	public Result() {
		this.totalBlack = 0;
		this.totalWhite = 0;
	}

	public Result(int white, int black) {
		this.totalBlack = black;
		this.totalWhite = white;
	}
	
	public void show() {
		new Console().out(totalBlack + " blacks and " + totalWhite + " whites\n");
	}

}
