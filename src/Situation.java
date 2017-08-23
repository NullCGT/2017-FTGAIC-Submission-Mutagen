import java.io.Serializable;

import enumerate.State;

/**
 * Situations for use in LGR algorithm.
 * 
 * @author Connor Gregorich-Trevor
 *
 */

public class Situation implements Serializable {

	/**
	 *  Generated serial UID
	 */
	private static final long serialVersionUID = -5501194421594139131L;
	private String myAction;
	private String oppAction;
	private int myHp;
	private int oppHp;
	private int distance;
	private int requiredEnergy;
	private int oppEnergy;
	private State state;
	private State oppState;
	private int combo;
	private int oppCombo;
	
	// Constructs an entry for the queue.
	public Situation(String myAction, String oppAction, int oppHp, int myHp, int distance, int energy
			, int oppenergy, State state, State oppState, int combo, int oppCombo) {
		this.myAction = myAction;
		this.oppAction = oppAction;
		this.myHp = myHp;
		this.oppHp = oppHp;
		this.distance = distance;
		this.requiredEnergy = energy;
		this.oppEnergy = oppenergy;
		this.state = state;
		this.oppState = oppState;
		this.combo = combo;
		this.oppCombo = oppCombo;
	}
	
	/** Blank constructor used for creating a placeholder in the queue */
	public Situation() {
		this.myAction = "NO ACTION";
		this.oppAction = "NO ACTION";
		this.myHp = 0;
		this.oppHp = 0;
		this.oppEnergy = 0;
		this.state = null;
		this.combo = 0;
		this.oppCombo = 0;
	}
	
	// Getters
	public String getMyAction() {
		return myAction;
	}
	public String getOppAction() {
		return oppAction;
	}
	public int getmyHp() {
		return myHp;
	}
	public int getRequiredEnergy() {
		return requiredEnergy;
	}
	public int getoppHp() {
		return oppHp;
	}
	public int getDistance() {
		return distance;
	}
	public int getOppEnergy() {
		return oppEnergy;
	}
	public State getState() {
		return state;
	}
	public State getOppState() {
		return oppState;
	}
	public int getCombo() {
		return combo;
	}
	public int getOppCombo() {
		return oppCombo;
	}
	
	
}
