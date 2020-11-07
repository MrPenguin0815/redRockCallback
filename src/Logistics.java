public class Logistics{
    /**
     *物流公司调用此方法处理订单，收到订单后用学生的回调方法通知其已发货
     * @param student
     * @param orderNumber 订单号
     */
    public void processOrder(Student student,String orderNumber){
        System.out.println("京东：已收到" + orderNumber + "号订单");
        student.deliver();
        this.arrivalRemind(student);
    }

    /**
     * 物流公司调用此方法通知学生已送达，收到订单后用学生的回调方法使其取件
     * @param student
     */
    public void arrivalRemind(Student student){
        System.out.println("京东：通知到货");
        student.pickup();
    }





}


