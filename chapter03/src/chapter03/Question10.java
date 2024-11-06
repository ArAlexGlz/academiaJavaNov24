package chapter03;

enum DayOfWeek{
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY
}

public class Question10 {
	
	public static void main(String[] args) {
		DayOfWeek dow = new Question10().getWeekDay(2,3);
		System.out.println(dow);
	}
	
	private DayOfWeek getWeekDay(int day, final int thursday) {
		
		int otherDay = day; 
		int Sunday = 0;
		final int wednesday = 4;
		
		switch(otherDay) { 
			default:
			//case 1: continue;
			case wednesday: return DayOfWeek.THURSDAY;
			case 2,10,999: break;
			//case Sunday: return DayOfWeek.SUNDAY;
			//case DayOfWeek.MONDAY: return DayOfWeek.MONDAY;
			
		}
		
		return DayOfWeek.FRIDAY;
	}

}
