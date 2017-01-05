package per.owisho.signature.security.stranger;

import java.security.AccessController;
import java.security.PrivilegedAction;

import per.owisho.signature.security.doer.Doer;

public class Stranger implements Doer{

	private Doer next;
	
	private boolean direct;
	
	public Stranger(Doer next,boolean direct) {
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
