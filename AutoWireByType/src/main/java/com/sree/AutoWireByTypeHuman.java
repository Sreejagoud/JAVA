package com.sree;

	public class AutoWireByTypeHuman {
		private AutoWireByTypeHeart heartobj;

		public AutoWireByTypeHeart getHeartobj() {
			return heartobj;
		}

		public void setHeartobj(AutoWireByTypeHeart heartobj) {
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
