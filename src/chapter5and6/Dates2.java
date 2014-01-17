package chapter5and6;

/**
 * Created with IntelliJ IDEA.
 * User: tomaszlelek
 * Date: 1/15/14
 * Time: 3:23 PM
 * To change this template use File | Settings | File Templates.
 */

import java.io.File;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.*;
class Dates2 {
    public static void main(String[] args) {
        Date d1 = new Date(1000000000000L);
        System.out.println("1st date " + d1.toString());
        Calendar c = Calendar.getInstance();
        c.setTime(d1);                          // #1
        if(Calendar.SUNDAY == c.getFirstDayOfWeek())   // #2
            System.out.println("Sunday is the first day of the week");
        System.out.println("trillionth milli day of week is "
                + c.get(Calendar.DAY_OF_WEEK));
        c.add(Calendar.MONTH, 1);
        Date d2 = c.getTime();
        System.out.println("new date " + d2.toString() );

        // assume c is October 8, 2001
        c.roll(Calendar.MONTH, 9);      // notice the year in the output
        Date d4 = c.getTime();
        System.out.println("new date " + d4.toString() );


        Date date1 = new Date(1000000000000L);
        System.out.println("d1 = " + date1.toString());
        DateFormat df = DateFormat.getDateInstance(
                DateFormat.SHORT);
        String s = df.format(date1);
        System.out.println(s);
        try {
            Date date2 = df.parse(s);
            System.out.println("parsed = " + date2.toString());
        } catch (ParseException pe) {
            System.out.println("parse exc"); }

        Calendar calendar = Calendar.getInstance();
        calendar.set(2013, 11, 1);

        Date dateF = c.getTime();

        Locale locPL = new Locale("pl", "PL");
        DateFormat datePL = DateFormat.getDateInstance(DateFormat.FULL, locPL);
        System.out.println("poland : " + datePL.format(dateF));


        float f1 = 123.4567f;
        Locale locFR = new Locale("fr");          // France

        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(locFR);
        nfa[2] = NumberFormat.getCurrencyInstance();
        nfa[3] = NumberFormat.getCurrencyInstance(locFR);
        for(NumberFormat nf : nfa)
            System.out.println(nf.format(f1));

    } }


class Directories {
    static String [] dirs = {"dir1", "dir2"};
    public static void main(String [] args) {
        for (String d : dirs) {
            String path = d;
            File file = new File(path, "file2.txt");
            System.out.print(file.exists() + " ");    //exist test for files and dir
            System.out.print(file.isFile() + " ");    //isFile only for file
        }
    } }
