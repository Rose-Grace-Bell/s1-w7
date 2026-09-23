public class Weight{

    private int pounds;
    private int ounces;

    public Weight(int lb, int o){
        if(o> 0){
          if(o<16){
            ounces = o;
          }  
        }
        if(lb>0){
            pounds = lb;
        }
    }

    public Weight(int lb){
        this(lb,0);
    }

    public int totalOunces(Weight thing){
        return thing.ounces + 16 * thing.pounds;
    }
    
    public Boolean isHeavier(Weight oth){
        int totalW = totalOunces(this);
        int otherW = totalOunces(oth);
        return totalW > otherW;
        //David Bowie
    }
    public Weight multiply(int scale){
        int multWeight = totalOunces(this) * scale;
        int nlb = multWeight / 16;
        int no = multWeight % 16;
        return new Weight(nlb , no);
    }

    public void print(){
        System.out.println("Ponds: " + pounds + " Ounces: " + ounces);
    }
}