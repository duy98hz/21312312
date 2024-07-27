public class Class_ba implements Runnable {
   // $FF: synthetic field
   private int a;
   // $FF: synthetic field
   private Class_dt b;
   // $FF: synthetic field
   private boolean c;
   // $FF: synthetic field
   private static final int[] d;
   // $FF: synthetic field
   private static Class_ba e;

   private static boolean a(int var0, int var1) {
      return var0 != var1;
   }

   private static boolean a(Object var0, Object var1) {
      return var0 == var1;
   }

   private static boolean a(Object var0) {
      return var0 != null;
   }

   private static boolean a(int var0) {
      return var0 != 0;
   }

   private static void b() {
      d = new int[3];
      d[0] = " ".length();
      d[1] = -" ".length();
      d[2] = (5 ^ 16 ^ 232 ^ 158) & (34 ^ 84 ^ 138 ^ 159 ^ -" ".length());
   }

   private static boolean b(int var0) {
      return var0 > 0;
   }

   static {
      b();
   }

   public void run() {
      "".length();
      if ((182 ^ 184 ^ 137 ^ 131) > "  ".length()) {
         for(; a(this.b) && b(this.b.r) && b(Class_bl.a()) && a(Class_bc.h, Class_dx.ac()) && (!a(this.a, d[1]) || !c(this.a)); Class_bm.a((long)Class_cl.d)) {
            Class_ao.a().aj(this.b.q);
            if (b(this.a)) {
               this.a -= d[0];
            }
         }

         this.c = (boolean)d[2];
      }
   }

   private static boolean c(int var0) {
      return var0 <= 0;
   }

   public static Class_ba a() {
      if (b(e)) {
         e = new Class_ba();
      }

      return e;
   }

   public void a(Class_dt var1, int var2) {
      if (!a(this.c)) {
         this.b = var1;
         this.c = (boolean)d[0];
         this.a = var2;
         (new Thread(this)).start();
      }
   }

   private static boolean b(Object var0) {
      return var0 == null;
   }
}
