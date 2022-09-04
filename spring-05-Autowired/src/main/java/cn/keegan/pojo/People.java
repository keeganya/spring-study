package cn.keegan.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class People {

    //如果显式定义了Autowired的required属性为false，说明这个对象可以为null，否则不允许为空
   /* @Autowired(required = false)
    @Qualifier(value = "dog1")*/
    @Resource(name = "dog2")
    private Dog dog;

    private Cat cat;

    private String name;

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Cat getCat() {
        return cat;
    }

    @Autowired
    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
