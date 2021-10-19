import java.util.HashMap;

public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    HashMap<String,String> registerinfo = new HashMap<String,String>();

    IDandPasswords(){

        logininfo.put("123","123");
        logininfo.put("Ben","123");
        logininfo.put("Komi","123");
    }
    protected HashMap getLoginInfo(){
        return logininfo;
    }






}
