// id = e, e is a child type of id
class A
{
	public static void main(String[] args){}
}

class B 
{
	int a;
	boolean b;
	public int Foo(A num, C bool){
		num = bool;
        return 1;
    }
}

class C extends A
{}