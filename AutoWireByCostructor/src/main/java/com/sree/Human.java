package com.sree;

    public class Human {
		private Heart heart;

		public Human(Heart heart) {
			super();
			this.heart = heart;
		}
		public void humanFunction()
		{
			if(heart!=null)
			{
				heart.pump();
			}
			else
			{
				System.out.println("Not Alive");
			}
		}
	}