package org.example.hexlet;

import io.javalin.Javalin;

public class HelloWorld {
    public static void main(String[] args) {
        // Создаем приложение
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
        });
        // Описываем, что загрузится по адресу /
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

        app.start(7070); // Стартуем веб-сервер
    }
}
