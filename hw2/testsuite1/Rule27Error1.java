// id = e, id and e type mismatch
class A
{
	public static void main(String[] args){}
}

class B 
{
	int a;
	boolean b;
	public int Foo(int num, boolean bool){
		num = bool;
        return num;
    }
	
	public boolean Bar(boolean bool)
	{
		return bool;
	}
}