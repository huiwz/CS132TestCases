// id[e1] = e2
// e2 is not of type int
class A
{
	public static void main(String[] args){}
}

class B 
{
	public int Foo(int[] id, int e1, boolean e2){
		id[e1] = e2;
        return 1;
    }
}
