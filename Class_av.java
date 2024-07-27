public class Class_av {
   // $FF: synthetic field
   private static final int[] a;

   public static Class_ae a(int var0) {
      int var1 = a[0];
      "".length();
      if ("   ".length() <= " ".length()) {
         return null;
      } else {
         while(!b(var1, Class_dx.r.size())) {
            Class_ae var2 = (Class_ae)Class_dx.r.elementAt(var1);
            if (c(var2.r) && a(var2.q, var0)) {
               return var2;
            }

            ++var1;
         }

         return null;
      }
   }

   private static boolean a(int var0, int var1) {
      return var0 == var1;
   }

   public static Class_ae b(int var0) {
      int var1 = a[0];
      "".length();
      if (-"  ".length() > 0) {
         return null;
      } else {
         while(!b(var1, Class_dx.r.size())) {
            Class_ae var2 = (Class_ae)Class_dx.r.elementAt(var1);
            if (c(var2.r) && a(var2.d, var0)) {
               return var2;
            }

            ++var1;
         }

         return null;
      }
   }

   private static boolean c(int var0) {
      return var0 == 0;
   }

   private static void a() {
      a = new int[1];
      a[0] = (20 ^ 13 ^ 104 ^ 48) & (153 + 57 - 110 + 115 ^ 3 + 112 - -31 + 4 ^ -" ".length());
   }

   private static boolean b(int var0, int var1) {
      return var0 >= var1;
   }

   static {
      a();
   }
}
