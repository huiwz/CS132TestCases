// id[e1] = e2
// e1 is not of type int
class A
{
	public static void main(String[] args){}
}

class B 
{
	public int Foo(int[] id, boolean e1, int e2){
		id[e1] = e2;
        return 1;
    }
}
