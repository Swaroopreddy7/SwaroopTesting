package day5;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import day4.JunitExercise1;
import day4.JunitExercise2;

@RunWith(Suite.class)
@Suite.SuiteClasses({JunitExercise1.class,JunitExercise2.class})
public class TestSuiteExecution {

}
