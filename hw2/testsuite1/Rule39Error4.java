class Factorial{
    public static void main(String[] a){
        System.out.println(new Fac().ComputeFac(10));
    }
}

class Fac {
    int a;
    boolean b;
    int c;
    int[] d;
    A f;

    public int ComputeFac(int num){
        int num_aux ;
        if (num < 1)
            num_aux = 1 ;
        else
            num_aux = num * (this.ComputeFac(num-1));
        return num_aux ;
    }

    public int testParam(Fac f){
        return 1;
    }
}

class B extends Fac{
    B b;
    C c;
    public int testParam2(){
        Fac f;
        int x;
        f = new Fac();
        x = f.testParam(c);
        return 1;
    }
}

class C {

}

class A extends B{
    public int wudi(int a){
        return 1;
    }
    public int awudi(int b){
        return 2;
    }
}