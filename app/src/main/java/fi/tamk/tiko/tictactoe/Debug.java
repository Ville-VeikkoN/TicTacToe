package fi.tamk.tiko.tictactoe;

import android.content.Context;

public class Debug {
    public static int DEBUG_LEVEL;
    public static boolean DISPLAY_LOG_UI;

    public static void print() {

    }

    public static void loadDebug(Context host) {
        DEBUG_LEVEL = host.getResources().getInteger(R.integer.debug_level);
        DISPLAY_LOG_UI = host.getResources().getBoolean(R.bool.display_log_ui);
    }
}
