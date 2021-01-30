
public class Combination {
	
	public static final int combinationSize = 4;
	private Color[] combination;
	
	public Combination() {
		combination = new Color[combinationSize];
	}
	
	protected void setCombination(Color[] combination) {
		this.combination = combination;
	}
	
	protected Color[] getCombination() {
		return this.combination;
	}
	
	public void show() {
		for (Color color : combination) {
			new Console().out(color.getKeyword());
		}
	}
}
