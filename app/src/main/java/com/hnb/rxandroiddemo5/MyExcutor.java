package com.hnb.rxandroiddemo5;

import java.util.concurrent.Executor;


public class MyExcutor implements Executor
{

    @Override
    public void execute(Runnable runnable)
    {
        new Thread(runnable).start();
    }

}
