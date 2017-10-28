
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import ch.hsr.mge.gadgeothek.domain.Gadget;
import ch.hsr.mge.gadgeothek.domain.Loan;

import static org.junit.Assert.*;

public class LoanTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void isOverdue() throws Exception {
        Loan loan = new Loan("100", new Gadget("iPhone"), new Date(2017, 10, 28), null);

        Assert.assertTrue(loan.isOverdue());
    }

}