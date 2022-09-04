import cn.keegan.pojo.Student;
import cn.keegan.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());

        /*Student{
        name='胡国庆',
        address=Address{address='北京' },
        books=[红楼梦, 水浒传, 西游记, 三国演义],
        hobbys=[听歌, 敲代码, 看电影],
        card={身份证=340881199710015110, 银行卡=12345678987654321 },
        games=[LOL, BOB, COC],
        wife='null',
        info={
        password=123321,
        url=jdbc:mysql://127.0.0.1:port/dbname,
        driver=com.mysql.jdbc.Driver,
        username=root}
        }
         */
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Userbeans.xml");
        User user = context.getBean("user2", User.class);
        User user2 = context.getBean("user2", User.class);
        System.out.println(user.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user==user2);
    }
}
