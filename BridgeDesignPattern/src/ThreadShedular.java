
public abstract class  ThreadShedular {
	
	protected Thread th;
	ThreadShedular(Thread c){	
		this.th=c;
	}
	
	
	
	
	abstract void preemtiveshedular();
	abstract void timesliceshedular();

}
