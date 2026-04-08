class CircularMain{
	public static void main(String[] args){
		CircularSLL cl=new CircularSLL();
		cl.createList(5);
		cl.traverse();
		cl.addNode(99,5);
		cl.traverse();
		cl.deleteNode(2);
		cl.traverse();
	}
}
