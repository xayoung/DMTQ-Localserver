package icu.samnya.dmtq_server.server.util;

import org.json.JSONObject;

public class JsonUtil {
    public static Object jsonNull(Object o) {
        if (o != null) {
            return o;
        } else {
            return JSONObject.NULL;
        }
    }
}
