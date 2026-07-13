class CalculationExample{
     
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    double sum(int a,float  b,int c,int d){
        return a+b+c+d;
    }
    double sum(double a,int b){
        return a+b;
    }


}

class MainCal{
    public static void main(String [] args){
        CalculationExample cal=new CalculationExample();
        System.out.println(cal.sum(54,34,34));
        System.out.println(cal.sum(34,34));
        System.out.println(cal.sum(54,34,34));
    }
}