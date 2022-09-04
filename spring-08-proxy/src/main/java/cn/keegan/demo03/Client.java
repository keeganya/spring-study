package cn.keegan.demo03;

public class Client {
  /*  public static void main(String[] args) {
        //真实角色
        Host host = new Host();

        //代理角色
        ProxyinvocationHandler pih = new ProxyinvocationHandler();
        //通过调用程序处理角色来处理我们要调用的接口对象！
        pih.setRent(host);

        Rent proxy = (Rent) pih.getProxy();//这里的Proxy就是动态生成的，我们并没有写~
        proxy.rent();
    }*/
  public static void main(String[] args) {
      Host host = new Host();

      ProxyinvocationHandler pih = new ProxyinvocationHandler();
      pih.setRent(host);
      Rent proxy = (Rent) pih.getProxy();
      proxy.rent();
  }
}
