/**
 * This is a class that tests the Deck class.
 */
import java.util.List;
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"king","queen","joker"};
		String[] suits = {"spade", "hearts", "diomonds"};
		int[] values = {10,10,10};
		Deck deck1 = new Deck (ranks,suits,values);
		System.out.println(deck1.deal());
	}
}
