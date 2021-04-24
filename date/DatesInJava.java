package test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class DatesInJava {

	public static void main(String[] args) {
		LocalDate localDate = null;
		System.out.println(localDate.now()); //2020-10-05
		
		
		LocalTime time = LocalTime.NOON; 
		System.out.println(time); // 12:00
		System.out.println(time.now()); // 15:13:18.558344600
		
		LocalDateTime localDateTime = null; 
		System.out.println(localDateTime.now()); // 2020-10-05T15:13:18.559342100
		
		DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDate = localDateTime.now().format(dateTimeFormatter1);
		System.out.println(formattedDate); // 05-10-2020 15:12:33
		
		DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String formattedDate2 = localDateTime.now().format(dateTimeFormatter2);
		System.out.println(formattedDate2); // 05-10-2020
		
		DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("dd-MM");
		String formattedDate3 = localDateTime.now().format(dateTimeFormatter3);
		System.out.println(formattedDate3); // 05-10
		
		
		
		
	}
}
