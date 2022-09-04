package cn.keegan.demo02;

public class Client {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
//        userService.add();
        UserServicceProxy proxy = new UserServicceProxy();
        proxy.setUserService((UserServiceImpl) userService);
        proxy.add();
    }
}
