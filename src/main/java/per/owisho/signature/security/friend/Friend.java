package per.owisho.signature.security.friend;

import java.security.AccessController;
import java.security.PrivilegedAction;

import per.owisho.signature.security.doer.Doer;

public class Friend implements Doer{

	private Doer next;
	
	private boolean direct;
	
	public Friend(Doer next,boolean direct) {
		this.next = next;
		this.direct = direct;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void doYourThing() {
		
		if(direct){
			next.doYourThing();
		}else{
			AccessController.doPrivileged(new PrivilegedAction() {
				public Object run() {
					next.doYourThing();
					return null;
				}
			});
		}
		
	}

}
