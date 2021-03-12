package main.java.com.github.tylerrutland.dateTime;

	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Calendar;
	import java.util.Date;
	import java.util.TimeZone;

	public class DateTime {

		public static String getDateTime() {
			SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm");
			format.setTimeZone(TimeZone.getTimeZone("CST"));
			return format.format(new Date()); // 2016/11/16 12:08:43
		}

		public static String getFileNameDateTime() {
			SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmm");
			format.setTimeZone(TimeZone.getTimeZone("CST"));
			return format.format(new Date()); // 201611161208
		}

		public static String JDEToGregorian(String input) throws ParseException {
			Date date;
			date = new SimpleDateFormat("Myydd").parse(input);
			return new SimpleDateFormat("MM/dd/yyyy").format(date);
		}

		public static String getDate() throws ParseException {
			SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
			format.setTimeZone(TimeZone.getTimeZone("CST"));
			Date date = format.parse(format.format(new Date()));
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			return cal.get(Calendar.YEAR) + "-"
					+ String.format("%1$" + 2 + "s", String.valueOf(cal.get(Calendar.MONTH) + 1)).replace(' ', '0') + "-"
					+ cal.get(Calendar.DATE); // 2016-11-16
		}

		/* CURRENT JULIAN DATE USED IN JDE CYYDDD */
		public static String getCurrentJulianDate() {
			SimpleDateFormat format = new SimpleDateFormat("'1'yyDDD");
			format.setTimeZone(TimeZone.getTimeZone("CST"));
			return format.format(new Date()); // 119253
		}


		/* CURRENT TIME USED IN JDE HHMMSS */
		public static String getCurrentTime() {
			SimpleDateFormat format = new SimpleDateFormat("HHmmss");
			format.setTimeZone(TimeZone.getTimeZone("CST"));
			return format.format(new Date()); // 120843
		}
}