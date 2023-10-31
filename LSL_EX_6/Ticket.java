package LSL_EX_6;

class Ticket {
        static int ticketNum;
        String name;
        public Ticket(String name) {
            this.name = name;
        }
        public void sell(int quantity) {
            if (quantity <= ticketNum) {
                ticketNum -= quantity;
            } else {
                System.out.println(name + "售票点，卖票数量过多，请减少卖票数量。当前剩余票数量：" + ticketNum);
            }
        }
}
