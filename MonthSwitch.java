package assignment1;

public class MonthSwitch {

	public static void main(String[] args) {
		int month=5;
		String Month="";
		switch(month) {
		case 1: Month="1-January";
		break;

		case 2: Month="2-February";
		break;

		case 3: Month="3-March";
		break;

		case 4: Month="4-April";
		break;

		case 5: Month="5-May";
		break;

		case 6: Month="6-June";
		break;

		case 7: Month="7-July";
		break;

		case 8: Month="8-August";
		break;

		case 9: Month="9-September";
		break;

		case 10: Month="10-October";
		break;

		case 11: Month="11-November";
		break;

		case 12: Month="12-December";
		break;

		default:
			System.out.println("Invalid Month");
		}
		System.out.println(Month);

	}

}
