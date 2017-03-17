package DateTimeSample;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import org.junit.Assert;

import javax.xml.datatype.XMLGregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * Created by brprashant on 9/21/16.
 */
public class DropTimeZone {

	public void tranlsate(XMLGregorianCalendar xmlGCalendar) {

		//SimpleDateFormat dateFormat = new SimpleDateFormat("mm:dd");
		//Calendar calendar  = new Calendar.Builder().setDate(xmlGCalendar.getYear(),xmlGCalendar.getMonth(),xmlGCalendar.getDay()).
		//		setTimeOfDay(xmlGCalendar.getHour(),xmlGCalendar.getMinute(),xmlGCalendar.getSecond()).build();
		//return dateFormat.format(calendar.getTime());


	}

	public static void main(String[] args){

		Date dt = new Date();
		dt.getTime();
		System.out.println(dt);

		Calendar calendar = new GregorianCalendar();
		calendar.set(2016,10,21);
		System.out.println(calendar.getTime());

		XMLGregorianCalendar xmlGregorian = new XMLGregorianCalendarImpl();
		xmlGregorian.setMonth(1);
		xmlGregorian.setDay(21);
		xmlGregorian.setYear(2016);
		xmlGregorian.setTime(15,23,34,2);
		xmlGregorian.setTimezone(-5);
		System.out.println("With time zone : xmlGregorian : " + xmlGregorian);
		xmlGregorian.setTimezone(+60);
		System.out.println("With time zone : xmlGregorian : " + xmlGregorian);

		System.out.println("XML Gregorians time zone " + xmlGregorian.getTimezone());
		System.out.println("xmlGreg - greg - time(date)  : " + xmlGregorian.toGregorianCalendar().getTime());
		System.out.println( "After formatting with simple date format : "+ DropTimeZone.formatInDateTime(xmlGregorian));


		XMLGregorianCalendar xmlG = new XMLGregorianCalendarImpl();
		xmlG.setMonth(1);
		xmlG.setDay(21);
		xmlG.setYear(2016);
		xmlG.setTime(15,23,34,2);
		xmlG.setTimezone(+5);
		System.out.println(xmlG);
		Assert.assertEquals(xmlG.getMonth(),1);
		String retVal = DropTimeZone.formatInDateTime(xmlG);
		System.out.println(retVal);
		String stringForDB = "21-Feb-16 15:23";
		Assert.assertEquals(stringForDB,retVal);
		xmlG.setTimezone(-719);
		System.out.println(xmlG);
		String retVal2 = DropTimeZone.formatInDateTime(xmlG);
		System.out.println(retVal2);
		Assert.assertEquals(stringForDB,retVal2);


		String dateForDB="21-Feb-16";
		String retVal3 = DropTimeZone.formatInDate(xmlG);
		System.out.println(retVal3);
		Assert.assertEquals(dateForDB,retVal3);

		xmlG.setTimezone(+719);
		System.out.println(xmlG);
		String retVal4 = DropTimeZone.formatInDate(xmlG);
		System.out.println(retVal4);
		Assert.assertEquals(dateForDB,retVal4);

	}

	public static String formatInDateTime(XMLGregorianCalendar xmlGregorianCalendar){
		SimpleDateFormat dateTimeFormat = new SimpleDateFormat("dd-MMM-yy HH:mm");
		Calendar calendar  = Calendar.getInstance();
		calendar.set(xmlGregorianCalendar.getYear(),xmlGregorianCalendar.getMonth(),xmlGregorianCalendar.getDay(),
				xmlGregorianCalendar.getHour(),xmlGregorianCalendar.getMinute(),xmlGregorianCalendar.getSecond());
		return dateTimeFormat.format(calendar.getTime());
	}

	public static String formatInDate(XMLGregorianCalendar xmlGregorianCalendar){
		String retVal = null;
		if (xmlGregorianCalendar!=null){
			SimpleDateFormat dateTimeFormat = new SimpleDateFormat("dd-MMM-yy");
			Calendar calendar  = Calendar.getInstance();
			calendar.set(xmlGregorianCalendar.getYear(),xmlGregorianCalendar.getMonth(),xmlGregorianCalendar.getDay());
			retVal=dateTimeFormat.format(calendar.getTime());
		}
		return retVal;
	}




}
