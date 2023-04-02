package not_trial;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class Alarm {
	Thread t;
    int str = 0;
public void checkAlarm(int h,int m,final String ampm,final String message)
{ final int a=h,b=m;

if(ampm.equals("AM"))
{
 str=0;
}
else if(ampm.equals("PM"))
{
str=1;    
}
final boolean  whileloop=true;
t=new Thread(){
    public void run(){
        
    while(whileloop==true)
    {
        Calendar d=new GregorianCalendar();
    int hours=d.get(Calendar.HOUR);
    int mins=d.get(Calendar.MINUTE);
    int str1=d.get(Calendar.AM_PM);
    if(a==hours&&b==mins&&str==str1)
    {
       // AlarmClock ac=new AlarmClock(null, true);        
            try {
                JOptionPane.showMessageDialog(null,"Alarm Works!");
              //  ac.getAlarm(message);
                
                break;
            } catch (IOException ex) {
                
                
            }
            
    }
    }
    
    }

};
t.setPriority(Thread.MIN_PRIORITY);
t.start();
}
    public static void main(String ar[])
{
Alarm a=new Alarm();
a.checkAlarm(4,58,"AM","XD");

}
    
}


