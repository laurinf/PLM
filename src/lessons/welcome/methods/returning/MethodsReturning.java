package lessons.welcome.methods.returning;

import java.awt.Color;

import plm.core.model.lesson.ExerciseTemplated;
import plm.core.model.lesson.Lesson;
import plm.universe.Direction;
import plm.universe.bugglequest.Buggle;
import plm.universe.bugglequest.BuggleWorld;
import plm.universe.bugglequest.exception.AlreadyHaveBaggleException;

public class MethodsReturning extends ExerciseTemplated {

	public MethodsReturning(Lesson lesson) {
		super(lesson);
		tabName = "Program";

		BuggleWorld[] myWorld = new BuggleWorld[3];
		for (int i=0; i<3;i++) {
			myWorld[i] = new BuggleWorld("World "+(i+1),7,7);
			new Buggle(myWorld[i], "Searcher", 0, 6, Direction.NORTH, Color.black, Color.lightGray);
		}

		try {
			myWorld[0].addBaggle(3, 2);
			myWorld[1].addBaggle(5, 1);
			myWorld[2].addBaggle(2, 6);
		} catch (AlreadyHaveBaggleException e) {
			e.printStackTrace();
		}

		setup(myWorld);
	}
}
