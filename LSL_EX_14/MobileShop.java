package LSL_EX_14;

class MobileShop {
    InnerPurchaseMoney purchaseMoney1;
    InnerPurchaseMoney purchaseMoney2;
    private int mobileAmount;  //手机的数量

    MobileShop(){
        purchaseMoney1 = new InnerPurchaseMoney(20000);
        purchaseMoney2 = new InnerPurchaseMoney(10000);
    }

    void setMobileAmount(int m) {
        mobileAmount = m;
    }

    int getMobileAmount() {
        return mobileAmount;
    }

    class InnerPurchaseMoney {
        int moneyValue;

        InnerPurchaseMoney(int m) {
            moneyValue =  m;
        }

        void buyMobile() {
            if(moneyValue>=20000) {
                mobileAmount = mobileAmount-6;
                System.out.println("用价值"+moneyValue+"的内部购物券买了6部手机");
            }
            else if(moneyValue<20000 && moneyValue>=10000) {
                mobileAmount = mobileAmount-3;
                System.out.println("用价值"+moneyValue+"的内部购物券买了3部手机");
            }
        }
    }
}