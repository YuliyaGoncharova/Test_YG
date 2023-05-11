package HW13.task2;

import HW13.JsonFileCreating;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;
import java.util.List;

public class CommentsAPIPerformer {
    private static final String URL = "https://jsonplaceholder.typicode.com";
    private static final HttpClient CLIENT = HttpClient.newHttpClient();
    private static final Gson GSON = new Gson();


    public void createJsonWithAllComments (int userId) throws IOException, InterruptedException {
        JsonFileCreating<Comments> jsonFileCreating = new JsonFileCreating();
        String fileName = String.format("user-%s-post-%s-comments.json", userId, getIdOfTheLastPost(userId));
        jsonFileCreating.createJsonWithName(fileName, getAllCommentsForLastPost(userId));
    }

    public List<Comments> getAllCommentsForLastPost(int userId) throws IOException, InterruptedException {
        int lastPostId = getIdOfTheLastPost(userId);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URL + "/posts/" + lastPostId + "/comments"))
                .GET().build();
        final HttpResponse<String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
        Comments[] result = GSON.fromJson(response.body(), Comments[].class);
        return Arrays.asList(result);
    }

    private int getIdOfTheLastPost(int userId) throws IOException, InterruptedException {
         Post[] result = getAllPostsbyUserId(userId);
         return Arrays.stream(result)
                 .map(Post::getId)
                 .mapToInt(Integer::intValue)
                 .max().getAsInt();


    }

    public Post[] getAllPostsbyUserId(int userId) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URL + "/users/" + userId + "/posts"))
                .GET().build();

        final HttpResponse<String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
        return GSON.fromJson(response.body(), Post[].class);
    }

}
