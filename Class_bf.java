import javax.microedition.lcdui.Image;

public final class Class_bf extends Class_cf {
   // $FF: synthetic field
   private int e;
   // $FF: synthetic field
   public Class_at a;
   // $FF: synthetic field
   private String[] f;
   // $FF: synthetic field
   private static final int[] g;

   static {
      b();
   }

   public final void a(Class_er var1) {
      Class_bc.aa.a(var1, this.e, Class_bc.an - g[11] - Class_ew.fv, Class_bc.g - (this.e << g[5]), g[12], this.f, (Image)null);
      this.a.b(var1);
      super.a(var1);
   }

   public final void a() {
      this.a.d();
      super.a();
   }

   private static boolean a(int var0, int var1) {
      return var0 <= var1;
   }

   private static boolean a(Object var0) {
      return var0 != null;
   }

   public final void a(int var1) {
      this.a.c(var1);
      "".length();
      super.a(var1);
   }

   public Class_bf() {
      this.e = g[0];
      if (a(Class_bc.g, g[1])) {
         this.e = g[2];
      }

      this.a = new Class_at();
      this.a.g = this.e + g[2];
      this.a.f = Class_bc.an - Class_ew.fz - g[3];
      this.a.i = Class_bc.g - g[4] * (this.e + g[2]);
      this.a.l = Class_ew.fz + g[4];
      this.a.a = (boolean)g[5];
      super.d = this.a.d;
   }

   public final void a(String var1, Class_cw var2, int var3) {
      try {
         this.a.a("");
         this.a.b(var3);
         this.f = Class_ft.k.a(var1, Class_bc.g - (this.e << g[5]));
         super.b = new Class_cw(Class_cv.kd, Class_bc.q(), g[6], (Object)null);
         super.c = var2;
         if (a((Object)super.b)) {
            super.b.b = Class_bc.g / g[4] - g[7];
            super.b.g = Class_bc.an - g[8];
         }

         if (a((Object)super.c)) {
            super.c.b = Class_bc.g / g[4] - g[9];
            super.c.g = Class_bc.an - g[8];
         }

         if (a((Object)super.d)) {
            super.d.b = Class_bc.g / g[4] + g[10];
            super.d.g = Class_bc.an - g[8];
         }

         Class_bc.ap = this;
      } catch (Exception var5) {
         var5.printStackTrace();
         return;
      }

      "".length();
      if ("   ".length() != 0) {
         ;
      }
   }

   private static void b() {
      g = new int[13];
      g[0] = 48 ^ 55 ^ 102 ^ 73;
      g[1] = 155 + 19 - 110 + 112;
      g[2] = 250 ^ 167 ^ 53 ^ 98;
      g[3] = 126 ^ 85;
      g[4] = "  ".length();
      g[5] = " ".length();
      g[6] = -(-2069 & 22805) & -3138 & 32755;
      g[7] = 65 + 84 - 76 + 87;
      g[8] = 7 ^ 122 ^ 19 ^ 116;
      g[9] = 79 ^ 108;
      g[10] = 43 ^ 115;
      g[11] = 76 + 37 - 31 + 56 ^ 123 + 162 - 186 + 100;
      g[12] = 200 + 78 - 205 + 129 ^ 44 + 58 - 61 + 102;
   }

   public void a(String var1, String var2, Class_cw var3, int var4) {
      this.a(var1, var3, var4);
      this.a.a(var2);
   }
}
