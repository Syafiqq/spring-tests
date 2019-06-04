package com.github.syafiqq.springtest001.t001.coach;

import com.github.syafiqq.springtest001.t001.contract.Coachable;

/*
 * This <spring-test-001> created by :
 * Name         : syafiq
 * Date / Time  : 04 June 2019, 12:01 PM.
 * Email        : syafiq.rezpector@gmail.com
 * Github       : syafiqq
 */
public class FootballCoach implements Coachable
{
    @Override public void getDailyWorkout()
    {
        System.out.println("Workout from Football");
    }
}
