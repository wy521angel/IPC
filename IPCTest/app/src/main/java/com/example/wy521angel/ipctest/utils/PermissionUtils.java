package com.example.wy521angel.ipctest.utils;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;

import java.util.ArrayList;

/**
 * Created by wy521angel on 16/5/25.
 */
public class PermissionUtils {
    public static void chekPermissions(Activity activity, int checkedMinVersion, String... permissions) {
        if (permissions == null || permissions.length == 0) {
            return;
        }
        if (Build.VERSION.SDK_INT >= checkedMinVersion) {
            int checkPermissionLocation;
            ArrayList<String> checkedPermissions = new ArrayList<>();

            for (String permission : permissions) {
                checkPermissionLocation = ContextCompat.checkSelfPermission(activity, permission);
                if (checkPermissionLocation != PackageManager.PERMISSION_GRANTED) {
                    checkedPermissions.add(permission);
                }
            }
            if (checkedPermissions.size() > 0) {
                ActivityCompat.requestPermissions(activity, checkedPermissions.toArray(new String[checkedPermissions.size()]), 0);
            }
        }

    }

    public static boolean isPermissions(Activity activity, int checkedMinVersion, String permission) {
        if (permission == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= checkedMinVersion) {
            int checkPermissionLocation;
            checkPermissionLocation = ContextCompat.checkSelfPermission(activity, permission);
            if (checkPermissionLocation != PackageManager.PERMISSION_GRANTED) {
                return false;
            }
        }
        return true;
    }

    public static boolean isGranted(Activity activity, String permission) {
        return ActivityCompat.checkSelfPermission(activity, permission) == PackageManager.PERMISSION_GRANTED;
    }
}
