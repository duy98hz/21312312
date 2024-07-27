final class Class_gi implements Runnable {
   public void run() {
      while(true) {
         try {
            Thread.sleep(1L);
         } catch (InterruptedException var2) {
         }

         Class_cv.mq = Class_aa.a;
      }
   }
}
