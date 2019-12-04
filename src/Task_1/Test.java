package Task_1;

public class Test {
    public static void main(String[] args) {
        IntegrateODE integrateODE = new IntegrateODE((x, t) -> 4 * x - 2 * t + 5);
        double[] solution = integrateODE.integrateODE(10, 0.1, 0);
        for (Double x : solution) {
            System.out.println(x);
        }//end of for-each
    }//end of main
}//end of Test
