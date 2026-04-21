class UndtdGraph2Main{
	public static void main(String[] args){
		UndtdGraph2 ud=new UndtdGraph2(5,false);
		ud.insert(0,1);
		ud.insert(0,2);
		ud.insert(0,4);
		ud.insert(1,3);
		ud.insert(2,4);
		ud.insert(3,4);
		GraphPath gp=new GraphPath(ud,1,4);
		boolean result=gp.exists();
	//	System.out.println(result);
		UndtdGraph2 ud2=new UndtdGraph2(5,false);
		ud2.insert(0,1);
		ud2.insert(2,3);
		GraphPath gp2=new GraphPath(ud2,0,3);
		boolean result2=gp2.exists();
		System.out.println("Path exists betweem vertices(1-4)in first graph: " +result);
		System.out.println("Path exists between vertices(0-3) in second graph: "+result2);
	}
}
