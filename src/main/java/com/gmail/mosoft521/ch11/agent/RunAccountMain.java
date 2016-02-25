package com.gmail.mosoft521.ch11.agent;

import com.gmail.mosoft521.ch11.aop.timestat.Account;

/**
 * -javaagent d:/ja.jar
 * <p>
 * -javaagent:d:/jat.jar=argument
 *
 * @author Administrator
 */
public class RunAccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        account.operation();
    }
}
