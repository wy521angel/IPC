package com.example.wy521angel.ipctest.binderpool;

import android.os.RemoteException;

import com.example.wy521angel.ipctest.ISecurityCenter;

/**
 * Created by wy521angel on 2017/10/31.
 */

public class SecurityCenterImpl extends ISecurityCenter.Stub{

    private static final char SECRET_CODE = '^';

    @Override
    public String encrypt(String content) throws RemoteException {
        char[] chars = content.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] ^= SECRET_CODE;
        }
        return new String(chars);
    }

    @Override
    public String decrypt(String password) throws RemoteException {
        return encrypt(password);
    }
}
