package starbuzz;

public abstract class Bevarage {
	public String description;
	public boolean milk;
	public boolean soy;
	public boolean mocha;
	public boolean whip;

	public Bevarage() {
		super();
	}

	public Bevarage(String description, boolean milk, boolean soy, boolean mocha, boolean whip) {
		super();
		this.description = description;
		this.milk = milk;
		this.soy = soy;
		this.mocha = mocha;
		this.whip = whip;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isMilk() {
		return milk;
	}

	public void setMilk(boolean milk) {
		this.milk = milk;
	}

	public boolean isSoy() {
		return soy;
	}

	public void setSoy(boolean soy) {
		this.soy = soy;
	}

	public boolean isMocha() {
		return mocha;
	}

	public void setMocha(boolean mocha) {
		this.mocha = mocha;
	}

	public boolean isWhip() {
		return whip;
	}

	public void setWhip(boolean whip) {
		this.whip = whip;
	}

	public int cost() {
		int temp = 0;
		if (isMilk()== true) {
			temp += 5;
		} else if (isMocha()== true) {
			temp += 3;
		} else if (isSoy()== true) {
			temp += 7;
		} else if (isWhip()== true) {
			temp += 9;
		}
		return temp;
	}

}
