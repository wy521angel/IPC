package com.example.wy521angel.ipctest.binderpool;

import android.os.RemoteException;

import com.example.wy521angel.ipctest.ICompute;

/**
 * Created by wy521angel on 2017/10/31.
 */

public class ComputeImpl extends ICompute.Stub {
    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }
}
