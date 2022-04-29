package com.sree;

	import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Component;

	@Component
	public class Samsung {
		@Autowired
		MobileProcessor mp;

		public MobileProcessor getMcpu() {
			return mp;
		}

		public void setMcpu(MobileProcessor mcpu) {
			this.mp = mp;
		}
		public void MobileConfig() {
			System.out.println("8gb Ram Dual Core 128px camera 64gb storage");
			mp.processor();
		}
}