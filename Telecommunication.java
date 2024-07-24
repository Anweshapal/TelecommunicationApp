public class Telecommunication {

	public static void main(String[] args) {
		
		Desktop d = new Desktop("8120935478");
		d.poweron();
		d.dial("720587692");
		d.callphone("8120935478");
		d.answer();	
		d.isRinging();
		/*mobile m = new mobile("95792486324");
		m.poweron();
		m.callphone("95792486324");
		m.answer();	*/
		
	}
    interface Telephone{
    	void poweron();
    	void dial(String phonenumber);
    	void answer();
    	boolean callphone(String phonenumber);
    	boolean isRinging();
    }
       static class Desktop implements Telephone{
    	
    	private String myNumber;
    	private boolean isRinging;
    	
  

		public Desktop(String myNumber) {
			this.myNumber=myNumber;
		}

		
    	public void poweron() {
    		System.out.println("Desk phone is always powered");
    		
    		
    	}
    	public void dial(String phonenumber) {
    		
    		System.out.println("Now ringing "+phonenumber+"on deskphone");
    		
    		
    		
    	}
    	public void answer() {
    		if(isRinging) {
    			System.out.println("Answering the deskphone");
    		}else {
    			System.out.println("phone isn't ringing");
    		}
    	}
    	public boolean callphone(String phonenumber) {
			if(phonenumber==myNumber) {
				isRinging=true;
				System.out.println("Phone ringing");
			}else {
				
				isRinging=false;
			}
			return isRinging;	
    	}
 
		@Override
		public boolean isRinging() {
			
			return isRinging;
		}
    	
		static class mobile implements Telephone{
			
			private String myNumber;
	    	private boolean isRinging;
	    	private boolean ispoweron;
	    	
	    	public  mobile(String myNumber) {
				this.myNumber=myNumber;
			}

			
	    	public void poweron() {
	    		ispoweron=true;
	    			System.out.println("Mobile powered on");
	    		
	    		
	    		
	    	}
	    	public void dial(String phonenumber) {
	    		
	    		System.out.println("Now ringing "+phonenumber+"on deskphone");
	    		
	    		
	    		
	    	}
	    	public void answer() {
	    		if(isRinging && ispoweron) {
	    			System.out.println("Answering the deskphone");
	    		}else {
	    			
	    		}
	    	}
	    	public boolean callphone(String phonenumber) {
				if(phonenumber==myNumber && ispoweron) {
					isRinging=true;
					System.out.println("Phone ringing");
				}else {
					System.out.println("Either wrong number or phone is off");
					isRinging=false;
				}
				return isRinging;	
	    	}
	 
			@Override
			public boolean isRinging() {
				
				return isRinging;
			}	
		}	
		
    }
}
