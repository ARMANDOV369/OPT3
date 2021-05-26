import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class VergoedingTestMCDC {

   @Test
    public void test1(){
       Vrijwilliger x = new Vrijwilliger("Sjonnie",27, false);
       x.v = 9999.999;
       assertEquals(true, x.krijgtVergoeding());
   }
    @Test
    public void test2(){
        Vrijwilliger x = new Vrijwilliger("Sjaakie",58, false);
        x.v = 25.3;
        assertEquals(true, x.krijgtVergoeding());
    }
    @Test
    public void test3(){
        Vrijwilliger x = new Vrijwilliger("Kees",19, false);
        x.v = 23.5;
        assertEquals(true, x.krijgtVergoeding());
    }
    @Test
    public void test4(){
        Vrijwilliger x = new Vrijwilliger("Donnie",23, true);
        x.v = 9999.999;
        assertEquals(false, x.krijgtVergoeding());
    }
    @Test
    public void test5(){
        Vrijwilliger x = new Vrijwilliger("Paultje",19, true);
        x.v = 9999.999;
        assertEquals(false, x.krijgtVergoeding());
    }
    @Test
    public void test6(){
        Vrijwilliger x = new Vrijwilliger("Delano",19, true);
        x.v = 25.3;
        assertEquals(false, x.krijgtVergoeding());
    }
}