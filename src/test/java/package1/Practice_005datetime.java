package package1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Practice_005datetime {
	public static void main(String[] args) {
		LocalDate Trainingstart=LocalDate.of(2024, 9, 25);
		DateTimeFormatter Timeformatsk=DateTimeFormatter.ofPattern("yyyy/MM/dd");
		System.out.println("Training Start Date: "+Trainingstart.format(Timeformatsk));
		int duration=50;
		System.out.println("No of days of training: "+duration);
		
		LocalDate trainingEnd = Trainingstart;
		System.out.println(trainingEnd);//2024-09-25
		
		int daysAddedsk=0;
		
		while (daysAddedsk < duration) {
            trainingEnd = trainingEnd.plusDays(1);
            // Check if the day is a weekday (not Saturday or Sunday)
            if (trainingEnd.getDayOfWeek() != DayOfWeek.SATURDAY && trainingEnd.getDayOfWeek() != DayOfWeek.SUNDAY) {
                daysAddedsk++;
            }
        }

        System.out.println("Training End Date (ignoring weekends): " + trainingEnd.format(Timeformatsk));
		
		
		
		
	}

}
