package LSL_EX_6;

public class User {
        public static void main(String[] args) {
            Ticket.ticketNum = 100;

            Ticket ticketWindow1 = new Ticket("售票窗口1");
            Ticket ticketWindow2 = new Ticket("售票窗口2");
            Ticket ticketWindow3 = new Ticket("售票窗口3");

            ticketWindow1.sell(20);
            ticketWindow2.sell(50);
            ticketWindow3.sell(29);

            System.out.println("剩余电影票数量：" + Ticket.ticketNum);
        }
}
