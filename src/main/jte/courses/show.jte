@import org.example.hexlet.dto.courses.CoursePage
@param CoursePage coursePage

@template.layout.pageForPracticing(
content = @`
    <h1>${coursePage.getCourse().getName()}</h1>
    <h2>${coursePage.getCourse().getDescription()}</h2>
`,
footer = @`
    <a href="https://github.com/maximl93">My GitHub</a>
`
)