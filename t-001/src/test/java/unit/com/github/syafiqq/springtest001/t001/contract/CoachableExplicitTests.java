package unit.com.github.syafiqq.springtest001.t001.contract;

import com.github.syafiqq.springtest001.t001.coach.BaseballCoach;
import com.github.syafiqq.springtest001.t001.contract.Coachable;
import org.junit.Test;

/*
 * This <spring-test-001> created by :
 * Name         : syafiq
 * Date / Time  : 04 June 2019, 12:05 PM.
 * Email        : syafiq.rezpector@gmail.com
 * Github       : syafiqq
 */
public class CoachableExplicitTests
{
    @Test
    public void it_create_object_successfully()
    {
        Coachable coach = new BaseballCoach();
        coach.getDailyWorkout();
    }
}
