package com.sree;

	public class Human {
		private Heart heartobj;//Autowire byName heart and id in xml file must be same
	//id and instance variable in human class should be same
		public Heart getHeartobj() {
			return heartobj;
		}

		public void setHeartobj(Heart heartobj) {
			this.heartobj = heartobj;
		}

	public void humanFunction()
	{
		if(heartobj!=null)
		{
			heartobj.pump();
		}
		else
		{
			System.out.println("Not Alive");
		}
	}

}
