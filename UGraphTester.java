class UGraphTester{
        public static void main(String[] args){
                UndtdGraph ug=new UndtdGraph(5);
                ug.addEdge(0,1);
                ug.addEdge(1,2);
                ug.addEdge(1,3);
                ug.addEdge(0,2);
                ug.addEdge(2,3);
                ug.addEdge(2,4);
                ug.addEdge(3,4);
                ug.addEdge(4,2);
		System.out.println("Graph created");
        }
}

