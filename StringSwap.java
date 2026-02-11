class StringSwap{
	public static void main(String[] args){
		String s="Lucknow";
		char[] ch=s.toCharArray();
		int i=0;
		int j=ch.length-1;
		char temp;
		while(i>j){
			temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
		}
		String s1=new String(ch);
		System.out.println(s1);
	}
}
