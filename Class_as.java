import javax.microedition.lcdui.Image;

public final class Class_as extends Class_ak {
   // $FF: synthetic field
   private static final int[] e;
   // $FF: synthetic field
   private byte f;
   // $FF: synthetic field
   private Class_ge g;
   // $FF: synthetic field
   private int h;
   // $FF: synthetic field
   private static Image i;
   // $FF: synthetic field
   private static Class_gh j;
   // $FF: synthetic field
   private static Class_gh k;
   // $FF: synthetic field
   private static Image l;

   private static boolean a(int var0, int var1) {
      return var0 == var1;
   }

   private static boolean a(Object var0) {
      return var0 == null;
   }

   private static boolean a(int var0) {
      return var0 > 0;
   }

   static {
      b();
      new Class_gb();
      l = Class_bc.a("/u/tuyet.png");
      i = Class_bc.a("/u/cobay.png");
   }

   public final void a() {
      byte var9 = this.f;
      Class_ab var1;
      int var2;
      Class_ab var3;
      Class_as var5;
      if (b(var9, " ".length())) {
         if (b(var9, "  ".length())) {
            if (b(var9, "   ".length())) {
               "".length();
               if (" ".length() == 0) {
                  return;
               }
            } else {
               var5 = this;
               var2 = e[0];
               "".length();
               if ((17 ^ 55 ^ 7 ^ 36) == 0) {
                  return;
               }

               for(; !c(var2, var5.h); ++var2) {
                  var1 = var3 = (Class_ab)var5.g.elementAt(var2);
                  var1.c += (var3.b + e[10]) * e[3];
                  var3.d += var3.b + e[10] << e[10];
                  if (e(var3.c / e[1], Class_dx.du + Class_bc.an - (e[6] - var3.b) * e[15])) {
                     var5.a(var3);
                  }

                  int var4 = Class_dx.ae * (e[8] - var3.b) * e[4] / e[13];
                  if (f(var3.d / e[1] + var4, Class_dx.ae - e[1])) {
                     var3.d += (Class_bc.g + e[4]) * e[1];
                  }

                  if (e(var3.d / e[1] + var4, Class_dx.ae + Class_bc.g + e[1])) {
                     var3.d -= (Class_bc.g + e[4]) * e[1];
                  }
               }
            }
         }

      } else {
         var5 = this;
         var2 = e[0];
         "".length();
         if ((68 ^ 64) != "   ".length()) {
            for(; !c(var2, var5.h); ++var2) {
               var1 = var3 = (Class_ab)var5.g.elementAt(var2);
               var1.c += e[1];
               var3.d += var3.a * e[1];
               var3.f += e[10];
               if (c(var3.f, var3.e)) {
                  var3.f = e[0];
               }

               if (!d(var3.c / e[1], Class_dx.du + Class_bc.an - (e[6] - var3.b) * e[5]) || !c(var3.d / e[1], Class_dx.ae - Class_bc.y) || e(var3.d / e[1], Class_dx.ae + Class_bc.g + Class_bc.y)) {
                  if (e(var3.c / e[1], e[14])) {
                     int var6 = var3.d / e[1] + Class_dx.ae;
                     int var7 = var3.c / e[1] + Class_dx.du;
                     (new Class_ab(var6, var7)).e = e[12];
                     Class_bh.f(e[7]);
                     "".length();
                  }

                  var5.a(var3);
               }
            }

         }
      }
   }

   private static void b() {
      e = new int[16];
      e[0] = (87 ^ 66) & ~(38 ^ 51);
      e[1] = 13 ^ 7;
      e[2] = 169 + 92 - 216 + 146 ^ 8 + 31 - -88 + 48;
      e[3] = 46 ^ 86 ^ 234 ^ 151;
      e[4] = 68 ^ 80;
      e[5] = 233 ^ 193;
      e[6] = "   ".length();
      e[7] = 81 ^ 106 ^ 55 ^ 8;
      e[8] = "  ".length();
      e[9] = -" ".length();
      e[10] = " ".length();
      e[11] = -(34 + 109 - 21 + 78);
      e[12] = (215 ^ 183) + 31 + 44 - -48 + 4 - (25 ^ 80) + (174 ^ 156);
      e[13] = 66 ^ 58;
      e[14] = 71 ^ 95;
      e[15] = 94 ^ 64;
   }

   public final void a(Class_er var1) {
      var1.a(-var1.b(), -var1.a());
      var1.c(e[0], e[11], Class_bc.g, e[12] + Class_bc.an);
      byte var6 = this.f;
      int var2;
      Class_ab var3;
      if (b(var6, " ".length())) {
         if (b(var6, "  ".length())) {
            if (b(var6, "   ".length())) {
               "".length();
               if ((156 + 144 - 292 + 182 ^ 55 + 164 - 217 + 184) < ((48 ^ 94 ^ 22 ^ 95) & (6 ^ 43 ^ 55 ^ 61 ^ -" ".length()))) {
                  return;
               }
            } else {
               var2 = e[0];
               "".length();
               if (((249 ^ 174) & ~(55 ^ 96)) >= "  ".length()) {
                  return;
               }

               for(; !c(var2, this.h); ++var2) {
                  if (a((var3 = (Class_ab)this.g.elementAt(var2)).b)) {
                     Class_dx.ac();
                     "".length();
                     if (a((Object)Class_gb.e)) {
                        Class_gb.e = new Class_gb();
                     }

                     int var5 = Class_gb.e.b * (e[8] - var3.b) * e[4] / e[13] - Class_dx.ae;
                     j.a(var3.b, var5 + var3.d / e[1], var3.c / e[1] - Class_dx.du, e[8], e[0], var1);
                  }
               }
            }
         }

      } else {
         var1 = var1;
         Class_as var4 = this;
         var2 = e[0];
         "".length();
         if (-"   ".length() <= 0) {
            while(!c(var2, var4.h)) {
               var3 = (Class_ab)var4.g.elementAt(var2);
               k.a(var3.f / (var3.e / e[7]), var3.d / e[1] - Class_dx.ae, var3.c / e[1] - Class_dx.du, e[0], e[6], var1);
               ++var2;
            }

         }
      }
   }

   private static boolean b(int var0, int var1) {
      return var0 != var1;
   }

   private void a(Class_ab var1) {
      var1.d = (Class_dx.ae - e[4] + Class_bh.f((Class_bc.g + e[5]) / e[3]) * e[3]) * e[1];
      var1.c = (Class_dx.du - Class_bc.bn + Class_bh.f(Class_bc.an / e[3]) * e[3]) * e[1];
      if (a(this.f, e[6])) {
         var1.b = Class_bh.f(e[6]);
         "".length();
         if (-" ".length() > ((239 ^ 143 ^ 12 ^ 125) & (75 + 31 - -9 + 29 ^ 89 + 67 - 98 + 71 ^ -" ".length()))) {
            return;
         }
      } else {
         var1.b = Class_bh.f(e[7]);
      }

   }

   private static boolean c(int var0, int var1) {
      return var0 >= var1;
   }

   private static boolean d(int var0, int var1) {
      return var0 <= var1;
   }

   private static boolean e(int var0, int var1) {
      return var0 > var1;
   }

   public Class_as(byte var1, boolean var2, int var3) {
      label42: {
         super();
         this.f = (byte)e[0];
         this.h = e[0];
         this.g = new Class_ge();
         this.f = var1;
         this.h = var3;
         if (b(var1, " ".length())) {
            if (b(var1, "  ".length())) {
               if (!b(var1, "   ".length())) {
                  if (a((Object)j)) {
                     j = new Class_gh(l, e[3], e[3]);
                  }
                  break label42;
               }

               "".length();
               if ((16 ^ 21) == 0) {
                  throw null;
               }
            }
         } else {
            var3 = e[1];
            if (!a((Object)k)) {
               break label42;
            }

            k = new Class_gh(i, e[2], e[1]);
         }

         "".length();
         if (-" ".length() >= (131 ^ 135)) {
            throw null;
         }
      }

      int var4 = e[0];
      "".length();
      if ("  ".length() != "  ".length()) {
         throw null;
      } else {
         while(!c(var4, var3)) {
            Class_ab var5 = null;
            var5 = new Class_ab((Class_dx.ae - e[4] + Class_bh.f((Class_bc.g + e[5]) / e[3]) * e[3]) * e[1], (Class_dx.du - e[4] + Class_bh.f(Class_bc.an / e[3]) * e[3]) * e[1]);
            if (a(var1, e[6])) {
               var5.b = Class_bh.f(e[6]);
               "".length();
               if (" ".length() <= 0) {
                  throw null;
               }
            } else {
               var5.b = Class_bh.f(e[7]);
            }

            var5.e = e[2] + (Class_bh.f(e[6]) << e[8]);
            var5.a = Class_bh.d(e[9], e[10]);
            var5.f = Class_bh.f(var5.e);
            this.g.addElement(var5);
            ++var4;
         }

      }
   }

   private static boolean f(int var0, int var1) {
      return var0 < var1;
   }
}
