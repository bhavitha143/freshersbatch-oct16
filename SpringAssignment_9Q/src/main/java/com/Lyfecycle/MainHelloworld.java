package com.Lyfecycle;

	import org.springframework
    .context
    .ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 


// Driver class
public class MainHelloworld  {
 
    public static void main(String[] args)
        throws Exception
    {
 
   ConfigurableApplicationContext cap
            = new ClassPathXmlApplicationContext(
                "beans.xml");
   cap.close();
    }
}


