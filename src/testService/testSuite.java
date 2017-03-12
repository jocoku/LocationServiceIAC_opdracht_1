package testService;

/*
 * Created by Jochem Kuus on 12-3-2017.
 */
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        posTest.class, negTestInvalLeng.class,
        negTestNotExist.class, negTestManyNums.class,
        negTestInvalChar.class
})
public class testSuite {
}