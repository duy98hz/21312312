public class Class_ay extends Thread {
   // $FF: synthetic field
   private static final int[] a;
   // $FF: synthetic field
   private Class_ez b;

   public Class_ay(Class_ez var1) {
      this.b = var1;
   }

   private static void a() {
      a = new int[1];
      a[0] = (166 ^ 158) & ~(4 ^ 60);
   }

   public void run() {
      label45:
      do {
         try {
            this.b.b();
            Class_bc.b();
            this.b.a((String)Class_ed.c, (int)14444);
            Class_di.a(5000L);
            Class_ao.a().b(Class_fq.c, Class_fq.g, "2.1.1");
            Class_di.a(15000L);
            if (b(Class_bc.h, Class_dz.d())) {
               if (a(Class_dz.e)) {
                  Class_ao.a().o(Class_dz.e);
                  "".length();
                  if (null != null) {
                     return;
                  }
               } else {
                  Class_ao.a().o(Class_dz.d().j[a[0]]);
               }

               Class_di.a(10000L);
               "".length();
               if ("  ".length() == -" ".length()) {
                  return;
               }
               continue;
            }

            Thread.sleep(2000L);
         } catch (Exception var6) {
            StackTraceElement[] var2;
            int var3 = (var2 = var6.getStackTrace()).length;
            int var4 = a[0];
            "".length();
            if ((95 ^ 91) < 0) {
               return;
            }

            while(true) {
               if (a(var4, var3)) {
                  continue label45;
               }

               StackTraceElement var5 = var2[var4];
               System.out.println(var5);
               ++var4;
            }
         }

         "".length();
         if (null != null) {
            return;
         }
      } while(a(Class_bc.h, Class_dx.t) && !a(this.b.l));

   }

   private static boolean a(int var0, int var1) {
      return var0 >= var1;
   }

   private static boolean a(Object var0, Object var1) {
      return var0 != var1;
   }

   private static boolean b(Object var0, Object var1) {
      return var0 == var1;
   }

   static {
      a();
   }

   private static boolean a(int var0) {
      return var0 == 0;
   }

   private static boolean a(Object var0) {
      return var0 != null;
   }
}
