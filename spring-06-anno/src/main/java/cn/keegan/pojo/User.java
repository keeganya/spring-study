package cn.keegan.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//等价于  <bean id="user" class="cn.keegan.pojo.User"/>
//@Component 组件
@Component
public class User {
   // public String name = "胡国庆";

    //相当于 <property name="name" value="胡国庆"/>
    @Value("胡国庆")
    public String name;
}
