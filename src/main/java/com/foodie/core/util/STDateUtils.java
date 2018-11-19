package com.foodie.core.util;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * @ClassName:MyDateUtils
 * @Description:日期操作类工具。
 * @Author:hankaibo
 * @date:2013-8-18
 * @UpdateUser:hankaibo
 * @UpdateDate:2013-8-18 上午10:36:19
 * @UpdateRemark:What is modified?
 */
public class STDateUtils {
    private final static String DATE_FORMAT = "yyyy-MM-dd";
    private final static String DATE_FORMAT_CN = "yyyy年MM月dd日";
    private final static String TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    private final static String TIME_FORMAT_CN = "yyyy年MM月dd日 HH:mm:ss";
    private final static String MONTH_FORMAT = "yyyy-MM";
    private final static String DAY_FORMAT = "yyyyMMdd";

    /**
     * @return String
     * @Title:getMonthFirstDay
     * @Description: 得到当前月的第一天.
     */
    public static String getMonthFirstDay() {
        Calendar cal = Calendar.getInstance();
        // 方法一,默认只设置到年和月份.
        // Calendar f = (Calendar) cal.clone();
        // f.clear();
        // f.set(Calendar.YEAR, cal.get(Calendar.YEAR));
        // f.set(Calendar.MONTH, cal.get(Calendar.MONTH));
        // f.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DATE));
        // return DateFormatUtils.format(f, DATE_FORMAT);

        // 方法二.
        cal.set(Calendar.DATE, 1);
        return DateFormatUtils.format(cal, DATE_FORMAT);

    }

    /**
     * @return String
     * @Title:getMonthLastDay
     * @Description: 得到当前月最后一天
     */
    public static String getMonthLastDay() {
        Calendar cal = Calendar.getInstance();
        Calendar f = (Calendar) cal.clone();
        f.clear();
        // 方法一
        // f.set(Calendar.YEAR, cal.get(Calendar.YEAR));
        // f.set(Calendar.MONTH, cal.get(Calendar.MONTH) + 1);
        // f.set(Calendar.MILLISECOND, -1);
        // return DateFormatUtils.format(f, DATE_FORMAT);

        // 方法二
        // f.set(Calendar.YEAR, cal.get(Calendar.YEAR));
        // f.set(Calendar.MONTH, cal.get(Calendar.MONTH));
        // f.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DATE));
        // return DateFormatUtils.format(f, DATE_FORMAT);

        // 方法三(同一)
        cal.set(Calendar.DATE, 1);// 设为当前月的1号
        cal.add(Calendar.MONTH, 1);// 加一个月，变为下月的1号
        cal.add(Calendar.DATE, -1);// 减去一天，变为当月最后一天
        return DateFormatUtils.format(cal, DATE_FORMAT);
    }

    /**
     * @return String
     * @Title:getPreviousMonthFirst
     * @Description: 得到上个月的第一天
     */
    public static String getPreviousMonthFirst() {
        Calendar cal = Calendar.getInstance();
        Calendar f = (Calendar) cal.clone();
        f.clear();
        // 方法一
        // f.set(Calendar.YEAR, cal.get(Calendar.YEAR));
        // f.set(Calendar.MONTH, cal.get(Calendar.MONTH) - 1);
        // f.set(Calendar.DATE, 1);
        // return DateFormatUtils.format(f, DATE_FORMAT);

        // 方法二
        // f.set(Calendar.YEAR, cal.get(Calendar.YEAR));
        // f.set(Calendar.MONTH, cal.get(Calendar.MONTH) - 1);
        // f.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DATE));
        // return DateFormatUtils.format(f, DATE_FORMAT);

        // 方法三(同一)
        cal.set(Calendar.DATE, 1);// 设为当前月的1号
        cal.add(Calendar.MONTH, -1);
        return DateFormatUtils.format(cal, DATE_FORMAT);
    }

    /**
     * @return String
     * @Title:getPreviousMonthEnd
     * @Description: 得到上个月最后一天
     */
    public static String getPreviousMonthEnd() {
        Calendar cal = Calendar.getInstance();
        Calendar f = (Calendar) cal.clone();
        f.clear();
        // 方法一
        // f.set(Calendar.YEAR, cal.get(Calendar.YEAR));
        // f.set(Calendar.MONTH, cal.get(Calendar.MONTH));
        // f.set(Calendar.MILLISECOND, -1);
        // return DateFormatUtils.format(f, DATE_FORMAT);

        // 方法二
        // f.set(Calendar.YEAR, cal.get(Calendar.YEAR));
        // f.set(Calendar.MONTH, cal.get(Calendar.MONTH) - 1);
        // f.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DATE));
        // return DateFormatUtils.format(f, DATE_FORMAT);

        // 方法三(同一)
        cal.set(Calendar.DATE, 1);// 设为当前月的1号
        cal.add(Calendar.MONTH, 0);//
        cal.add(Calendar.DATE, -1);// 减去一天，变为当月最后一天
        return DateFormatUtils.format(cal, DATE_FORMAT);
    }

    /**
     * @return String
     * @Title:getNextMonthFirst
     * @Description: 得到下个月的第一天
     */
    public static String getNextMonthFirst() {
        Calendar cal = Calendar.getInstance();
        Calendar f = (Calendar) cal.clone();
        f.clear();
        // 方法一
        // f.set(Calendar.YEAR, cal.get(Calendar.YEAR));
        // f.set(Calendar.MONTH, cal.get(Calendar.MONTH) + 1);
        // f.set(Calendar.DATE, 1);
        // or f.set(Calendar.DAY_OF_MONTH,cal.getActualMinimum(Calendar.DATE));
        // return DateFormatUtils.format(f, DATE_FORMAT);

        // 方法二
        cal.set(Calendar.DATE, 1);// 设为当前月的1号
        cal.add(Calendar.MONTH, +1);// 加一个月，变为下月的1号
        return DateFormatUtils.format(cal, DATE_FORMAT);
    }

    /**
     * @return String
     * @Title:getNextMonthEnd
     * @Description: 得到下个月最后一天。
     */
    public static String getNextMonthEnd() {
        Calendar cal = Calendar.getInstance();
        // cal.set(Calendar.DATE, +1);
        // cal.add(Calendar.MONTH, +2);
        // cal.add(Calendar.DATE, -1);
        // return DateFormatUtils.format(cal, DATE_FORMAT);

        // 方法二
        cal.add(Calendar.MONTH, 1);// 加一个月
        cal.set(Calendar.DATE, 1);// 把日期设置为当月第一天
        cal.roll(Calendar.DATE, -1);// 日期回滚一天，也就是本月最后一天
        return DateFormatUtils.format(cal, DATE_FORMAT);
    }

    /**
     * @return int
     * @Title:getCurrentMonthDays
     * @Description: 得到当前月的天数
     */
    public static int getCurrentMonthDays() {
        Calendar cal = new GregorianCalendar();// Calendar.getInstance();
        int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        return days;
    }

    /**
     * @param date
     * @return int
     * @Title:getSpecifiedMonthDays
     * @Description: 得到指定的月份的天数
     */
    public static int getSpecifiedMonthDays(String date) {
        Calendar cal = Calendar.getInstance();
        try {
            cal.setTime(DateUtils.parseDate(date, MONTH_FORMAT));
            int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
            return days;
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        return 0;
    }

    /**
     * @return String
     * @Title:getCurrentDate
     * @Description: 得到当前日期
     */
    public static String getCurrentDate() {
        Calendar cal = Calendar.getInstance();
        String currentDate = DateFormatUtils.format(cal, DATE_FORMAT);
        return currentDate;
    }

    /**
     * @return String
     * @Title:getCurrentTime
     * @Description: 得到当前的时间
     */
    public static String getCurrentTime() {
        Calendar cal = Calendar.getInstance();
        String currentDate = DateFormatUtils.format(cal, TIME_FORMAT);
        return currentDate;
    }

    /**
     * @return long
     * @Title:getCurrentMs
     * @Description: 得到当前的时间毫秒
     */
    public static long getCurrentMs() {
        Calendar cal = Calendar.getInstance();
        long currentMs = cal.getTimeInMillis();
        return currentMs;
    }

    /**
     * @param offset
     * @return String
     * @Title:getOffsetDate
     * @Description: 得到与当前日期偏移量为X的日期。
     */
    public static String getOffsetDate(int offset) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, offset);
        String currentDate = DateFormatUtils.format(cal, DATE_FORMAT);
        return currentDate;
    }

    /**
     * @param specifiedDate指定的日期 ,格式为YYYY-MM-DD
     * @param offset
     * @return String
     * @throws ParseException
     * @Title:getSpecifiedOffsetDate
     * @Description: 得到与指定日期偏移量为X的日期。
     */
    public static String getSpecifiedOffsetDate(String specifiedDate, int offset) throws ParseException {
        Date date = DateUtils.parseDate(specifiedDate, DATE_FORMAT);
        Calendar cal = DateUtils.toCalendar(date);
        cal.add(Calendar.DAY_OF_MONTH, offset);
        String returnDate = DateFormatUtils.format(cal, DATE_FORMAT);
        return returnDate;
    }

    /**
     * @param specifiedTime 指定的时间,格式为yyyy-MM-dd HH:mm:ss
     * @param offset        偏移天数
     * @return String
     * @throws ParseException
     * @Title:getSpecifiedOffsetTime
     * @Description: 得到与指定日期时间偏移量为X的时间。
     */
    public static String getSpecifiedOffsetTime(String specifiedTime, int offset) throws ParseException {
        Date date = DateUtils.parseDate(specifiedTime, TIME_FORMAT);
        Calendar cal = DateUtils.toCalendar(date);
        cal.add(Calendar.DAY_OF_MONTH, offset);
        String returnDate = DateFormatUtils.format(cal, TIME_FORMAT);
        return returnDate;
    }

    /**
     * @param specifiedDateTime 指定的时间,格式为yyyy-MM-dd HH:mm:ss/yyyy-MM-dd
     * @param offset            偏移天数
     * @return String
     * @throws ParseException
     * @Title:getOffsetDateTime
     * @Description: 得到与指定日期时间偏移量为X的时间。
     */
    public static String getOffsetDateTime(String specifiedDateTime, int offset) throws ParseException {
        String regexStr = "\\d{4}-\\d{2}-\\d{2}";
        if (specifiedDateTime.matches(regexStr)) {
            return getSpecifiedOffsetDate(specifiedDateTime, offset);
        } else {
            return getSpecifiedOffsetTime(specifiedDateTime, offset);
        }
    }

    /**
     * 判断是否为润年
     *
     * @param year
     * @return
     */
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    /**
     * @param c
     * @return String
     * @Title:getWeekDay
     * @Description: 判断是星期几.
     */
    public static String getWeekDay(Calendar c) {
        if (c == null) {
            return "星期一";
        }
        switch (c.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.MONDAY:
                return "星期一";
            case Calendar.TUESDAY:
                return "星期二";
            case Calendar.WEDNESDAY:
                return "星期三";
            case Calendar.THURSDAY:
                return "星期四";
            case Calendar.FRIDAY:
                return "星期五";
            case Calendar.SATURDAY:
                return "星期六";
            default:
                return "星期日";
        }
    }

    /**
     * @param begin 开始日期 .
     * @param end   结束日期 .
     * @return List<String>
     * @Title:getDaysListBetweenDates
     * @Description: 获得两个日期之间的连续日期.
     */
    public static List<String> getDaysListBetweenDates(String begin, String end) {
        List<String> dateList = new ArrayList<String>();
        Date d1;
        Date d2;
        try {
            d1 = DateUtils.parseDate(begin, DATE_FORMAT);
            d2 = DateUtils.parseDate(end, DATE_FORMAT);
            if (d1.compareTo(d2) > 0) {
                return dateList;
            }
            do {
                dateList.add(DateFormatUtils.format(d1, DATE_FORMAT));
                d1 = DateUtils.addDays(d1, 1);
            } while (d1.compareTo(d2) <= 0);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return dateList;
    }

    /**
     * @param begin
     * @param end
     * @return List<String>
     * @Title:getMonthsListBetweenDates
     * @Description: 获得连续的月份
     */
    public static List<String> getMonthsListBetweenDates(String begin, String end) {
        List<String> dateList = new ArrayList<String>();
        Date d1;
        Date d2;
        try {
            d1 = DateUtils.parseDate(begin, DATE_FORMAT);
            d2 = DateUtils.parseDate(end, DATE_FORMAT);
            if (d1.compareTo(d2) > 0) {
                return dateList;
            }
            do {
                dateList.add(DateFormatUtils.format(d1, MONTH_FORMAT));
                d1 = DateUtils.addMonths(d1, 1);
            } while (d1.compareTo(d2) <= 0);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return dateList;
    }

    /**
     * @param createTime
     * @return String
     * @Title:long2Time
     * @Description: 将long类型的时间值转换成标准格式的时间（yyyy-MM-dd HH:mm:ss）
     */
    public static String long2Time(String createTime) {
        long fooTime = Long.parseLong(createTime) * 1000L;
        return DateFormatUtils.format(fooTime, TIME_FORMAT);
    }

    public static void main(String[] args) throws ParseException {
        System.out.println(getMonthFirstDay());
        System.out.println(getMonthLastDay());
        System.out.println(getPreviousMonthFirst());
        System.out.println(getPreviousMonthEnd());
        System.out.println(getNextMonthFirst());
        System.out.println(getNextMonthEnd());
        System.out.println(getCurrentMonthDays());
        System.out.println(getSpecifiedMonthDays("1900-02"));
        System.out.println(getCurrentDate());
        System.out.println(getOffsetDate(-4));
        System.out.println(isLeapYear(1900));
        System.out.println(getWeekDay(Calendar.getInstance()));
        System.out.println(getDaysListBetweenDates("2012-1-12", "2012-1-21"));
        System.out.println(getMonthsListBetweenDates("2012-1-12", "2012-3-21"));
        System.out.println(getSpecifiedOffsetTime("2012-09-09 12:12:12", 12));
        System.out.println(getOffsetDateTime("2012-09-09", 12));
        System.out.println(getOffsetDateTime("2012-09-09 12:12:12", 12));
        System.out.println(long2Time("1234567890"));

    }

    /**
     * @param date
     * @return long
     * @Title:StringToMs
     * @Description: 字符串转毫秒
     */
    public static long StringToMs(String date) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        try {
            cal.setTime(sdf.parse(date));
            long ms = cal.getTimeInMillis();
            return ms;
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        return 0;
    }
}
