
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
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
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -5);

        Loan loan = new Loan("100", new Gadget("iPhone"), calendar.getTime(), null);

        Assert.assertFalse(loan.isOverdue());
    }

    @Test
    public void isOverdueShouldBeTrue() throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -10);

        Loan loan = new Loan("100", new Gadget("iPhone"), calendar.getTime(), null);

        Assert.assertTrue(loan.isOverdue());
    }
}