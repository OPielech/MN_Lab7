package Task_1;

public class IntegrateODE {
    private Function dxdt;

    public IntegrateODE(Function dxdt) {
        this.dxdt = dxdt;
    }//end of constructor

    public double[] integrateODE(int n, double h, double x0){
        double[] result=new double[n+1];
        result[0]=x0;
        double t=0;
        for(int i=0; i<n;i++){
            result[i+1]=result[i]+dxdt.function(result[i],t);
            t+=h;
        }
        return result;
    }//end of integrateODE
}//end of IntegrateODE
