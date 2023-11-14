package io.github.kriolos.efatura.service;

import java.util.Optional;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v119.network.Network;
import io.github.kriolos.efatura.processes.components.LoginProcess;

public class GetTokenHelper {

    public static String init(String nif, String password) {
        
        ChromeDriver driver = new ChromeDriver();
        // driver.manage().window().maximize();
        
        //Set Dev-Tools and create a session
        DevTools tool = driver.getDevTools();
        tool.createSessionIfThereIsNotOne();
        
        final Object o = new Object();
        
        tool.send(Network.enable(Optional.empty(), Optional.empty(),Optional.empty()));

        final ConcurrentLinkedQueue<String> l = new ConcurrentLinkedQueue<>();

        //add listener to intercept request and continue
        tool.addListener(Network.requestWillBeSent(),
        r -> 
        {
                Object authorization = r.getRequest().getHeaders().get("Authorization");
                if(r.getRequest().getUrl().endsWith("/software") && authorization != null) 
                {
                        String jwt = ((String)authorization).split(" ")[1];
                        synchronized (o) 
                        {
                                l.add(jwt);
                                o.notify();
                        }
                }
        });

        driver.get("https://pe.efatura.cv/");
        
        LoginProcess.run(driver, nif, password);

        int i = 0 ;
        while (i < 6) {
                try {
                        synchronized (o) 
                        {
                                o.wait(10000);
                                if(l.size() > 0  ) 
                                {
                                        break;
                                }
                        }
                } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                }
                i++;
        }

        tool.disconnectSession();
        tool.close();
        driver.quit();

        return l.remove();
    }
}
