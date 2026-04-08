interface AnonyClass{
	void display();
}
class MyClass{
	void myMethod(AnonyClass ac){
		ac.display();
	}
}
