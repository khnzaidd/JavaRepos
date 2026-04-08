interface LambdaExpr{
//	void printer(String s);
	int add(int x,int y);
}

class LibClass{
	public void caller(LambdaExpr le,int a,int b){
		System.out.println(le.add(a,b));
	}
}
