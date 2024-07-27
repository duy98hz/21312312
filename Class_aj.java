import javax.microedition.lcdui.Image;

public final class Class_aj {
   // $FF: synthetic field
   private static final int[] b;
   // $FF: synthetic field
   private int c;
   // $FF: synthetic field
   public int a;
   // $FF: synthetic field
   private int d;

   private Object a() {
      Object var10000;
      Object var1;
      if (a(var1 = Class_eo.h.a(String.valueOf(this.a)))) {
         var10000 = var1;
         "".length();
         if (null != null) {
            return null;
         }
      } else {
         var10000 = null;
      }

      return var10000;
   }

   private static boolean a(int var0) {
      return var0 == 0;
   }

   public Class_aj(int var1, int var2) {
      this.d = var1 * b[0] + b[1];
      this.c = var2 * b[0] + b[0] + b[2];
   }

   private static boolean a(Object var0) {
      return var0 != null;
   }

   private static void b() {
      b = new int[4];
      b[0] = 113 ^ 105;
      b[1] = "  ".length() ^ 35 ^ 45;
      b[2] = "   ".length();
      b[3] = 137 + 105 - 230 + 128 ^ 121 + 1 - 42 + 93;
   }

   static {
      b();
   }

   public final void a(Class_er var1) {
      if (a(Class_bc.f) && a(this.a())) {
         var1.a((Image)this.a(), this.d, this.c, b[3]);
      }

   }
}
