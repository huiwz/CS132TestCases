// p.id(e1,...,en) : t
// expression return type is wrong
class Factorial{
    public static void main(String[] a){
        System.out.println(new Foo().ComputeFac(!false));
    }
}

class Fac {
    public int ComputeFac(int num){
        int num_aux ;
        if (num < 1)
            num_aux = 1 ;
        else
            num_aux = num * (this.ComputeFac(num-1)) ;
        return num_aux ;
    }
}

class Foo extends Fac {}