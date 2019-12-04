package Task_2;

import Task_1.Function;

public class IntegrateODE {
    private Function dxdt;

    public IntegrateODE(Function dxdt) {
        this.dxdt = dxdt;
    }//end of constructor

    public double[] integrateODE(int n, double h, double x0){
        double[] result=new double[n+1];
        double[] xi=new double[n+1];
        result[0]=x0;
        double t=0;

        xi[0]=result[0]+dxdt.function(result[0],t/2);
        for(int i=0; i<n;i++){
            xi[i+1]=result[i]+dxdt.function(result[i],t);
            result[i+1]=result[i]+dxdt.function(xi[i],t);
            t+=h/2;
        }
        return result;
    }//end of integrateODE
}//end of IntegrateODE
