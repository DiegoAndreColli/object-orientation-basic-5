package object.orientation.pattern;

import java.util.ArrayList;
import java.util.List;

public class Start {

    public static void main(String[] args) {
       Customer a = new Customer();
       a.setName("Diego");
       
       Customer b = new Customer();
       b.setName("Flávia");
       b.setWoman(true);
       
       Customer c = new Customer();
       c.setName("Eduardo");       
       c.setElderly(true);
       
       Sale sNoDis = new Sale();
       sNoDis.setCustomer(a);
       sNoDis.setLines(getRegularLines());
       System.out.println("No Disc:  "+sNoDis.getTotal());
       
       Sale sAsDis = new Sale();
       sAsDis.setCustomer(a);
       sAsDis.setLines(getAspirinLines());
       System.out.println("Disc ASp:  "+sAsDis.getTotal());
       
       Sale sWoman = new Sale();
       sWoman.setCustomer(b);
       sWoman.setLines(getRegularLines());
       System.out.println("Woman:  "+sWoman.getTotal());
       
       Sale sWomanAsp = new Sale();
       sWomanAsp.setCustomer(b);
       sWomanAsp.setLines(getAspirinLines());
       System.out.println("Woman + Asp:  "+sWomanAsp.getTotal());
       
       Sale sElder = new Sale();
       sElder.setCustomer(c);
       sElder.setLines(getRegularLines());
       System.out.println("Elder:  "+sElder.getTotal());
       
       Sale sElderAsp = new Sale();       
       sElderAsp.setCustomer(c);
       sElderAsp.setLines(getAspirinLines());
       System.out.println("Elder + asp:  "+sElderAsp.getTotal());
       
    }
    
    private static List<SaleLine> getRegularLines(){
        List<SaleLine> lines = new ArrayList<>();
        SaleLine l1 = new SaleLine();
        SaleLine l2 = new SaleLine();
        SaleLine l3 = new SaleLine();
        SaleLine l4 = new SaleLine();
        SaleLine l5 = new SaleLine();
        
        Item i1 = new Item();
        i1.setName("Bread");
        i1.setValue(0.1);
        l1.setItem(i1);
        l1.setQuantity(10.0);        
        lines.add(l1);
        //1
        
        Item i2 = new Item();
        i2.setName("Milk");
        i2.setValue(1.5);
        l2.setItem(i2);
        l2.setQuantity(1.0);        
        lines.add(l2);
        //2.5
        
        Item i3 = new Item();
        i3.setName("Cheese");
        i3.setValue(2.0);
        l3.setItem(i3);
        l3.setQuantity(1.0);        
        lines.add(l3);
        //4.5
        
        Item i4 = new Item();
        i4.setName("Bacon");
        i4.setValue(2.0);
        l4.setItem(i4);
        l4.setQuantity(2.0);        
        lines.add(l4);
        //8.5
        
        Item i5 = new Item();
        i5.setName("Mustard");
        i5.setValue(1.5);
        l5.setItem(i5);
        l5.setQuantity(1.0);        
        lines.add(l5);
        //10
        
        return lines;
    }
    
    private static List<SaleLine> getAspirinLines(){
        List<SaleLine> lines = getRegularLines();
        SaleLine l1 = new SaleLine();
        SaleLine l2 = new SaleLine();
        
        Item i1 = new Item();
        i1.setName("aspirin");
        i1.setValue(1.0);
        l1.setItem(i1);
        l1.setQuantity(5.0);        
        lines.add(l1);
        //15
        
        Item i2 = new Item();
        i2.setName("aspirin");
        i2.setValue(2.0);
        l2.setItem(i2);
        l2.setQuantity(1.0);        
        lines.add(l2);
        //17
        
        return lines;
    }
    
}
