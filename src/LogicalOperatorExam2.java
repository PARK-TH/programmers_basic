public class LogicalOperatorExam2 {
    public boolean isAgeDiscountable(int age) {
        boolean isDiscount = false;
        // 아래 빈칸을 채워 코드를 완성하세요.
        if(
                (age>=60)||(19>=age)
        ) {
            isDiscount = true;
        }
        else {
            isDiscount = false;
        }
        return isDiscount;
    }

    public static void main(String[]args) {
        LogicalOperatorExam2 exam = new LogicalOperatorExam2();
        exam.isAgeDiscountable(15);
        exam.isAgeDiscountable(27);
    }
}