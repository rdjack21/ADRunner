package net.rslt.asciidoctor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import org.asciidoctor.Asciidoctor;

/**
 * This application is used to parse asciidoctor files with out the need to install ruby.
 *
 */
public class App {

  static String fileToProcess = "/var/code/server/rslt-root/docs/index.adoc";
  
  public static void main(String[] args) {
    Asciidoctor adoc = Asciidoctor.Factory.create();

    int argCount = 0;
    for(String param: args) {
      adoc.convertFile(new File(param), new HashMap<String, Object>());
     System.out.printf("Processed file: %s\n", param);
    }

  }
}
