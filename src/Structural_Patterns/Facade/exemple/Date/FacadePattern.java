package Structural_Patterns.Facade.exemple.Date;

class FacadePattern {
    public static void main(String[] args) {
        UserfriendlyDate d = new UserfriendlyDate("1980-08-20");
        System.out.println("Date : " + d);
        d.addDays(20);
        System.out.println("20 jours après : " + d);
    }
}
