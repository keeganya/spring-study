package cn.keegan.demo01;


public class Proxy implements Rent{

    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        seeHouse();
        host.rent();
        fare();
        hetong();
    }

    //看房
    public void seeHouse(){
        System.out.println("看房");
    }

    //收中介费
    public void fare(){
        System.out.println("中介费");
    }

    //签租赁合同
    public void hetong(){
        System.out.println("租赁合同");
    }
}
