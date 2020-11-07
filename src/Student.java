public class Student implements Callback {

    private Logistics JD;


    /**
     * 学生的构造方法，持有物流公司的引用
     * @param JD 京东
     */
    public Student(Logistics JD) {
        this.JD = JD;
    }


    /**
     * 学生通过该方法下单，并在该方法中调用物流处理订单
     * @param orderNumber 订单号
     */
    public void bookComputer(String orderNumber) {
        System.out.println("学生：已下单，订单号为:" + orderNumber);
        JD.processOrder(this, orderNumber);
    }

    /**
     * 学生的回调方法 ：物流发货后，调用此方法通知学生
     */
    @Override
    public void deliver() {
        System.out.println("京东：已发货");
    }


    /**
     * 学生的回调方法 ：到货后，调用此方法拿货
     */
    @Override
    public void pickup() {
        System.out.println("学生：收到到货通知");
        System.out.println("学生：拿到电脑学JAVA");
    }
}
