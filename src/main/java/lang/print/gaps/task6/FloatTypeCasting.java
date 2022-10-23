package lang.print.gaps.task6;

public class FloatTypeCasting {

    public static void main(String[] args) {

        roundNumber(6.4932F);
        roundNumber(6.5F);
    }
    public static void roundNumber(float numberToBeRounded) {

        int intRounded = (int) (Math.round(numberToBeRounded));
        System.out.println(intRounded);

    }
}
