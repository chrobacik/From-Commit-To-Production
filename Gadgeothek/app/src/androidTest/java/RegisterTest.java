import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import ch.hsr.mge.gadgeothek.R;
import ch.hsr.mge.gadgeothek.ui.RegisterActivity;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class RegisterTest {

    @Rule
    public ActivityTestRule<RegisterActivity> activityTestRule = new ActivityTestRule<RegisterActivity>(RegisterActivity.class);

    @Test
    public void showRegisterActivity() {
        Espresso.onView(ViewMatchers.withId(R.id.registerButton)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}
