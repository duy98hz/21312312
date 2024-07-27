final class Class_dv implements Runnable {
   // $FF: synthetic field
   final Class_ez a;
   // $FF: synthetic field
   private static final int[] b;

   private static void a() {
      b = new int[1];
      b[0] = (44 ^ 43) & ~(178 ^ 181);
   }

   public final void run() {
      "".length();
      if (-" ".length() <= 0) {
         while(!a(this.a.b)) {
            try {
               label50: {
                  if (c(this.a.e)) {
                     "".length();
                     if (-" ".length() < -" ".length()) {
                        return;
                     }

                     while(!b(Class_ez.a(this.a).size())) {
                        Class_dx.ac();
                        "".length();
                        Class_bg var1 = (Class_bg)Class_ez.a(this.a).elementAt(b[0]);
                        Class_ez.a(this.a).removeElementAt(b[0]);
                        Class_ez.a(this.a, var1);
                     }
                  }

                  try {
                     Thread.sleep(10L);
                  } catch (InterruptedException var2) {
                     break label50;
                  }

                  "".length();
                  if (" ".length() >= "   ".length()) {
                     return;
                  }
                  continue;
               }
            } catch (Exception var3) {
               var3.printStackTrace();
               continue;
            }

            "".length();
            if (null != null) {
               return;
            }
         }

      }
   }

   public Class_dv(Class_ez var1) {
      this.a = var1;
      Class_ez.a(var1, new Class_ge());
   }

   private static boolean a(int var0) {
      return var0 == 0;
   }

   static {
      a();
   }

   private static boolean b(int var0) {
      return var0 <= 0;
   }

   private static boolean c(int var0) {
      return var0 != 0;
   }
}
