package com.example.wy521angel.ipctest.mybinder;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

import java.util.List;

/**
 * Created by wy521angel on 2017/10/24.
 */

public interface IBookManager extends IInterface {

    static final String DESCRIPTOR = "com.example.wy521angel.filesharingtest.mybinder.IBookManager";

    static final int TRANSACTION_getBookList = (IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_addBook = (IBinder.FIRST_CALL_TRANSACTION + 1);

    public List<Book> getBookList() throws RemoteException;

    public void addBook(Book book) throws RemoteException;
}