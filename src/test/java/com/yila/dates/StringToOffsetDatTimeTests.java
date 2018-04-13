package com.yila.dates;
import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.Test;

public class StringToOffsetDatTimeTests {

	@Test
	public void convertStringDateWithoutZoneToOffsetDateTime() throws ParseException {
		String stringDateTime = "2016-08-18T06:17:10";
		
		String pattern = "uuuu-MM-dd'T'HH:mm:ss";
	    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern).withZone(ZoneId.ofOffset("", ZoneOffset.UTC));
	    ZonedDateTime zonedDateTime = ZonedDateTime.parse(stringDateTime, dateTimeFormatter);
	    System.out.println(zonedDateTime.toOffsetDateTime());
	    
	    assertEquals("2016-08-18T06:17:10Z", zonedDateTime.toOffsetDateTime().toString());
	    
	}

}
