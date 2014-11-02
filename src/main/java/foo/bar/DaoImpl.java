package foo.bar;

import java.util.Calendar;

public class DaoImpl implements IDao {
    @Override
    public String sayHello(String name) {
        int time = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

        if(time < 6) return "早上好"+name;
        if(time < 12) return "上午好"+name;
        if(time < 18) return "下午好" +name;

        return "晚上好"+name;
    }
}
