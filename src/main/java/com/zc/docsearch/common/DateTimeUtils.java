package com.zc.docsearch.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *  日期工具
 *  @author zengchao
 * Created by zengchao on 2018/4/9.
 */
public class DateTimeUtils {

    /**
     * 时间格式检查工具
     * @param date 时间字符串
     * @param dateFormat 时间格式
     * @return
     */
    public static boolean checkDateFormat(String date,String dateFormat){
        if (date==null||"".equals(date)){
            return false;
        }
        if (dateFormat==null||"".equals(dateFormat)){
            return false;
        }
        try {
            SimpleDateFormat format=new SimpleDateFormat(dateFormat);
            format.setLenient(false);
            format.parse(date);
            return true;
        } catch (ParseException e) {

        }
        return false;
    }

    /**
     * 时间字符串转时间
     * @param dateStr 时间字符串
     * @param format 时间格式
     * @return
     */
    public static Date string2Date(String dateStr,String format){
        if (checkDateFormat(dateStr, format)){
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat(format);
            try {
                Date date = simpleDateFormat.parse(dateStr);
                return date;
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * 时间转换成字符串
     * @param date 时间
     * @param format 字符串
     * @return
     */
    public static String date2StringFormat(Date date,String format){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(format);
        return simpleDateFormat.format(date);
    }

    /**
     * 修改日期
     * @param date 给定日期
     * @param changeDay 要修改的天数
     * @return
     */
    public static Date changeDay(Date date,int changeDay){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH,changeDay);
        return calendar.getTime();
    }

    /**
     * 获取当天的开始时间
     * @return
     */
    public static Date getTodayStart(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        return calendar.getTime();
    }

    public static Date getDayStartTime(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        return calendar.getTime();
    }

    public static Date getTodayEnd(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY,24);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        calendar.set(Calendar.MILLISECOND,0);
        return calendar.getTime();
    }

    public static Date getDayEndTime(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY,24);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        calendar.set(Calendar.MILLISECOND,0);
        return calendar.getTime();
    }

    /**
     * 获取当前时间开始时间
     * @param date
     * @param format
     * @return
     */
    public static String getStartDayStr(Date date,String format){
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(format);
        return simpleDateFormat.format(calendar.getTime());
    }

    /**
     * 获取对应年月的天数
     * @param year 指定年
     * @param month 指定月
     * @return
     */
    public static int getYearMonthDays(int year,int month){
        Calendar a = Calendar.getInstance();
        a.set(Calendar.YEAR, year);
        a.set(Calendar.MONTH, month - 1);
        a.set(Calendar.DATE, 1);
        a.roll(Calendar.DATE, -1);
        int maxDate = a.get(Calendar.DATE);
        return maxDate;
    }

    /**
     * 获取指定年月的日期列表
     * @param year 年
     * @param month 月
     * @return
     */
    public static List<Date> getYearMonthTimes(int year,int month){
        int days = getYearMonthDays(year, month);
        Calendar calendar=Calendar.getInstance();
        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.MONTH,month-1);
        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        List<Date> list=new LinkedList<>();
        while (days>0){
            calendar.set(Calendar.DAY_OF_MONTH,days);
            list.add(calendar.getTime());
            days=days-1;
        }
        return list;
    }

    /**
     * 比较两个时间是不是同一天
     * @param date1 开始时间
     * @param date2 结束时间
     * @return
     */
    public static boolean isSameDay(Date date1,Date date2){
        if (date1==null||date2==null){
            return false;
        }
        Calendar c1 = Calendar.getInstance();
        c1.setTime(date1);
        Calendar c2 = Calendar.getInstance();
        c2.setTime(date2);
        return c1.get(Calendar.YEAR) == c2.get(Calendar.YEAR) &&
                c1.get(Calendar.MONTH) == c2.get(Calendar.MONTH) &&
                c1.get(Calendar.DAY_OF_MONTH) == c2.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * 获取开始时间到结束时间之间的日期字符串列表
     * @param startDate
     * @param endDate
     * @return
     */
    public static List<String> getStartDayToEndDay(Date startDate,Date endDate){
        List<String> dateList=new ArrayList<>();
        while (true){
            String temp = DateTimeUtils.date2StringFormat(startDate, "yyyyMMdd");
            dateList.add(temp);
            if (isSameDay(startDate,endDate)){
                return dateList;
            }
            startDate=DateTimeUtils.changeDay(startDate,1);
        }
    }





    public static void main(String[] args) throws ParseException {
//        Date t1 = string2Date("20180912", "yyyyMMdd");
//        Date t2 = string2Date("20180430", "yyyyMMdd");
//        SimpleDateFormat format=new SimpleDateFormat("yyyyMMdd");
//        Date date = format.parse("20180430");
//        Date date1 = DateTimeUtils.changeDay(date, 1);
//        System.out.println(date1);
//        System.out.println(getTodayStart());
//        System.out.println(changeDay(getTodayStart(),-1));
        List<String> list = getStartDayToEndDay(DateTimeUtils.string2Date("20171227", "yyyyMMdd"),
                DateTimeUtils.string2Date("20171227", "yyyyMMdd"));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
