package io.gatling.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * DateConverter
 * Utility class implements two methods to convert String data to Date and vice versa.
 */

public class DateConverter {

    public Date stringToDateConverter(String stringDate) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        return formatter.parse(stringDate);
    }

    public String dateToStringConverter(Date date) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(date);
    }
}
