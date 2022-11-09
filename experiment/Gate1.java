import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class Gate1 {

	public static final ReentrantLock lockG = new ReentrantLock();
	// This class is for Gate Resource 1
	public void accessGate(int time) throws InterruptedException {
		// The boarding/deboarding time is random for threads hence, we get this
		// parameter from the runway class
		int AirplaneObjectId = Integer.parseInt(Thread.currentThread().getName());
		// we check which is the current running thread
		Airplane workOn = Main.tracker[AirplaneObjectId];
		lockG.lock();
		workOn.setCurrentState(3);
		// SwingUI.model.setValueAt(workOn.getCurrentStateName(workOn.getCurrentState()),
		// AirplaneObjectId, 1);
		SwingUI.updateGUIState(workOn.getCurrentStateName(workOn.getCurrentState()),
				workOn.getCurrentStateName(workOn.getCurrentState() + 1), AirplaneObjectId);
		// System.out.println("In GATE RESOURCE 1");
		SwingUI.updateResourceUsedBy("G1", AirplaneObjectId);
		try {
			// System.out.println("G1 - " +time);
			Thread.sleep(time * 1000);
		} finally {
			/*
			 * System.out.println(" IN GATE RESOURCE 1,   Thread -- " + workOn.getName() +
			 * ",  State -- " + workOn.getCurrentStateName(workOn.getCurrentState()));
			 */
			lockG.unlock();
			SwingUI.resetResourceTable(1);
			workOn.setCurrentState(4);
			// SwingUI.model.setValueAt(workOn.getCurrentStateName(workOn.getCurrentState()),
			// AirplaneObjectId, 1);
			SwingUI.updateGUIState(workOn.getCurrentStateName(workOn.getCurrentState()),
					workOn.getCurrentStateName(workOn.getCurrentState() + 1), AirplaneObjectId);
			Airplane.rw.accessRunway();
		}
	}
}