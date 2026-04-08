class DefaultMain{
	public static void main(String[] args){
		NoAdapterDemo nad=new NoAdapterDemo();
		DefaultInterface di=new NoAdapterDemo();
		di.display();
		nad.display();
		nad.mymethod2();
//		di.mymethod2();
		//nad.display();
		//nad.mymethod();
		//DefaultInterface.mymethod();
	}
}
