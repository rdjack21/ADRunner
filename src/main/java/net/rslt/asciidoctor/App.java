package net.rslt.asciidoctor;

import org.asciidoctor.cli.AsciidoctorInvoker;

/**
 * This application is used to parse asciidoctor files with out the need to install ruby.
 *
 */
public class App {

  public static void main(String[] args) {
    
    // Use the AsciidoctorJ command line processor instead of our own. 
    // This means we can use the same options as the ruby interface that 
    // is documented in the official documentation. 
    
    AsciidoctorInvoker invoker = new AsciidoctorInvoker();
    invoker.invoke(args);
    
  }
}
