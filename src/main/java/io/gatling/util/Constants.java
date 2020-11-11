package io.gatling.util;

/**
 * Constants
 * Class contains all necessary constants.
 */

public class Constants {

    public static String startDate = "1950-01-01";
    public static String endDate = "2050-01-01";

    //    ------------  Main Page  ---------------
    public static String baseUrl = "http://computer-database.gatling.io/computers";

    //    ------------  Computer Addition Page  ---------------
    public static String compAdditionUrl = baseUrl + "/new";

    //    ------------  Computer Deletion Page  ---------------
    public static String compDeletionUrl = baseUrl + "/313";
}
