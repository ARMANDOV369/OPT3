import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VergoedingTestEq {

    @Test
    public void test1(){
        Vrijwilliger x = new Vrijwilliger("Sjonnie",21, false);
        x.Vergoeding(1);
        assertEquals(true, x.krijgtVergoeding());
    }
    @Test
    public void test2(){
        Vrijwilliger x = new Vrijwilliger("Sjaakie",21, false);
        x.v = 25.3;
        assertEquals(true, x.krijgtVergoeding());
    }
    @Test
    public void test3(){
        Vrijwilliger x = new Vrijwilliger("Kees",20, false);
        x.Vergoeding(1);
        assertEquals(true, x.krijgtVergoeding());
    }
    @Test
    public void test4(){
        Vrijwilliger x = new Vrijwilliger("Donnie",19, true);
        x.Vergoeding(1);
        assertEquals(false, x.krijgtVergoeding());
    }
}
