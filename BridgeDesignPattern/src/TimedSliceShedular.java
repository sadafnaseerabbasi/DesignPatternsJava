
public class TimedSliceShedular extends ThreadShedular{
	
	public TimedSliceShedular(Thread c)
	{
		
		super(c);
		
	}


	@Override
	void preemtiveshedular() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void timesliceshedular() {
		System.out.println("Time Slice Shedular");
		
	}
	
	
	

}
