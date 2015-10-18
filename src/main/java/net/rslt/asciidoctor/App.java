package net.rslt.asciidoctor;

import java.util.HashMap;
import org.asciidoctor.Asciidoctor;

/**
 * This application is used to parse asciidoctor files with out the need to 
 * install ruby. 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Asciidoctor adoc = Asciidoctor.Factory.create();
		String html = adoc.convert("Writing AsciiDoc is _easy_!", 
				new HashMap<String, Object>());
		System.out.println(html);
	}
}
