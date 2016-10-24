// p.id(e1,...,en) : t
// expression return type is wrong
class Factorial{
    public static void main(String[] a){
        System.out.println(new Foo().ComputeFac(new B()));
    }
}

class Fac {
    public int ComputeFac(A a){
        return 1 ;
    }
}

class Foo extends Fac {}

class A {}

class B extends A {}