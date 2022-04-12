package testTwo.mediator;

// 抽象同事类
public class Country {
    protected String countryName;
    private Group wto, who;

    public Country(String name) {
        this.countryName = name;
    }

    public void sendTextByWTO(String to, String msg) {
        if (wto != null) {
            wto.sendText(countryName, to, msg);
        } else {
            System.out.println(countryName + "未加入wto, 不能通过该组织发送消息");
        }
    }

    public void sendTextByWHO(String to, String msg) {
        if (who != null) {
            who.sendText(countryName, to, msg);
        } else {
            System.out.println(countryName + "未加入who, 不能通过该组织发送消息");
        }
    }

    public void recieveMessage(String from, String msg) {
        System.out.println(from + "发送消息给" + countryName + ":" + msg);
    }

    public void setWTO(Group wto) {
        this.wto = wto;
    }

    public void setWHO(Group who) {
        this.who = who;
    }

    public Group getWto() {
        return this.wto;
    }

    public Group getWho() {
        return this.who;
    }

    public String getCountryName() {
        return countryName;
    }
}
