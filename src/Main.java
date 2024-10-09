import complexity.Turing;

import java.io.IOException;
import java.util.List;

/**
 * A simple example
 *
 * @author Mirko Alicastro
 * @link https://github.com/mirkoalicastro/turing
 */

public class Main {
    public static void main(String[] args) throws Exception {
        String fileName = "src//complexity//homeWork02";
        Turing machine;
        List<Turing.Output> outputs;
        try {
            machine = new Turing(fileName);
            outputs = machine.run(true);
            System.out.println(outputs);
            System.out.println("The turing machine has " + machine.getTapesNumber() + " tapes");
//            if(Utils.containsAtLeast(outputs, Turing.FINAL_STATE.YES))
//                System.out.println(machine.getInput() + " is not palindrome");
//            else
//                System.out.println(machine.getInput() + " is palindrome");
        } catch(IOException | Turing.TuringException e) {
            System.out.println(e);
        }
    }
}
