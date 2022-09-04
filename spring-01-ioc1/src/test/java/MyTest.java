import cn.keegan.dao.UserDaoImpl;
import cn.keegan.dao.UserDaoMysqlImpl;
import cn.keegan.dao.UserDaoOracleImpl;
import cn.keegan.dao.UserDaoSqlserverImpl;
import cn.keegan.service.UserService;
import cn.keegan.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
  //-*********************************************
        /*
        //用户实际调用的是业务层，dao层他们不需要接触
        UserService userService = new UserServiceImpl();

        //强转的原因是多态情况下不能调用子类独有的setUserDao方法（userService中没有setUserDao方法）
        ((UserServiceImpl)userService).setUserDao(new UserDaoSqlserverImpl());
        //userService.setUserDao(new UserDaoOracleImpl());
        userService.getUser();
        */
   //-**********************************************
        //获取ApplicationContext 拿到Spring容器
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");

        //需要什么 直接get什么
        UserService userService = (UserService) context.getBean("UserServiceImpl");
        userService.getUser();
    }
}
