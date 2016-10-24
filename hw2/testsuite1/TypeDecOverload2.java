// Class D overload Foo in Class B because of different length of parameter list
// Class C doesn't
class A
{
	public static void main(String[] args){}
}

class B 
{
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

class D extends C
{
	public int Foo(int num, int anothernum)
	{
		return true;
	}
}