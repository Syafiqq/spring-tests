package unit.com.github.syafiqq.springtest001.t001.contract;

import com.github.syafiqq.springtest001.t001.contract.Coachable;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * This <spring-test-001> created by :
 * Name         : syafiq
 * Date / Time  : 04 June 2019, 2:54 PM.
 * Email        : syafiq.rezpector@gmail.com
 * Github       : syafiqq
 */
public class CoachableImplicitTests
{
    @Test
    public void it_create_object_successfully()
    {
        var context = new ClassPathXmlApplicationContext("/appContext.xml");
        var coach = context.getBean("coach", Coachable.class);
        coach.getDailyWorkout();
    }
}
