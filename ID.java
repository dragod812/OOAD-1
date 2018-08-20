class ID{
	long id;
	public ID(){
		id = 0;
	}
	String getAndIncrement(){
		String ans = String.valueOf(id);
		id++;
		return ans;
	}
}

