public final class Class_cp extends Class_ak implements Class_do {
   // $FF: synthetic field
   private int g;
   // $FF: synthetic field
   private int h;
   // $FF: synthetic field
   private int i;
   // $FF: synthetic field
   private int j;
   // $FF: synthetic field
   private int k;
   // $FF: synthetic field
   public static Class_cp e;
   // $FF: synthetic field
   private String[] l;
   // $FF: synthetic field
   private int m;
   // $FF: synthetic field
   public Class_cw f;
   // $FF: synthetic field
   private Class_bk n;
   // $FF: synthetic field
   private static final int[] o;
   // $FF: synthetic field
   private int p;
   // $FF: synthetic field
   private String[] q;
   // $FF: synthetic field
   private boolean r;

   public final void a() {
      if (a((Object)this.n)) {
         this.m = this.n.en;
         this.h = this.n.ep;
         this.g = this.n.gi + o[5];
      }

      if (a(this.i)) {
         this.i -= o[2];
      }

      if (a(this.j, o[2])) {
         this.j -= o[2];
      }

      if (a((Object)this.n) && a((Object)this.n.by) && !a(this.n.by, this) || a((Object)this.n) && !a((Object)this.n.by) || b(this.i)) {
         Class_ak.a.removeElement(this);
         "".length();
         Class_ak.c.removeElement(this);
         "".length();
      }

   }

   private static boolean a(Object var0) {
      return var0 != null;
   }

   private static void b() {
      o = new int[17];
      o[0] = 65 + 16 - 17 + 151 ^ 0 + 2 - -92 + 85;
      o[1] = (48 + 18 - -1 + 91 ^ 83 + 122 - 57 + 13) & (48 ^ 2 ^ 72 ^ 69 ^ -" ".length());
      o[2] = " ".length();
      o[3] = -(-13065 & 15132) & -17413 & 20479;
      o[4] = -8363 & 16362;
      o[5] = 42 ^ 32;
      o[6] = 21 ^ 85;
      o[7] = (20 ^ 63) + (242 ^ 157) - (234 ^ 188) + (52 ^ 8);
      o[8] = 158 ^ 153;
      o[9] = -1 & 16777215;
      o[10] = "  ".length();
      o[11] = 175 ^ 160;
      o[12] = 87 + 134 - 110 + 28 ^ 61 + 26 - -7 + 41;
      o[13] = -23633 & 24573;
      o[14] = "   ".length();
      o[15] = 203 ^ 188 ^ 245 ^ 147;
      o[16] = 194 ^ 149 ^ 8 ^ 91;
   }

   private static boolean a(int var0, int var1) {
      return var0 > var1;
   }

   private static boolean b(int var0, int var1) {
      return var0 == var1;
   }

   public Class_cp() {
      this.p = o[0];
      this.r = (boolean)o[1];
   }

   private static boolean a(Object var0, Object var1) {
      return var0 == var1;
   }

   private static boolean a(int var0) {
      return var0 > 0;
   }

   private static boolean c(int var0, int var1) {
      return var0 >= var1;
   }

   private static boolean d(int var0, int var1) {
      return var0 < var1;
   }

   static {
      b();
   }

   public static void a(String var0, int var1, Class_bk var2) {
      String[] var3;
      if (b((var3 = Class_bh.a(var0, "\n", o[1])).length, o[2])) {
         b(var3[o[1]], o[3], var2);
         "".length();
         "".length();
         if (null != null) {
            return;
         }
      } else {
         (e = b(var3[o[1]], o[3], var2)).k = o[1];
         e.l = var3;
         e.f = new Class_cw(Class_cv.bz, e, o[4], (Object)null);
      }

   }

   public final void a(Class_er var1) {
      int var2 = this.m;
      int var3 = this.h;
      var1.a(o[9]);
      var1.a(var2 - this.p / o[10] - o[2], var3 - this.g - o[11] + this.j - this.q.length * o[12] - o[5], this.p + o[10], (this.q.length + o[2]) * o[12] + o[2], o[12], o[12]);
      var1.a(o[1]);
      var1.c(var2 - this.p / o[10] - o[2], var3 - this.g - o[11] + this.j - this.q.length * o[12] - o[5], this.p + o[2], (this.q.length + o[2]) * o[12], o[12], o[12]);
      Class_by.b(var1, o[13], var2 - o[14], var3 - this.g - o[11] + this.j + o[10], o[1], o[15]);
      int var4 = o[1];
      "".length();
      if ("   ".length() != 0) {
         while(!c(var4, this.q.length)) {
            Class_ft.g.a(var1, this.q[var4], var2, var3 - this.g - o[11] + this.j + var4 * o[12] - this.q.length * o[12] - o[16], o[10]);
            ++var4;
         }

      }
   }

   public static Class_cp b(String var0, int var1, Class_bk var2) {
      Class_cp var3 = new Class_cp();
      if (d(var0.length(), o[5])) {
         var3.p = o[6];
      }

      if (b(Class_bc.g, o[7])) {
         var3.p = o[7];
      }

      var3.q = Class_ft.p.a(var0, var3.p - o[5]);
      var3.i = var1;
      var3.n = var2;
      var3.m = var2.en;
      var3.h = var2.ep;
      var2.by = var3;
      var3.j = o[8];
      Class_ak.c.addElement(var3);
      return var3;
   }

   public final void a(int var1, Object var2) {
      if (b(var1, o[4])) {
         int var3 = e.k;
         ++var3;
         if (c(var3, e.l.length)) {
            e.n.by = null;
            e = null;
            return;
         }

         Class_cp var4;
         (var4 = b(e.l[var3], e.i, e.n)).k = var3;
         var4.l = e.l;
         var4.f = e.f;
         e = var4;
      }

   }

   private static boolean b(int var0) {
      return var0 == 0;
   }
}
