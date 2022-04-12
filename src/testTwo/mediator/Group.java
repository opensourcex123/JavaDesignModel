package testTwo.mediator;

import java.util.Hashtable;

// 抽象中介者类
abstract class Group {
    protected String groupName;
    protected Hashtable<String, Country> CountryList = new Hashtable<String, Country>();

    public Group(String name) {
        groupName = name;
    }

    public void register(Country country) {
        if (!CountryList.contains(country)) {
            CountryList.put(country.getCountryName(), country);
        }
    }

    public void sendText(String from, String to, String msg) {
        Country country = CountryList.get(to);
        if (country != null) {
            System.out.println(groupName + "传达" + from + "给" + to + "的消息");
            country.recieveMessage(from, msg);
        } else {
            System.out.println(to + "未加入" + groupName + ", 不能接收来自该组织的消息");
        }
    }
}
