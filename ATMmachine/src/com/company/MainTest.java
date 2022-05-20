package com.company;
import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest extends TestCase {
    Main x;
    Deposit d;
    Withdraw w;
    @BeforeEach
    public void init() {
        x = new Main();
        d = new Deposit();
        w = new Withdraw();
    }
    class withdrawal{
        int insert(int x){
            if(x>0)
                return x;
            else
                return 0;
        }
    }
    @Test
    public void stub1a(){
        withdrawal y = new withdrawal();
        x.working('b',y.insert(5000));
        assertEquals(x.balance,5000.0);
    }
    @Test
    public void stub2a(){
        withdrawal y = new withdrawal();
        double z =w.withdraw(2000,y.insert(5000));
        assertEquals(z,3000.0);
    }
    @Test
    public void stub3a(){
        withdrawal y = new withdrawal();
        double z = d.deposit(2000,y.insert(5000));
        assertEquals(z,7000.0);
    }

    @Test
    public void stub1b(){
        withdrawal y = new withdrawal();
        x.working('a',y.insert(5000));
        assertEquals(x.balance,5000.0);
    }
    @Test
    public void stub2b(){
        withdrawal y = new withdrawal();
        double z =w.withdraw(2000,y.insert(5000));
        assertEquals(z,3000.0);
    }
    @Test
    public void stub3b(){
        withdrawal y = new withdrawal();
        double z = d.deposit(2000,y.insert(5000));
        assertEquals(z,7000.0);
    }

}

