public class Class_bu extends Class_cs {
   // $FF: synthetic field
   private long o;
   // $FF: synthetic field
   public static Class_cs a;
   // $FF: synthetic field
   private static final int[] p;
   // $FF: synthetic field
   private boolean q;

   public void b() {
      long var10000;
      if (h(a(Class_bk.e().dq, 0L))) {
         var10000 = Class_bk.e().dq;
         "".length();
         if (null != null) {
            return;
         }
      } else {
         var10000 = Class_bk.e().ab;
      }

      long var1 = var10000 * 100L / Class_dx.dz[Class_bk.e().ag];
      if (h(a(Class_bk.e().dq, 0L)) && !h(a(Math.abs(var1), 15L)) || e(a(Class_bk.e().dq, 0L)) && !f(a(Math.abs(var1), 0L))) {
         if (a(Class_bk.e().em, p[2]) && j(this.q)) {
            if (i(Class_cs.a(Class_bk.e()))) {
               super.a((boolean)p[1]);
            } else if (f(Class_eo.ah, Class_fg.d) && f(Class_eo.j, Class_fg.e)) {
               if (e(Class_bk.e().gl, p[3])) {
                  Class_ao.a().ai(p[3]);
               }

               Class_eo.f(Class_fg.g, Class_fg.c);
               if (g(a(System.currentTimeMillis() - this.o, 300L))) {
                  Class_ge var3 = new Class_ge();
                  int var4 = p[1];
                  "".length();
                  if (-"  ".length() > 0) {
                     return;
                  }

                  for(; !d(var4, Class_dx.cn.size()); ++var4) {
                     Class_bk var5 = (Class_bk)Class_dx.cn.elementAt(var4);
                     if (h(var5.dc) && a(Math.abs(Class_bk.e().en - var5.en), p[4]) && a(Math.abs(Class_bk.e().ep - var5.ep), p[4]) && a(var3.size(), Class_bk.e().ca.j)) {
                        var3.addElement(var5);
                        if (h(var5.dc) && a(Math.abs(Class_bk.e().en - var5.en), p[4]) && a(Math.abs(Class_bk.e().ep - var5.ep), p[4])) {
                           Class_ao.a().a(new Class_ge(), var3, p[5]);
                           this.o = System.currentTimeMillis();
                        }
                     }
                  }
               }

               Class_bm.a(100L);
            } else {
               super.b(Class_fg.d, Class_fg.e);
            }
         } else {
            int var10001;
            if (g(Class_bk.e().em, p[6])) {
               var10001 = p[0];
               "".length();
               if (-(74 ^ 92 ^ 118 ^ 101) >= 0) {
                  return;
               }
            } else {
               var10001 = p[1];
            }

            this.q = (boolean)var10001;
            if (!j(this.q)) {
               if (i(Class_cs.a(Class_bk.e()))) {
                  super.a((boolean)p[1]);
               } else if (f(Class_eo.ah, Class_fg.d) && !e(Class_eo.j, Class_fg.f)) {
                  if (e(Class_bk.e().gl, p[3])) {
                     Class_ao.a().ai(p[3]);
                  }

                  if (!f(Class_bk.e().en, Class_fg.g) || e(Class_bk.e().ep, Class_fg.c)) {
                     Class_eo.f(Class_fg.g, Class_fg.c);
                     Class_bm.a(500L);
                  }
               } else {
                  super.b(Class_fg.d, Class_fg.f);
               }
            }
         }
      } else {
         Class_ao.a().ai(p[1]);
         Class_bm.d("Đã pk âm xong!!");
         if (a(a)) {
            Class_ex.g().d = a;
            a = null;
         } else {
            Class_ex.g().h();
         }
      }
   }

   public Class_bu() {
      super.d();
      super.i = Class_fg.d;
      super.m = Class_fg.e;
      this.q = (boolean)p[0];
   }

   private static boolean e(int var0) {
      return var0 <= 0;
   }

   private static boolean f(int var0) {
      return var0 < 0;
   }

   private static int a(long var0, long var2) {
      long var4;
      return (var4 = var0 - var2) == 0L ? 0 : (var4 < 0L ? -1 : 1);
   }

   private static boolean a(int var0, int var1) {
      return var0 <= var1;
   }

   private static boolean d(int var0, int var1) {
      return var0 >= var1;
   }

   static {
      g();
   }

   public String a() {
      return "Auto pk âm";
   }

   private static boolean g(int var0) {
      return var0 >= 0;
   }

   private static boolean e(int var0, int var1) {
      return var0 != var1;
   }

   private static boolean a(Object var0) {
      return var0 != null;
   }

   private static boolean h(int var0) {
      return var0 > 0;
   }

   private static boolean i(int var0) {
      return var0 != 0;
   }

   private static boolean f(int var0, int var1) {
      return var0 == var1;
   }

   private static boolean g(int var0, int var1) {
      return var0 > var1;
   }

   private static boolean j(int var0) {
      return var0 == 0;
   }

   private static void g() {
      p = new int[7];
      p[0] = " ".length();
      p[1] = (74 + 5 - 18 + 100 ^ 65 + 9 - -33 + 37) & (88 + 123 - 66 + 12 ^ 9 + 153 - -2 + 8 ^ -" ".length());
      p[2] = 186 ^ 176;
      p[3] = "   ".length();
      p[4] = 89 ^ 107;
      p[5] = "  ".length();
      p[6] = 34 ^ 36;
   }
}
