public final class Class_eg {
   // $FF: synthetic field
   public int a;
   // $FF: synthetic field
   public byte b;
   // $FF: synthetic field
   public int c;
   // $FF: synthetic field
   public int d;
   // $FF: synthetic field
   public int e;
   // $FF: synthetic field
   public static Class_ae f;
   // $FF: synthetic field
   private static final int[] g;

   public final boolean a() {
      if (b(this.d, Class_dx.ae)) {
         return (boolean)g[0];
      } else if (c(this.d, Class_dx.ae + Class_dx.dy)) {
         return (boolean)g[0];
      } else if (b(this.c, Class_dx.du)) {
         return (boolean)g[0];
      } else if (c(this.c, Class_dx.du + Class_dx.bt + g[1])) {
         return (boolean)g[0];
      } else {
         return (boolean)(a(f) && d(f.l, g[2]) ? g[0] : g[3]);
      }
   }

   private static boolean a(int var0, int var1) {
      return var0 >= var1;
   }

   private static boolean b(int var0, int var1) {
      return var0 < var1;
   }

   private static boolean a(Object var0) {
      return var0 != null;
   }

   private static void b() {
      g = new int[5];
      g[0] = (31 ^ 42 ^ 212 ^ 180) & ("  ".length() ^ 125 ^ 42 ^ -" ".length());
      g[1] = 173 ^ 192 ^ 94 ^ 45;
      g[2] = 98 ^ 106;
      g[3] = " ".length();
      g[4] = 36 + 50 - -98 + 18;
   }

   static {
      b();
   }

   public Class_eg(int var1, int var2) {
      this.e = g[0];
      this.b = (byte)g[0];
      this.d = var1;
      this.c = var2;
      int var3 = g[0];
      "".length();
      if (-"  ".length() > 0) {
         throw null;
      } else {
         for(; !a(var3, Class_dx.r.size()); ++var3) {
            Class_ae var4;
            if (d((var4 = (Class_ae)Class_dx.r.elementAt(var3)).d, g[4])) {
               f = var4;
            }
         }

      }
   }

   private static boolean c(int var0, int var1) {
      return var0 > var1;
   }

   private static boolean d(int var0, int var1) {
      return var0 == var1;
   }
}
