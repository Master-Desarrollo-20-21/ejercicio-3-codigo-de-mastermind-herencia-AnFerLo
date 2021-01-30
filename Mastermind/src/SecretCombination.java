
public class SecretCombination extends Combination {

	@Override
	public void show() {
		new Console().out("xxxx\n");
	}

	public SecretCombination() {
		super();
		this.generate();
	}

	public Result VerifyCombination(ProposedCombination combination) {
		Color[] myCombination = this.getCombination();
		Color[] checkCombination = combination.getCombination();
		Result result = new Result();
		for (int i = 0; i < Combination.combinationSize; i++) {
			if (myCombination[i] == checkCombination[i]) {
				result.addBlack();
			} else {
				for (int j = 0; j < Combination.combinationSize; j++) {
					if (i != j && myCombination[i] == checkCombination[j]) {
						result.addWhite();
					}
				}
			}
		}
		return result;

	}

	public void generate() {
		Color[] combo = new Color[] { Color.RED, Color.GREEN, Color.ORANGE, Color.PINK };
		this.setCombination(combo);
	}

}
