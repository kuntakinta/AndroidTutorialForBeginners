package com.alrubaye.alaram;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by palkers on 18.09.2017.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> menuActivityTestRule =
            new ActivityTestRule<>(MainActivity.class, true, true);

    @Test
    public void shouldCheckIfRightTextOnPopUpIsDisplayed() {
        onView(withText(R.string.instruction_text))
                .check(matches(isDisplayed()));
    }

    @Test
    public void shouldEnterMainView() {
        onView(withId(R.id.buDome))
                .perform(click());
        onView(withText(R.string.welcome_text))
                .check(matches(isDisplayed()));
    }
}
