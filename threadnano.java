import java.lang.management.*;
import java.nio.file.*;

public class threadnano 
{
  public long Nano1() throws InterruptedException
  {
  ThreadMXBean ThreadBean1 = ManagementFactory.getThreadMXBean();
  {
  try
  {
 if (ThreadBean1.isThreadCpuTimeSupported())
      ThreadBean1.setThreadCpuTimeEnabled(true);
  else
      throw new AccessDeniedException("");
}
catch (AccessDeniedException e)
{
System.out.println("CPU Usage monitoring is not available!");
System.exit(0);
}
      while(true)
      {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
          try
          {
              int j = 0;
              for (int i = 0; i < 20000000; i++)
                  j = (j + i) * j / 2;
              Thread.sleep(10);
          }
          catch (InterruptedException e)
          {
          }
          long Nano1 = System.nanoTime();
          long ThreadTime1 = ThreadBean1.getCurrentThreadCpuTime();
        }
      }
  }

public Long Nano2() throws InterruptedException
{
ThreadMXBean ThreadBean2 = ManagementFactory.getThreadMXBean();
{
  try
  {
  if (ThreadBean2.isThreadCpuTimeSupported())
      ThreadBean2.setThreadCpuTimeEnabled(true);
  else
      throw new AccessDeniedException("");
}
catch (AccessDeniedException e)
{
System.out.println("CPU Usage monitoring is not available!");
System.exit(0);
}
      while(true)
      {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
          try
          {
              int j = 0;
              for (int i = 0; i < 20000000; i++)
                  j = (j + i) * j / 2;
              Thread.sleep(10);
          }
          catch (InterruptedException e)
          {
          }
          Long Nano2 = System.nanoTime();
          Long ThreadTime2 = ThreadBean2.getCurrentThreadCpuTime();
        }
      }
  }
}