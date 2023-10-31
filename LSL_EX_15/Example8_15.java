package LSL_EX_15;

import java.util.Calendar;
import java.util.Date;

public class Example8_15 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.print("���ڵ�ʱ���ǣ�");
        System.out.print(""+year+"��"+month+"��"+day+"��");
        System.out.println(" "+hour+"ʱ"+minute+"��"+second+"��");

        int y = 2012, m = 9, d = 1;
        calendar.set(y, m-1, d);
        long time1 = calendar.getTimeInMillis();
        y = 2016;
        m = 7;
        d = 1;
        calendar.set(y, m-1, d);
        long time2 = calendar.getTimeInMillis();
        long subDay = (time2-time1) / (1000*60*60*24);
        System.out.println(""+new Date(time2));
        System.out.println("��"+new Date(time1));
        System.out.println("���"+subDay+"��");
    }
}

