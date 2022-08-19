package de.ipus.timasapp;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PuS extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("setSessionID")) {
            String sessionID = args.getString(0);
            this.setSessionID(message, callbackContext);
            return true;
        }
        return false;
    }


     private void setSessionID(String sessionID, CallbackContext callbackContext) {
        if (sessionID != null && sessionID.length() > 0) {
            callbackContext.success("SessionID wurde erfolgreich gesetzt: " + sessionID);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }
}