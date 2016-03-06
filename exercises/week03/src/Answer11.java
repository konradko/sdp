/**
 Question: Write a code example to define a Writer object that wraps text at 15 characters,
 centres the text, sets the text to random casing, and directs the output to System.out.
 Which design pattern are you using?

 Answer: Decorator pattern
 */
import com.sun.deploy.util.StringUtils;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

interface Printer {
    void print(String text) throws IOException;
}

class RawPrinter implements Printer {
    private Writer out = new PrintWriter(System.out);

    public void print(String text) throws IOException {
        out.write(text);
        out.close();
    }
}

class PrinterDecorator implements Printer {
    private Printer printer;

    public PrinterDecorator(Printer p) {
        this.printer = p;
    }

    public static String wrapText(String text, int limit) {
        for (int i = 0; i < text.length(); i++){
            if (i % (limit + 1) == 0) {
                text = text.substring(0, i) + "\n" + text.substring(i, text.length());
            }
        }

        return text;
    }

    public static String randomiseCase(String text) {
        if (Math.random() < 0.5) {
            return text.toLowerCase();
        }
        return text.toUpperCase();
    }

    public static String centerText(String text) {
        return text.replace("\n", "\n\t\t\t\t\t\t");
    }

    public void print(String text) throws IOException {
        text = randomiseCase(text);
        text = wrapText(text, 15);
        text = centerText(text);
        this.printer.print(text);
    }
}

public class Answer11 {
    public static void main(String[] args) {
        Printer printer = new RawPrinter();
        PrinterDecorator decoratedPrinter = new PrinterDecorator(printer);
        try {
            decoratedPrinter.print("One morning, when Gregor Samsa woke from troubled dreams, he found himself transformed in his bed into a horrible vermin. He lay on his armour-like back, and if he lifted his head a little he could see his brown belly, slightly domed and divided by arches into stiff sections. The bedding was hardly able to cover it and seemed ready to slide off any moment. His many legs, pitifully thin compared with the size of the rest of him, waved about helplessly as he looked. \"What's happened to me?\" he thought. It wasn't a dream. His room, a proper human room although a little too small, lay peacefully between its four familiar walls. A collection of textile samples lay spread out on the table - Samsa was a travelling salesman - and above it there hung a picture that he had recently cut out of an illustrated magazine and housed in a nice, gilded frame. It showed a lady fitted out with a fur hat and fur boa who sat upright, raising a heavy fur muff that covered the whole of her lower arm towards the viewer.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
