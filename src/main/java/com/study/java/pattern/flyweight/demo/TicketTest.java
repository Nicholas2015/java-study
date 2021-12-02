package com.study.java.pattern.flyweight.demo;

public class TicketTest {

    public static void main(String[] args) {
        ITicket ticket = TicketFactory.queryTicket("南京南","北京西");
        ticket.showInfo("二等座");
        ticket = TicketFactory.queryTicket("南京南","北京西");
        ticket.showInfo("一等座");
        ticket = TicketFactory.queryTicket("南京南","北京西");
        ticket.showInfo("二等座");
    }
}
