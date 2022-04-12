package testTwo.mediator;

public class Test {
    public static void main(String[] args) {
        // 创建具体同事对象
        Country china, us;
        china = new China();
        us = new America();
        // 创建具体中介者对象
        Group wto, who;
        wto = new WTO();
        who = new WHO();
        // 注册同事
        wto.register(china);
        who.register(china);
        who.register(us);

        // 同事之间通过中介者发送消息
        china.sendTextByWHO(us.getCountryName(), "中国出售汽车部件给美国");
        us.sendTextByWTO(china.getCountryName(), "美国收到部件");

        us.sendTextByWHO(china.getCountryName(), "美国收到部件");
    }
}
