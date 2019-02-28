  public void UpArrowO(double b) {
		ReInfinite a1 = this;
		for (double i = 0; i < b; i++) {
			this.power(a1);
		}
	}
	public void UpArrow(double b) {
		ReInfinite a1 = this;
		double c = 1;
		for (int i = 0; i < 50; i++) {
			if (b % i == 0) {
				c = i;
				break;
			}
		}
		for (double i = 0; i < b; i += c) {
			for (double j = 0; j < c; j++) {
				this.power(a1);
			}
		}
	}
