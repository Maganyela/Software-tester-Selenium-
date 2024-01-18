package ApiRunner;

import RestCalls.RestService;
import org.testng.annotations.Test;

public class ApiRunner {

    @Test(priority = 0, description = "create user")

    void createUser(){
        System.out.println("test case : create user");
        RestService.createuser(500,"xxxxxx");
    }

    @Test(priority = 1, description = "get user")

    void getUser(){
        System.out.println("test case : get user");
        RestService.getuser("xxxxxx");
    }

    @Test(priority = 2, description = "update user")

    void updateUser(){
        System.out.println("test case : update user");
        RestService.updateuser("cccccc");
    }

    @Test(priority = 3, description = "get user2")

    void getUser2(){
        System.out.println("test case : get user2");
        RestService.getuser("cccccc");
    }

    @Test(priority = 4, description = "delete user")

    void deleteUser(){
        System.out.println("test case : delete user");
        RestService.deleteuser("cccccc");
    }

//    @Test(priority = 5, description = "get user3")
//    void getUser3(){
//        System.out.println("test case : get user3");
//        RestService.getuserNegative("cccccc");
//    }

}
