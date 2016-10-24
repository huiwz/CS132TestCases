// test whether D can access A's member, should fail
class A
{
	public static void main(String[] args){}
}

class B
{
	int num_aux;
	int a;
	boolean b;
	public int Foo(int num){
        return num_aux ;
    }

	public boolean Bar(boolean bool)
	{
		return bool;
	}
}

class C extends B
{
	public int Foo(int anotherNum)
	{
		return anotherNum;
	}
}

class D
{
	public boolean Foo(int num)
	{
		return num_aux;
	}
}