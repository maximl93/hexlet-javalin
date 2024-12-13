package gg.jte.generated.ondemand.layout;
import gg.jte.Content;
public final class JtepageForPracticingGenerated {
	public static final String JTE_NAME = "layout/pageForPracticing.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,19,19,19,19,22,22,22,25,25,25,1,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Content content, Content footer) {
		jteOutput.writeContent("\r\n<!doctype html>\r\n\r\n<html lang=\"en\">\r\n<head>\r\n    <meta charset=\"UTF-8\">\r\n    <title>\r\n        Test\r\n    </title>\r\n</head>\r\n<body>\r\n<header>\r\n    <h1>For practice</h1>\r\n    <a href=\"/\">Main page</a>\r\n</header>\r\n<div class=\"content\">\r\n    ");
		jteOutput.setContext("div", null);
		jteOutput.writeUserContent(content);
		jteOutput.writeContent("\r\n</div>\r\n<div class=\"footer\">\r\n    ");
		jteOutput.setContext("div", null);
		jteOutput.writeUserContent(footer);
		jteOutput.writeContent("\r\n</div>\r\n</body>\r\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Content content = (Content)params.get("content");
		Content footer = (Content)params.get("footer");
		render(jteOutput, jteHtmlInterceptor, content, footer);
	}
}
