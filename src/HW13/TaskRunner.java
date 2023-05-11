package HW13;

import HW13.task1.Address;
import HW13.task1.Company;
import HW13.task1.UserAPIPerformer;
import HW13.task1.User;
import HW13.task2.CommentsAPIPerformer;
import HW13.task3.TodoPerformer;

import java.io.IOException;
import java.net.URISyntaxException;

public class TaskRunner {

    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {
        UserAPIPerformer userAPIPerformer = new UserAPIPerformer();
        CommentsAPIPerformer commentsAPIPerformer = new CommentsAPIPerformer();
        TodoPerformer todoPerformer = new TodoPerformer();


        User user1 = new User("Ivan", "Prychodko",
                "ghrty@gnail.com", "123345-2345",
                "www.ghjsadhgj.in.ua");

        Address address2 = new Address("Winnicka", "RTY", "Gdansk", "42-456");
        Company company2 = new Company("BFG", "Greate", "none");

        User user2 = new User("name2", "username2", "22email2@gmail.com", address2, "+3801111", "www.dtryeter.gy", company2);


        /* TASK 1 **/
        System.out.println("Create user: ");
        System.out.printf("userAPIPerformer.createUser() = %s\n\n", userAPIPerformer.createUser(user2));

        final int userIdForUpdate = 9;
        System.out.println("Update user: ");
        System.out.printf("User %s is updated \n", userIdForUpdate);
        System.out.printf("userAPIPerformer.updateUser(%s) = %s\n\n",
                userIdForUpdate,
                userAPIPerformer.updateUser(userIdForUpdate, user1));
//
        System.out.println("\n Delete user: ");
        final int userIdForDelete = 6;
        userAPIPerformer.deleteUser(userIdForDelete);
        System.out.printf("User %s is deleted \n\n", userIdForDelete);

        System.out.println("\n Get all users list: ");
        System.out.printf("userAPIPerformer.getAllUsers() = %s\n\n", userAPIPerformer.getAllUsers());
//
        final int userIdForUserById = 7;
        System.out.printf("\n Get user with ID = %s: ", userIdForUserById);
        System.out.println(userAPIPerformer.getUserById(userIdForUserById));

        final String userNamebyUserName = "Kamren";
        System.out.printf("\n Get user with UserName %s: ", userNamebyUserName);
        System.out.println(userAPIPerformer.getUserByUserName(userNamebyUserName));


        /* TASK 2 **/
        final int commentsUserId = 5;
        System.out.printf("\n\n All comments to the last post of user with ID = %s:\n", commentsUserId);
        System.out.printf("commentsAPIPerformer.getAllCommentsForLastPost(%s) = %s",  commentsUserId, commentsAPIPerformer.getAllCommentsForLastPost(commentsUserId));
        commentsAPIPerformer.createJsonWithAllComments(5);

        /* TASK 3 **/
        final int todoUserId = 2;
        System.out.printf("\n\n All open tasks for user with ID = %s", todoUserId);
        System.out.printf("\n todoPerformer.getOpenTasks(%s) = %s", todoUserId, todoPerformer.getOpenTodos(todoUserId));
        todoPerformer.createJsonWithOpenTodos(todoUserId);


    }
}
