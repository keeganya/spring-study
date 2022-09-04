package cn.keegan.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*//使用这个类自动生成代理类
public class ProxyinvocationHandler implements InvocationHandler {

    //被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //生成得到代理类
    public Object getProxy(){
       return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }

    //处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        //动态代理的本质，就是使用反射机制实现！
        Object result = method.invoke(rent, args);
        fare();
        return result;
    }

    public void seeHouse(){
        System.out.println("中介带我们看房子！");
    }

    public void fare(){
        System.out.println("收中介费！");
    }
}*/
public class ProxyinvocationHandler implements InvocationHandler{

    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        Rent result = (Rent) method.invoke(rent, args);
        fare();
        return result;
    }

    public void seeHouse(){
        System.out.println("中介带去看房子");
    }

    public void fare(){
        System.out.println("中介收取中介费");
    }
}
