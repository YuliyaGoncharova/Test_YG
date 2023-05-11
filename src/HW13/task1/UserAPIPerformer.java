package HW13.task1;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Collection;


public class UserAPIPerformer {

    private static final String URL = "https://jsonplaceholder.typicode.com";
    private static final HttpClient CLIENT = HttpClient.newHttpClient();
//    private static final String UPDATE_USER_FILE = "updateUser.json";
    private static final String CONTENT_TYPE = "Content-Type";
    private static final Gson GSON = new Gson();
    private static final String JSON = "application/json; charset=UTF-8";

    public User createUser(User user) throws IOException, InterruptedException, URISyntaxException {

        String json = new Gson().toJson(user);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URL + "/users"))
                .header(CONTENT_TYPE, JSON)
                .POST(HttpRequest.BodyPublishers
                                .ofString(json))
                .build();
        return getUserBody(request);
    }

    public User updateUser(int userId, User user) throws IOException, InterruptedException, URISyntaxException {
        String json = new Gson().toJson(user);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URL + "/users/" + userId))
                .header(CONTENT_TYPE, JSON)
                .PUT(HttpRequest.BodyPublishers.ofString(json))
                .build();
        return getUserBody(request);
    }

    public void deleteUser(int userId) throws IOException, InterruptedException, URISyntaxException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URL + "/users/" + userId))
                .header(CONTENT_TYPE, JSON)
                .DELETE()
                .build();
        getUserBody(request);
    }


    public Collection<User> getAllUsers() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URL + "/users"))
                .header(CONTENT_TYPE, JSON)
                .GET()
                .build();

        final HttpResponse<String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response);
        Type collectionType = new TypeToken<Collection<User>>(){}.getType();
        return GSON.fromJson(response.body(),collectionType);
    }

    private User getUserBody(HttpRequest request) throws IOException, InterruptedException {
        final HttpResponse<String> response = CLIENT.send(request, HttpResponse
                .BodyHandlers.ofString());
        System.out.println(response);
        return GSON.fromJson(response.body(), User.class);
    }

    public User getUserById(int userId) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URL + "/users/" + userId))
                .header(CONTENT_TYPE, JSON)
                .GET()
                .build();

        final HttpResponse<String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response);
        return GSON.fromJson(response.body(), User.class);
    }

    public User getUserByUserName(String userName) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URL + "/users?username=" + userName))
                .header(CONTENT_TYPE, JSON)
                .GET()
                .build();

        final HttpResponse<String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response);

        User[] users = GSON.fromJson(response.body(), User[].class);

        return users[0];
    }


}
