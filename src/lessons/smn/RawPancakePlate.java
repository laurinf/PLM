package lessons.smn;

import jlm.core.model.lesson.ExerciseTemplated;
import jlm.core.model.lesson.Lesson;
import jlm.universe.pancake.raw.PancakeEntity;
import jlm.universe.pancake.raw.PancakeWorld;

/**
 * @author Julien BASTIAN & Geoffrey HUMBERT
 * @version 1.2
 */
public class RawPancakePlate extends ExerciseTemplated {

	
	/**
	 * Constructor of the class BurnedPancakePlate
	 * @version 1.2
	 * @param Lesson : a lesson
	 */
	public RawPancakePlate(Lesson lesson) {
		super(lesson);
		PancakeWorld plate[] = new PancakeWorld[4];
		plate[0]= new PancakeWorld("5 pancakes",5,true);
		plate[1]= new PancakeWorld("10 pancakes",10,true);
		plate[2]= new PancakeWorld("15 pancakes",15,true);
		plate[3]= new PancakeWorld("30 pancakes",30,true);
		for ( int i = 0 ; i<4;i++)
		{
			new PancakeEntity("Pancake Seller",plate[i]);
		}
		setup(plate);
	}

}
