package fi.tamk.tiko.tictactoe;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class Debug {
    static int DEBUG_LEVEL;
    static boolean DISPLAY_LOG_UI;
    static Context context;
    static Toast toast;

    public static void print(String tag, String msg, int level) {
        if(BuildConfig.DEBUG && level <= DEBUG_LEVEL) {
            Log.d(tag,msg);
        }
        if(DISPLAY_LOG_UI) {
            toast = Toast.makeText(context, msg, Toast.LENGTH_SHORT);
            toast.show();
        }

    }

    public static void loadDebug(Context host) {
        DEBUG_LEVEL = host.getResources().getInteger(R.integer.debug_level);
        DISPLAY_LOG_UI = host.getResources().getBoolean(R.bool.display_log_ui);
        context = host.getApplicationContext();
    }
}
