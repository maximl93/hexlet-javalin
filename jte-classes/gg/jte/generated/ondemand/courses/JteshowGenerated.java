package gg.jte.generated.ondemand.courses;
import org.example.hexlet.dto.courses.CoursePage;
public final class JteshowGenerated {
	public static final String JTE_NAME = "courses/show.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,3,3,6,6,7,7,7,8,8,8,9,9,9,9,11,11,11,11,11,1,1,1,1};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, CoursePage coursePage) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.layout.JtepageForPracticingGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n    <h1>");
				jteOutput.setContext("h1", null);
				jteOutput.writeUserContent(coursePage.getCourse().getName());
				jteOutput.writeContent("</h1>\r\n    <h2>");
				jteOutput.setContext("h2", null);
				jteOutput.writeUserContent(coursePage.getCourse().getDescription());
				jteOutput.writeContent("</h2>\r\n");
			}
		}, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n    <a href=\"https://github.com/maximl93\">My GitHub</a>\r\n");
			}
		});
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		CoursePage coursePage = (CoursePage)params.get("coursePage");
		render(jteOutput, jteHtmlInterceptor, coursePage);
	}
}
