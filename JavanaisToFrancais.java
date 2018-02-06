package com.aliyou.JavanaisToFrancais;

public class JavanaisToFrancais {
	private char car;
	private String javanaisInTofrancais;

	public boolean isVowel(char c) {
		this.car = c;
		String vowels = "aeiouy";

		if (vowels.indexOf(this.car) != -1 || vowels.toUpperCase().indexOf(this.car) != -1) {
			return true;
		}
		return false;
	}

	public boolean isConsonant(char c) {
		this.car = c;
		String consonants = "bcdfghjklmnpqrstvwxz";

		if (consonants.indexOf(this.car) != -1 || consonants.toUpperCase().indexOf(this.car) != -1) {
			return true;
		}
		return false;
	}

	public String javanaisInTofrancais(String javanaisInTofrancais) {
		this.javanaisInTofrancais = javanaisInTofrancais;

		while (this.javanaisInTofrancais.indexOf("av") != -1) {
			int position = this.javanaisInTofrancais.indexOf("av");

			if (position == 0 && isVowel(this.javanaisInTofrancais.charAt(position + 2))
					|| isConsonant(this.javanaisInTofrancais.charAt(position - 1))
							&& isVowel(this.javanaisInTofrancais.charAt(position + 2)))
				this.javanaisInTofrancais = this.javanaisInTofrancais.replace("av", "");
		}
		return this.javanaisInTofrancais;
	}

}
