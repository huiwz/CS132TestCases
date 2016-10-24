// while (e) s
// s doesn't type check
class A
{
	public static void main(String[] args){}
}

class B 
{
	public int Foo(int id, int e1, boolean e2){
		while (e2)
		{
			e2 = e2 * id;
		}
        return 1;
    }
}
