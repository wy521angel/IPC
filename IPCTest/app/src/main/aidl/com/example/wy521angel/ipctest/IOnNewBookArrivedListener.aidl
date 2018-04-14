package com.example.wy521angel.ipctest;

import com.example.wy521angel.ipctest.model.Book;

interface IOnNewBookArrivedListener {
    void onNewBookArrived(in Book newBook);
}
