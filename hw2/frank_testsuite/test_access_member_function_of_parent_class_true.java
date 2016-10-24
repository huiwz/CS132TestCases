// test access member function of parent class
class A
{
	public static void main(String[] args){}
}

class C
{
    int num;
    public boolean hello(){
        return true;
    }
}

class B extends C
{
    B b;
	public int Foo(int id, int e1, int e2){
	    boolean niubi;
		if (true)
		{
			id = 1;
		}
		else
		{
			num = 2;
		}
        niubi = b.hello();
        return 1;
    }
}
