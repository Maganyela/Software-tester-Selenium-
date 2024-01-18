package RestCalls;

import org.json.JSONObject;

public class RestBody {


    public static String createuser(int id, String userName){
        JSONObject stockObject = new JSONObject();
        stockObject.put("id",id);
        stockObject.put("username", userName);

        return stockObject.toString();
    }

    public static String updateuser(String userName){
        JSONObject stockObject = new JSONObject();
        stockObject.put("username", userName);

        return stockObject.toString();

    }

}

