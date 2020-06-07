package java1;

import com.sun.corba.se.spi.orb.Operation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperationFactory {   //简单工厂类,负责创建具体操作类对象

   // 简单工厂模式专门提供了工厂类用于创建对象,将对象的创建和对象的使用分开
    //优点:
      //      1. 工厂类负责创建具体产品类,客户端可以不用创建对象,直接使用即可.
//2. 客户端无需知道所创建具体产品名称,只需要知道具体产品类所对应的参数即可,减少了对于复
   // 杂类名的记忆.
//3. 通过引入配置文件,可以不修改客户端的情况加更换具体产品类.提高了系统灵活性
    public static Operation createOperation(String operate) {//消息机制
        Operation oper = null;
        // if ("+".equals(operate))
        //     oper = new OperationAdd();
        // else if ("-".equals(operate))
        //     oper = new OperationSub();
        //  else if ("*".equals(operate))
        //    oper = new OperationMul();
        // else if ("/".equals(operate))
        //    oper = new OperationDiv();

        if("+".equals(operate)){
            oper = (Operation) new OperationAdd();
        }
        else if("-".equals(operate)){
            oper = (Operation) new OperationSub();
        }
        else if("*".equals(operate)){
            oper = (Operation) new OperationMul();
        }
        else  if("/".equals(operate)){
            oper = (Operation) new OperationDiv();
        }



        return oper;
    }


}

