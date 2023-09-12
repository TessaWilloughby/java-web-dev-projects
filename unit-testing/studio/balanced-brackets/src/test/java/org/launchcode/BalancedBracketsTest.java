package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void stringBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void stringWithNoBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(("LaunchCode")));
    }

    @Test
    public void stringWithOneBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void stringWithUnbalancedBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch[Code]"));
    }

    @Test
    public void nestedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[Launch]]Code"));
    }

    @Test
    public void unmatchedOpeningBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch[Co[de"));
    }

    @Test
    public void unmatchedClosingBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Co]de"));
    }
}