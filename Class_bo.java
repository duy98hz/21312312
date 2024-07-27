import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;

final class Class_bo implements Runnable {
   // $FF: synthetic field
   private final String a;
   // $FF: synthetic field
   private static final int[] b;
   // $FF: synthetic field
   private Class_ez c;

   private static boolean a(Object var0) {
      return var0 != null;
   }

   public final void run() {
      Class_ez.g = (boolean)b[0];
      (new Thread(new Class_bt())).start();
      this.c.f = (boolean)b[1];
      Thread.currentThread().setPriority(b[1]);
      this.c.b = (boolean)b[1];

      try {
         String var1 = "socket://103.178.234.230:14444";
         this.c.p = (SocketConnection)Connector.open(var1);
         Class_ez.a(this.c, this.c.p.openDataOutputStream());
         this.c.j = this.c.p.openDataInputStream();
         (new Thread(Class_ez.c(this.c))).start();
         this.c.c = new Thread(new Class_bd(this.c));
         this.c.c.start();
         this.c.n = System.currentTimeMillis();
         Class_ez.a(this.c, new Class_bg((byte)b[2]));
         this.c.f = (boolean)b[0];
         System.out.println("Connect ok");
      } catch (Exception var4) {
         label26: {
            try {
               Thread.sleep(500L);
            } catch (InterruptedException var3) {
               break label26;
            }

            "".length();
            if (-"   ".length() >= 0) {
               return;
            }
         }

         if (a(Class_ez.g) && a(this.c.o)) {
            this.c.b();
            this.c.o.b();
         }

         return;
      }

      "".length();
      if (((130 ^ 143) & ~(204 ^ 193)) == 0) {
         ;
      }
   }

   Class_bo(Class_ez var1, String var2) {
      this.c = var1;
      this.a = var2;
   }

   private static void a() {
      b = new int[3];
      b[0] = (176 ^ 138) & ~(89 ^ 99);
      b[1] = " ".length();
      b[2] = -(145 ^ 142 ^ 141 ^ 137);
   }

   private static boolean a(int var0) {
      return var0 == 0;
   }

   static {
      a();
   }
}
