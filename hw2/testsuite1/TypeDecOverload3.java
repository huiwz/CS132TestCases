// Class D overload Foo in Class B because of different parameter signature
// Class C doesn't
class A
{
	public static void main(String[] args){}
}

class B 
{
	int a;
	boolean b;
	public int Foo(int num, boolean bool){
        return num_aux ;
    }
	
	public boolean Bar(boolean bool)
	{
		return bool;
	}
}

class C extends B
{}

class D extends C
{
	public boolean Foo(boolean bool, int num)
	{
		return true;
	}
}