import java.util.Arrays;

public class Double_try_catch {
    public void tryCatch(){
        try {
            Double d2 = null;
            if ((d2 == null)) {
                throw new NullPointerException("Число є 0");
            }
        }
        catch (NullPointerException | IllegalArgumentException e){
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }

        System.out.println("");
        try {
            Double.parseDouble("-7");
            throw new NumberFormatException("Число відємне");
        } catch (NumberFormatException e2){
            System.out.println(e2.getMessage());
        }

    }
}
