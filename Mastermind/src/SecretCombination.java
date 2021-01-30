import java.util.Collections;
import java.util.Random;

public class SecretCombination extends Combination {

	@Override
	public void show() {
		String xs = String.join("", Collections.nCopies(Combination.combinationSize, "x"));
		new Console().out(xs + "\n");
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
		Color[] combo = new Color[Combination.combinationSize];
		String colors = Color.getValidColors();
		int valueToDelete;
		Random random = new Random();
		do {
			valueToDelete = random.nextInt(colors.length());
			colors = colors.substring(0,valueToDelete) + colors.substring(valueToDelete+1, colors.length());
		} while (colors.length() != Combination.combinationSize);
		for (int i=0;i<Combination.combinationSize;i++) {
			combo[i] = Color.valueOf(colors.charAt(i));
		}
		this.setCombination(combo);
		new Console().out(colors);
	}

}
