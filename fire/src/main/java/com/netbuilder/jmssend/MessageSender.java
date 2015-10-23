package com.netbuilder.jmssend;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
 
@Component
public class MessageSender
{
    private final JmsTemplate jmsTemplate;
 
    @Autowired
    public MessageSender( final JmsTemplate jmsTemplate )
    {
        this.jmsTemplate = jmsTemplate;
    }
 
    public void send( final String message )
    {
        jmsTemplate.convertAndSend( "Queue.Name", message );
    }
}   