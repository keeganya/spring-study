package cn.keegan.demo04;

import cn.keegan.demo01.Host;
import cn.keegan.demo02.UserService;
import cn.keegan.demo02.UserServiceImpl;
import cn.keegan.demo01.Rent;

public class Client {
   /* public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        ProxyinvocationHandler pih = new ProxyinvocationHandler();
        pih.setTarget(userService);
        UserService proxy = (UserService) pih.getProxy();
        proxy.add();
    }*/

    /*public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        ProxyinvocationHandler pih = new ProxyinvocationHandler();
        pih.setTarget(userService);
        UserService proxy = (UserService) pih.getProxy();
        proxy.delete();
    }*/

    /*public static void main(String[] args) {
        Host host = new Host();

        ProxyinvocationHandler pih = new ProxyinvocationHandler();
        pih.setTarget(host);
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();
    }*/

    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        ProxyinvocationHandler pih = new ProxyinvocationHandler();
        pih.setTarget(userService);
        UserService proxy = (UserService) pih.getProxy();
        proxy.delete();
    }
}
