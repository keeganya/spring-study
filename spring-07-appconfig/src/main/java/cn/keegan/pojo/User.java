package cn.keegan.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//这里这个注解的意思，就是说明这个类被Spring接管了，注册到了容器中
@Component
public class User {
    @Value("胡国庆")//属性注入值
    private String name;

    public String getName() {
        return name;
    }

   // @Value("huguoqing")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
