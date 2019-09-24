
public class Driver {

    public static void main(String[] args) {
        
        // instantiate the corgi object
        Corgi corgi = new Corgi ("cattle herding", "Pembroke Welsh Corgi", "Wales", 31, 12);
        
        // set top trick for corgi object
        corgi.setToptrick("Lassoing cattle");
        
        // print the output to the console
        System.out.println(corgi.toString());
    }

}
