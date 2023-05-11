package HW13.task3;

import HW13.JsonFileCreating;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TodoPerformer {

    private static final String URL = "https://jsonplaceholder.typicode.com";
    private static final HttpClient CLIENT = HttpClient.newHttpClient();
    private static final Gson GSON = new Gson();

    public void createJsonWithOpenTodos(int userId) throws IOException, InterruptedException {
        JsonFileCreating<ToDo> jsonFileCreating = new JsonFileCreating<>();
        String fileName = String.format("users-%s-open-todos.json", userId);
        jsonFileCreating.createJsonWithName(fileName, getOpenTodos(userId));

    }

    public List<ToDo> getOpenTodos(int userId) throws IOException, InterruptedException {
        ToDo[] result = getAllUsersTodos(userId);
        return Arrays.stream(result)
                .filter(task -> !task.isCompleted())
                .collect(Collectors.toList());
    }

    private ToDo[] getAllUsersTodos(int userId) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URL + "/users/" + userId + "/todos"))
                .GET()
                .build();

        final HttpResponse<String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
        return GSON.fromJson(response.body(), ToDo[].class);
    }
}
