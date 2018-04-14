// IBookManager.aidl
package com.example.wy521angel.ipctest;

// Declare any non-default types here with import statements

import com.example.wy521angel.ipctest.model.Book;
import com.example.wy521angel.ipctest.IOnNewBookArrivedListener;
interface IBookManager {

    List<Book>getBookList();
    void addBook(in Book book);
    void registerListener(IOnNewBookArrivedListener listener);
    void unregisterListener(IOnNewBookArrivedListener listener);

}
