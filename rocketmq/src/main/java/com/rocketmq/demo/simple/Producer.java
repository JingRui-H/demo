package com.rocketmq.demo.simple;

import com.alibaba.rocketmq.client.exception.MQBrokerException;
import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.client.producer.DefaultMQProducer;
import com.alibaba.rocketmq.client.producer.SendResult;
import com.alibaba.rocketmq.common.message.Message;
import com.alibaba.rocketmq.remoting.exception.RemotingException;


public class Producer {

    public static final String NAME_SERVER = "10.98.91.171:9876";
    public static void main(String[] args) throws MQClientException, RemotingException, InterruptedException, MQBrokerException {
        DefaultMQProducer producer = new DefaultMQProducer("test_quick_producer_group");
        producer.setNamesrvAddr(NAME_SERVER);
        producer.start();

        for (int i = 0; i < 5; i++) {
            Message message = new Message("test_topic", "TAG_A", "KEY_A", ("this is message : " + i).getBytes());
            SendResult sendResult = producer.send(message);
            System.out.println("sendResult = " + sendResult);
        }
    }
}
