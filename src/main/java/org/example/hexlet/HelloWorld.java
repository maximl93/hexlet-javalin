package org.example.hexlet;

import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinJte;
import org.example.hexlet.dto.courses.CoursePage;
import org.example.hexlet.model.Course;

import static io.javalin.rendering.template.TemplateUtil.model;

public class HelloWorld {
    public static void main(String[] args) {
        // Создаем приложение
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
            config.fileRenderer(new JavalinJte());
        });
        // Описываем, что загрузится по адресу /
        app.get("/", context -> context.render("index.jte"));

        app.get("/users", ctx -> ctx.result("GET /users"));
        app.post("/users", ctx -> ctx.result("POST /users"));

        app.get("/hello", context -> {
            String name = context.queryParamAsClass("name", String.class).getOrDefault("World");

            context.result("Hello, " + name + "!");

        });

        app.get("/users/{id}/posts/{postId}", context -> {
           Long id = context.pathParamAsClass("id", Long.class).get();
           Long postId = context.pathParamAsClass("postId", Long.class).get();

           context.result("User id: " + id + ", post id: " + postId);
        });

        app.get("/course", context -> {

            Course course = new Course("Java", "Learning Java to become professional!");
            CoursePage coursePage = new CoursePage(course);
            context.render("courses/show.jte", model("coursePage", coursePage));
        });

        app.start(7070); // Стартуем веб-сервер
    }
}
