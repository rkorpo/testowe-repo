public class Investment {

    public static void main(String[] args) {
        int investmentValue = 14_000;

        investmentValue *= 1.4;
        investmentValue -= 1500;
        investmentValue *= 1.12;

        System.out.println(investmentValue);
    }
}
