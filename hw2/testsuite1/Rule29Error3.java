// if (e) s1 else s2
// s2 doesn't type check
class A
{
	public static void main(String[] args){}
}

class B 
{
	public int Foo(int id, int e1, int e2){
		if (true)
		{
			id = 1;
		}
		else
		{
			num = 2;
		}
        return 1;
    }
}
