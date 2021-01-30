
public class ProposedCombination extends Combination {

	public ProposedCombination() {
		super();
	}

	public void getFromUser() {
		Console console = new Console();
		Color[] combination = new Color[Combination.combinationSize];
		String askedCombination;
		boolean error = false;
		do {
			error = false;
			console.out("Propose a combination ");
			askedCombination = console.inString();
			if (askedCombination.length() != Combination.combinationSize) {
				console.out("Wrong proposed combination length.\n");
				error = true;
				continue;
			}
			for (int i = 0; i < askedCombination.length(); i++) {
				if (Color.valueOf(askedCombination.charAt(i)) == null) {
					console.out("Wrong colors, they must be: " + Color.getValidColors() + "\n");
					error = true;
					break;
				}
			}
		} while (error);
		for (int i = 0; i < Combination.combinationSize; i++) {
			combination[i] = Color.valueOf(askedCombination.charAt(i));
		}
		this.setCombination(combination);
	}

}
