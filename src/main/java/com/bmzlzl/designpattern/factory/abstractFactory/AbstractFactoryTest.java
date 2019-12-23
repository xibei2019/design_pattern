package com.bmzlzl.designpattern.factory.abstractFactory;


/**
 * 抽象工厂测试
 *
 * @author jagger
 * @date 2019/12/23 21:03
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        IDatabaseUtils databaseUtils = new MysqlDataBaseUtil();
        IConnection connection = databaseUtils.getConnection();
        connection.connect();
        ICommand command = databaseUtils.getCommand();
        command.command();
    }
}

interface IConnection {
    void connect();
}

interface ICommand {
    void command();
}

class MySqlConnectoin implements IConnection {

    public void connect() {
        System.out.println("mysql connection...");
    }
}

class MysqlCommand implements ICommand {

    public void command() {
        System.out.println("mysql command...");
    }
}

interface IDatabaseUtils {
    IConnection getConnection();

    ICommand getCommand();
}

class MysqlDataBaseUtil implements IDatabaseUtils {

    public IConnection getConnection() {
        return new MySqlConnectoin();
    }

    public ICommand getCommand() {
        return new MysqlCommand();
    }
}