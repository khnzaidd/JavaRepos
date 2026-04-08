class LambdaMain{
	public static void main(String[] args){
		LibClass lc=new LibClass();
		//LambdaExpr lu=()->{System.out.println("Hello ! Lambda...");};
		//LambdaExpr le=s->System.out.println(s);
		LambdaExpr le=(x,y)->x+y;
		lc.caller(le,10,80);
	}
}
