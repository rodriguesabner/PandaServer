package com.kingaspx.util;

import static com.kingaspx.util.HttpConnection.sendGet;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class NGrokDAO {

    NGrokModel mod = new NGrokModel();
    String url_tunnels = "http://127.0.0.1:4040/api/tunnels";

    public List<NGrokModel> get_url() {
        List<NGrokModel> list = new ArrayList<>();
        try {
            String result = sendGet(url_tunnels, "GET");
            JSONObject json = new JSONObject(result);
            JSONArray tunnels = json.getJSONArray("tunnels");
            
            String url = tunnels.getJSONObject(0).getString("public_url");
            String protocol = tunnels.getJSONObject(0).getString("proto");
            
            mod.setPublic_url(url);
            mod.setProto(protocol);
            
            list.add(mod);
        } catch (Exception e) {
            mod.setPublic_url("Offline");
            mod.setProto("Offline");
            list.add(mod);
        }
        return list;
    }

}
