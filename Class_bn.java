public final class Class_bn {
   // $FF: synthetic field
   private int b;
   // $FF: synthetic field
   private static final int[] c;
   // $FF: synthetic field
   private int d;
   // $FF: synthetic field
   private int e;
   // $FF: synthetic field
   private int f;
   // $FF: synthetic field
   public int a;

   static {
      b();
   }

   private static void b() {
      c = new int[11];
      c[0] = (173 + 177 - 339 + 216 ^ 101 + 110 - 96 + 65) & (253 ^ 165 ^ 119 ^ 120 ^ -" ".length());
      c[1] = " ".length();
      c[2] = "  ".length();
      c[3] = "   ".length();
      c[4] = "  ".length() ^ 16 ^ 22;
      c[5] = 25 + 27 - -12 + 64 ^ 125 + 37 - 96 + 67;
      c[6] = 0 + 74 - -57 + 3 ^ 48 + 18 - -46 + 34;
      c[7] = 57 ^ 24 ^ (137 ^ 153) & ~(127 ^ 111);
      c[8] = 119 ^ 120;
      c[9] = 160 ^ 174;
      c[10] = 70 ^ 78;
   }

   private static boolean a(int var0, int var1) {
      return var0 != var1;
   }

   private static boolean b(int var0, int var1) {
      return var0 == var1;
   }

   private static boolean a(int var0) {
      return var0 == 0;
   }

   public final void a() {
      if (b(this.d, c[1])) {
         this.f += c[1];
         if (a(this.f % c[2])) {
            this.a += c[1];
            return;
         }
      } else {
         if (a(this.d)) {
            this.a += c[1];
            return;
         }

         if (!a(this.d, c[2]) || !a(this.d, c[3]) || !a(this.d, c[4]) || b(this.d, c[5])) {
            this.f += c[1];
            if (a(this.f % c[2])) {
               this.a += c[1];
            }
         }
      }

   }

   public final void a(Class_er var1) {
      if (a(this.d)) {
         var1.a(Class_dx.am, c[0], this.a * c[3], c[3], c[3], c[0], this.e, this.b, c[0]);
         "".length();
         if (null != null) {
            return;
         }
      } else if (b(this.d, c[1])) {
         var1.a(Class_dx.af, c[0], this.a * c[6], c[6], c[6], c[0], this.e, this.b, c[7]);
         "".length();
         if (-"   ".length() >= 0) {
            return;
         }
      } else if (b(this.d, c[2])) {
         var1.a(Class_dx.aq, c[0], this.a * c[8], c[9], c[8], c[0], this.e + c[6], this.b + c[4], c[6]);
         "".length();
         if ("  ".length() < 0) {
            return;
         }
      } else if (b(this.d, c[3])) {
         var1.a(Class_dx.cx, c[0], this.a << c[3], c[10], c[10], c[0], this.e + c[6], this.b + c[4], c[6]);
         "".length();
         if (null != null) {
            return;
         }
      } else if (b(this.d, c[4])) {
         var1.a(Class_dx.g, c[0], this.a << c[3], c[10], c[10], c[0], this.e + c[6], this.b + c[4], c[6]);
         "".length();
         if (((230 ^ 197 ^ 85 ^ 101) & (52 + 95 - 146 + 159 ^ 73 + 171 - 107 + 42 ^ -" ".length())) == (24 ^ 6 ^ 11 ^ 17)) {
            return;
         }
      } else if (b(this.d, c[5])) {
         var1.a(Class_dx.dm, c[0], this.a * c[9], c[9], c[9], c[0], this.e + c[6], this.b + c[4], c[6]);
      }

   }

   public Class_bn(int var1, int var2, int var3) {
      this.a = c[0];
      this.f = c[0];
      this.e = var1;
      this.b = var2;
      this.d = var3;
   }
}
