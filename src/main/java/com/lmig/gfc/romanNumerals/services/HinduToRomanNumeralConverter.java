package com.lmig.gfc.romanNumerals.services;

public class HinduToRomanNumeralConverter {

	public String convert(int numberToConvert) {
		String romanNumeral = "";
		String numberConvertedToString = String.valueOf(numberToConvert);

		// Thousands Place - up to 3000
		if (numberConvertedToString.length() == 4) {
			if (numberConvertedToString.charAt(0) == '1') {
				romanNumeral += "M";
			} else if (numberConvertedToString.charAt(0) == '2') {
				romanNumeral += "MM";
			} else if (numberConvertedToString.charAt(0) == '3') {
				romanNumeral += "MMM";
			}
			// Removing Thousands Place
			numberConvertedToString = numberConvertedToString.substring(1);
		}

		// Hundreds Place
		if (numberConvertedToString.length() == 3) {
			if (numberConvertedToString.charAt(0) == '1') {
				romanNumeral += "C";
			} else if (numberConvertedToString.charAt(0) == '2') {
				romanNumeral += "CC";
			} else if (numberConvertedToString.charAt(0) == '3') {
				romanNumeral += "CCC";
			} else if (numberConvertedToString.charAt(0) == '4') {
				romanNumeral += "CD";
			} else if (numberConvertedToString.charAt(0) == '5') {
				romanNumeral += "D";
			} else if (numberConvertedToString.charAt(0) == '6') {
				romanNumeral += "DC";
			} else if (numberConvertedToString.charAt(0) == '7') {
				romanNumeral += "DCC";
			} else if (numberConvertedToString.charAt(0) == '8') {
				romanNumeral += "DCCC";
			} else if (numberConvertedToString.charAt(0) == '9') {
				romanNumeral += "CM";
			}
			// Removing Hundreds Place
			numberConvertedToString = numberConvertedToString.substring(1);
		}

		// Tens Place
		if (numberConvertedToString.length() == 2) {
			if (numberConvertedToString.charAt(0) == '1') {
				romanNumeral += "X";
			} else if (numberConvertedToString.charAt(0) == '2') {
				romanNumeral += "XX";
			} else if (numberConvertedToString.charAt(0) == '3') {
				romanNumeral += "XXX";
			} else if (numberConvertedToString.charAt(0) == '4') {
				romanNumeral += "XL";
			} else if (numberConvertedToString.charAt(0) == '5') {
				romanNumeral += "L";
			} else if (numberConvertedToString.charAt(0) == '6') {
				romanNumeral += "LX";
			} else if (numberConvertedToString.charAt(0) == '7') {
				romanNumeral += "LXX";
			} else if (numberConvertedToString.charAt(0) == '8') {
				romanNumeral += "LXXX";
			} else if (numberConvertedToString.charAt(0) == '9') {
				romanNumeral += "XC";
			}
			// Removing Tens Place
			numberConvertedToString = numberConvertedToString.substring(1);
		}

		// Ones Place
		if (numberConvertedToString.length() == 1) {
			if (numberConvertedToString.charAt(0) == '1') {
				romanNumeral += "I";
			} else if (numberConvertedToString.charAt(0) == '2') {
				romanNumeral += "II";
			} else if (numberConvertedToString.charAt(0) == '3') {
				romanNumeral += "III";
			} else if (numberConvertedToString.charAt(0) == '4') {
				romanNumeral += "IV";
			} else if (numberConvertedToString.charAt(0) == '5') {
				romanNumeral += "V";
			} else if (numberConvertedToString.charAt(0) == '6') {
				romanNumeral += "VI";
			} else if (numberConvertedToString.charAt(0) == '7') {
				romanNumeral += "VII";
			} else if (numberConvertedToString.charAt(0) == '8') {
				romanNumeral += "VIII";
			} else if (numberConvertedToString.charAt(0) == '9') {
				romanNumeral += "IX";
			}
			// Removing Ones Place - not necessary, but adding for consistency
			numberConvertedToString = numberConvertedToString.substring(1);
		}

		return romanNumeral;
	}
}
