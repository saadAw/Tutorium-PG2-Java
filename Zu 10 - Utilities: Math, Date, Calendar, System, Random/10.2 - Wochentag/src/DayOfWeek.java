package pg2._04;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie" + " ein Datum ein:");

		System.out.print("Tag: ");
		int day = sc.nextInt();
		System.out.print("Monat: ");
		int month = sc.nextInt();
		System.out.print("Jahr: ");
		int year = sc.nextInt();

		GregorianCalendar greCal = new GregorianCalendar();

		greCal.set(Calendar.DATE, day);
		greCal.set(Calendar.MONTH, month - 1); // MONTH starts at 0 in Java (Januar = 0, Februar = 1, ...)
		greCal.set(Calendar.YEAR, year);
		
		int dayOfWeek = greCal.get(Calendar.DAY_OF_WEEK);
		
		System.out.print("Der " + day + "." + month + "." + year + " war ein ");

		switch (dayOfWeek) {
    		case Calendar.MONDAY:
    			System.out.println("Montag");
    			break;
    		case Calendar.TUESDAY:
    			System.out.println("Dienstag");
    			break;
    		case Calendar.WEDNESDAY:
    			System.out.println("Mittwoch");
    			break;
    		case Calendar.THURSDAY:
    			System.out.println("Donnerstag");
    			break;
    		case Calendar.FRIDAY:
    			System.out.println("Freitag");
    			break;
    		case Calendar.SATURDAY:
    			System.out.println("Samstag");
    			break;
    		case Calendar.SUNDAY:
    			System.out.println("Sonntag");
    			break;
		}
	}
}
