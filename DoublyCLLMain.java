class DoublyCLLMain{
	public static void main(String args[]){
		DoublyCLL dc=new DoublyCLL();
		dc.createList(5);
		dc.traverse();
		dc.insertNode(99,2);
		dc.traverse();
		dc.deleteNode(2);
		dc.traverse();
	}
}

