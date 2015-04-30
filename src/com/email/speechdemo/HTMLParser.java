package com.email.speechdemo;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class HTMLParser {

	public String getEmailBody(String html)
	{
		/*String html = "<html><head><title>First parse</title></head>" +
				"<body>" +
				"<p>Parsed HTML into a doc.</p><table id='result'><tr><td>First col</td>" +
				"<td>Second Col</td></tr><tr><td>Second row</td></tr></table" +
				"</body></html>";*/
	
		
		Document doc = Jsoup.parse(html);
		Elements links = doc.select("p");
//		Element head = doc.select("body").first();
		
		String content = links.text();
		
		return content;
	}
}
