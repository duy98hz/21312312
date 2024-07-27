import javax.microedition.lcdui.Image;

public final class Class_gh {
   // $FF: synthetic field
   private int a;
   // $FF: synthetic field
   private int b;
   // $FF: synthetic field
   private static final int[] c;
   // $FF: synthetic field
   private int d;
   // $FF: synthetic field
   private int e;
   // $FF: synthetic field
   private Image f;
   // $FF: synthetic field
   private int[] g;

   private static boolean a(int var0, int var1) {
      return var0 < var1;
   }

   private static void a() {
      c = new int[1];
      c[0] = (57 ^ 79 ^ 145 ^ 134) & (48 ^ 34 ^ 243 ^ 128 ^ -" ".length());
   }

   public Class_gh(Image var1, int var2, int var3) {
      this.f = var1;
      this.b = var2;
      this.a = var3;
      this.d = var1.getHeight();
      this.e = this.d / var3;
      this.g = new int[this.e];
      int var4 = c[0];
      "".length();
      if ("   ".length() <= 0) {
         throw null;
      } else {
         while(!b(var4, this.e)) {
            this.g[var4] = var4 * var3;
            ++var4;
         }

      }
   }

   private static boolean a(int var0) {
      return var0 >= 0;
   }

   private static boolean b(int var0, int var1) {
      return var0 >= var1;
   }

   static {
      a();
   }

   public final void a(int var1, int var2, int var3, int var4, int var5, Class_er var6) {
      if (a(var1) && a(var1, this.e)) {
         var6.a(this.f, c[0], this.g[var1], this.b, this.a, var4, var2, var3, var5);
      }

   }
}
