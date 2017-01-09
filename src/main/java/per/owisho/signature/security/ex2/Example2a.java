package per.owisho.signature.security.ex2;

import per.owisho.signature.security.ex1.TextFileDisplayer;
import per.owisho.signature.security.friend.Friend;
import per.owisho.signature.security.stranger.Stranger;

public class Example2a {

	public static void main(String[] args) {
		TextFileDisplayer tfd = new TextFileDisplayer("answer.txt");
		Friend friend = new Friend(tfd,true);
		Stranger stranger = new Stranger(friend,true);
		stranger.doYourThing();
	}
	
}
