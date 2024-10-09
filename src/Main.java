
import java.io.IOException;
import java.util.List;

import complexity.Turing;
import complexity.Turing.TuringException;

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
        } catch (IOException | TuringException e) {
            System.out.println(e);
        }
    }
}