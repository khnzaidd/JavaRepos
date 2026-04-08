class InStack{
	private int[] stack;
	private int top;
	public InStack(int n){
		stack=new int[n];
		top=-1;
	}
	public void push(int data){
		if(top==stack.length-1){
			System.out.println("Stack overflow");
		}else{
			stack[++top]=data;
		}
	}
	public int peak(){
		if(top==-1){
			return Integer.MIN_VALUE;
		}
		return stack[top];
	}
	public int getSize(){
		return top;
	}
	public int pop(){
		if(top==-1){
			return Integer.MIN_VALUE;
		}
		else{
			return stack[top--];
		}
	}
}
class StackTester{
	public static void main(String[] args){
		InStack ins=new InStack(10);
		ins.push(10);
		ins.push(20);
		ins.push(30);
		int len=ins.getSize();
		for(int i=0;i<=len;i++){
			System.out.println(ins.pop());
		}
		//System.out.println(ins.pop());
		//System.out.println(ins.pop());
	}
}
