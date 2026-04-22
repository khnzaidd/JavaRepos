class GraphAMMain{
	public static void main(String[] args){
		GraphAM gm=new GraphAM(5,false);
                gm.insert(0,1);
                gm.insert(0,2);
                gm.insert(0,4);
                gm.insert(1,3);
                gm.insert(2,4);
                gm.insert(3,4);
                GraphPathAM gp=new GraphPathAM(gm,1,4);
                boolean result=gp.exists();
        //      System.out.println(result);
                GraphAM gm2=new GraphAM(5,false);
                gm2.insert(0,1);
                gm2.insert(2,3);
                GraphPathAM gp2=new GraphPathAM(gm2,0,3);
                boolean result2=gp2.exists();
                System.out.println("Path exists betweem vertices(1-4)in first graph: " +result);
                System.out.println("Path exists between vertices(0-3) in second graph: "+result2);
                GraphAM at=new GraphAM(5,true);
                at.insert(0,1);
                at.insert(0,2);
                at.insert(1,3);
                at.insert(2,3);
                at.insert(2,4);
                at.insert(3,4);
                GraphPathAM dgp=new GraphPathAM(at,1,2);
                boolean dresult=dgp.exists();
                System.out.println("Path exists between directed graph (1-2): "+dresult);
                GraphPathAM dgp2=new GraphPathAM(at,0,4);
                boolean dresult2=dgp2.exists();
                System.out.println("between (0-4): "+dresult2);
                at.show(at);
        }
}



