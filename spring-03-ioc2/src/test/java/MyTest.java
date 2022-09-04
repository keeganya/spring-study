import cn.keegan.pojo.User;
import cn.keegan.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //User user = new User();传统方式创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("User");
        user.show();
        UserT userT = (UserT) context.getBean("UserT");
        userT.show();
    }
}
