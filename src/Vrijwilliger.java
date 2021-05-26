
public class Vrijwilliger {
    public static void main(String [] args){  }
    String naam;
    Integer leeftijd;
    Boolean ZZP;
    Double v = 0.0;

    public Vrijwilliger(String naam, Integer leeftijd, Boolean ZZP){
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.ZZP = ZZP;
    }
        public Boolean krijgtVergoeding(){
            if (((Vrijwilliger.this.v < 180.00) &&
                    (!Vrijwilliger.this.ZZP)) ||
            ((Vrijwilliger.this.leeftijd > 20) &&
                    (!Vrijwilliger.this.ZZP))){ return true; }
            else{return false;} }


    public Double Vergoeding(Integer uren){
        if (Vrijwilliger.this.v < 180.00) {
            if (this.leeftijd > 21) { v = uren*5.00; }
            else {
                if (this.ZZP) { v = uren*35.00; }
                else { v = uren*2.50; } } }
        return v;
    }
}


