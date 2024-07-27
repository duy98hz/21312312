public final class Class_ee extends Class_ak {
   // $FF: synthetic field
   private Class_ge[] e;
   // $FF: synthetic field
   private int[] f;
   // $FF: synthetic field
   private Class_ge g;
   // $FF: synthetic field
   private int h;
   // $FF: synthetic field
   private int i;
   // $FF: synthetic field
   private boolean j;
   // $FF: synthetic field
   private boolean k;
   // $FF: synthetic field
   private static final int[] l;
   // $FF: synthetic field
   private int m;
   // $FF: synthetic field
   private Class_fa n;
   // $FF: synthetic field
   private long o;
   // $FF: synthetic field
   private int p;

   private static boolean a(int var0) {
      return var0 != 0;
   }

   private static void b() {
      l = new int[16];
      l[0] = "  ".length();
      l[1] = (222 ^ 185 ^ 143 ^ 175) & (157 ^ 142 ^ 210 ^ 134 ^ -" ".length());
      l[2] = -(-8395 & 9163) & -3 & 16580607;
      l[3] = " ".length();
      l[4] = -2 & 11188221;
      l[5] = 2 ^ 5;
      l[6] = 103 ^ 3;
      l[7] = 179 ^ 129;
      l[8] = -" ".length();
      l[9] = 63 ^ 48;
      l[10] = 153 ^ 147;
      l[11] = 85 ^ 117 ^ 102 ^ 67;
      l[12] = 70 + 57 - 23 + 64 ^ 28 + 68 - -34 + 58;
      l[13] = (29 ^ 51) + (206 ^ 180) - (7 ^ 68) + (119 ^ 56);
      l[14] = "   ".length();
      l[15] = 21 + 97 - 82 + 148 ^ 26 + 116 - 133 + 171;
   }

   public Class_ee() {
      int[] var10001 = new int[l[0]];
      var10001[l[1]] = l[2];
      var10001[l[3]] = l[4];
      this.f = var10001;
      this.g = new Class_ge();
      this.o = 0L;
      this.j = (boolean)l[1];
      this.k = (boolean)l[3];
      this.i = l[1];
      this.h = l[1];
      this.p = l[1];
      this.m = l[5];
   }

   private static boolean a(int var0, int var1) {
      return var0 > var1;
   }

   public final void a(Class_er var1) {
      this.p = l[1];
      this.h += l[3];
      if (c(this.h, l[15])) {
         this.h = l[1];
      }

      if (a((Object)this.e)) {
         int var2 = l[1];
         "".length();
         if (" ".length() == 0) {
            return;
         }

         for(; !c(var2, this.e.length); ++var2) {
            int var3 = l[1];
            "".length();
            if ((130 ^ 134) == -" ".length()) {
               return;
            }

            for(; !c(var3, this.e[var2].size()); ++var3) {
               Class_fa var4;
               if (b((var4 = (Class_fa)this.e[var2].elementAt(var3)).d) && d(var4.d, this.e[var2].size())) {
                  Class_fa var5 = (Class_fa)this.e[var2].elementAt(var4.d);
                  if (a(Class_bc.e(var4.e, var4.c)) && a(Class_bc.e(var5.e, var5.c))) {
                     var1.a(this.f[l[1]]);
                     var1.a(var4.e, var4.c, var5.e, var5.c);
                     if (e(var4.a, l[8])) {
                        var1.a(this.f[l[3]]);
                        var1.a(var4.e - l[3], var4.c, var5.e - l[3], var5.c);
                        if (a(this.j) && a(this.k)) {
                           var1.a(var4.e + l[3], var4.c, var5.e + l[3], var5.c);
                        }
                     }
                  }

                  if (a(this.j) && a(this.k)) {
                     this.p += l[3];
                     if (c(this.p, this.m)) {
                        this.m += l[5];
                        return;
                     }
                  }
               }
            }

            Class_fa var6;
            Class_fa var10000 = var6 = (Class_fa)this.g.elementAt(var2);
            var10000.b = (byte)(var10000.b + l[3]);
            if (c(var6.b, l[15])) {
               var6.b = (byte)l[1];
            }
         }
      }

   }

   private static boolean b(int var0, int var1) {
      return var0 != var1;
   }

   static {
      b();
   }

   private static int a(long var0, long var2) {
      long var4;
      return (var4 = var0 - var2) == 0L ? 0 : (var4 < 0L ? -1 : 1);
   }

   private static boolean a(Object var0) {
      return var0 != null;
   }

   public static void a(Class_ge var0, Class_fa var1, boolean var2, int var3) {
      Class_ee var4;
      (var4 = new Class_ee()).f[l[3]] = var3;
      var3 = l[1];
      "".length();
      if (" ".length() == " ".length()) {
         for(; !c(var3, var0.size()); ++var3) {
            Class_fa var5;
            if (a((Object)(var5 = (Class_fa)var0.elementAt(var3))) && (!d(Class_bh.d(var5.e - var1.e), l[6]) || c(Class_bh.d(var5.c - var1.c), l[7]))) {
               var0.removeElementAt(var3);
            }
         }

         var4.a(var0, var1, (boolean)l[3]);
         Class_ak.c.addElement(var4);
      }
   }

   private static boolean b(int var0) {
      return var0 >= 0;
   }

   private static boolean c(int var0) {
      return var0 > 0;
   }

   private static boolean c(int var0, int var1) {
      return var0 >= var1;
   }

   private static boolean b(Object var0) {
      return var0 == null;
   }

   private void a(Class_ge var1, Class_fa var2, boolean var3) {
      if (a(var1.size())) {
         this.j = (boolean)var3;
         Class_ge var4;
         int var5;
         int var6;
         Class_fa var7;
         int var8;
         if (d(var3)) {
            var4 = var1;
            var5 = var1.size();
            var6 = l[1];
            "".length();
            if ((121 ^ 51 ^ 112 ^ 62) < "  ".length()) {
               return;
            }

            while(!c(var6, var5 - l[3])) {
               var7 = (Class_fa)var4.elementAt(var6);
               var8 = var6 + l[3];
               "".length();
               if (((83 + 121 - 29 + 28 ^ 126 + 111 - 167 + 86) & (13 ^ 44 ^ 222 ^ 168 ^ -" ".length())) > "  ".length()) {
                  return;
               }

               for(; !c(var8, var5); ++var8) {
                  Class_fa var9 = (Class_fa)var4.elementAt(var8);
                  if (a(var7.e, var9.e)) {
                     var4.setElementAt(var7, var8);
                     var4.setElementAt(var9, var6);
                     var7 = var9;
                  }
               }

               ++var6;
            }
         }

         this.g = var1;
         this.n = var2;
         this.e = new Class_ge[var1.size()];
         int var22 = l[1];
         "".length();
         if (null != null) {
            return;
         }

         while(!c(var22, this.e.length)) {
            this.e[var22] = new Class_ge();
            ++var22;
         }

         var2.d = (byte)l[8];
         this.e[l[1]].addElement(var2);
         var22 = l[8];
         int var10 = l[1];
         "".length();
         if (null != null) {
            return;
         }

         int var11;
         int var12;
         int var13;
         int var14;
         Class_fa var15;
         int var16;
         label140:
         while(!c(var10, var1.size())) {
            var11 = var2.e;
            int var17 = var2.c;
            if (a(var3) && b(var22, l[8])) {
               var11 = (var15 = (Class_fa)var1.elementAt(var22)).e;
               var17 = var15.c;
            }

            int var18;
            if (!d(var3)) {
               ++var22;
            } else {
               var4 = var1;
               var5 = l[1];
               var6 = l[1];
               "".length();
               if (-"  ".length() >= 0) {
                  return;
               }

               for(; !c(var6, var4.size()); ++var6) {
                  if (e(((Class_fa)var4.elementAt(var6)).a, l[8])) {
                     ++var5;
                  }
               }

               int var19;
               if (a(var5)) {
                  var5 = Class_bh.f(var5);
                  var6 = l[1];
                  var18 = l[1];

                  while(true) {
                     if (c(var18, var4.size())) {
                        var19 = l[8];
                        "".length();
                        if (("   ".length() & ("   ".length() ^ -" ".length())) == -" ".length()) {
                           return;
                        }
                        break;
                     }

                     Class_fa var20;
                     if (e((var20 = (Class_fa)var4.elementAt(var18)).a, l[8])) {
                        if (e(var5, var6)) {
                           var20.a = (short)l[1];
                           var19 = var18;
                           "".length();
                           if ("   ".length() >= (58 + 135 - 184 + 128 ^ 51 + 3 - 23 + 110)) {
                              return;
                           }
                           break;
                        }

                        ++var6;
                     }

                     ++var18;
                     "".length();
                     if ((195 ^ 198) == 0) {
                        return;
                     }
                  }
               } else {
                  var19 = l[8];
               }

               var22 = var19;
               "".length();
               if (-(154 ^ 182 ^ 129 ^ 169) > 0) {
                  return;
               }
            }

            var5 = this.e[var22].size() - l[3];
            Class_fa var24;
            var18 = Class_bh.a((var24 = (Class_fa)var1.elementAt(var22)).e - var11, -(var24.c - var17));
            var8 = Class_bh.f(l[9]) + l[10];
            var12 = l[1];
            int var25 = l[1];

            do {
               var16 = l[1];
               if (a(var12)) {
                  var16 = var18 - l[11] + Class_bh.f(l[10]);
               }

               var16 = Class_bh.e(var16);
               var13 = var8 * var12 * Class_bh.c(var16) >> l[10];
               var14 = -(var8 * var12 * Class_bh.a(var16)) >> l[10];
               Class_fa var21 = new Class_fa(var11 + var13, var17 + var14, var5++);
               this.e[var22].addElement(var21);
               if (c(Class_bh.a(var11, var17, var11 + var13, var17 + var14), Class_bh.a(var11, var17, var24.e, var24.c) - l[12])) {
                  ++var10;
                  "".length();
                  if (null != null) {
                     return;
                  }
                  continue label140;
               }

               ++var12;
               "".length();
            } while(-"   ".length() <= 0);

            return;
         }

         var10 = l[1];
         "".length();
         if (null != null) {
            return;
         }

         while(!c(var10, this.e.length)) {
            var11 = this.e[var10].size();
            Class_fa var23;
            (var23 = (Class_fa)var1.elementAt(var10)).d = (byte)(this.e[var10].size() - l[3]);
            var23.a = (short)l[8];
            (var15 = new Class_fa(var23.e, var23.c, var23.d)).a = (short)l[8];
            this.e[var10].addElement(var15);
            var6 = l[3];
            "".length();
            if (" ".length() < -" ".length()) {
               return;
            }

            while(!c(var6, var11)) {
               var7 = (Class_fa)this.e[var10].elementAt(var6);
               var8 = Class_bh.f(l[0]);
               var12 = l[1];
               "".length();
               if (null != null) {
                  return;
               }

               while(!c(var12, var8)) {
                  var16 = l[13] + Class_bh.f(l[13]);
                  var14 = (var13 = l[11] + Class_bh.f(l[10])) * Class_bh.c(Class_bh.e(var16)) >> l[10];
                  var16 = -(var13 * Class_bh.a(Class_bh.e(var16))) >> l[10];
                  (var2 = new Class_fa(var7.e + var14, var7.c + var16, var6)).a = (short)l[1];
                  this.e[var10].addElement(var2);
                  ++var12;
               }

               ++var6;
            }

            ++var10;
         }
      }

   }

   private static boolean d(int var0) {
      return var0 == 0;
   }

   public final void a() {
      if (b(this.n)) {
         Class_ak.d.addElement(this);
         "".length();
         if (" ".length() < 0) {
            return;
         }
      } else {
         try {
            if (e(Class_bc.n % l[0], l[3])) {
               this.n.d = (byte)l[8];
               this.n.a = (short)l[8];
               int var1 = l[1];
               "".length();
               if ((122 ^ 126) < -" ".length()) {
                  return;
               }

               while(!c(var1, this.g.size())) {
                  Class_fa var2;
                  (var2 = (Class_fa)this.g.elementAt(var1)).a = (short)l[8];
                  var2.d = (byte)l[8];
                  ++var1;
               }

               if (a(this.j) && a(this.k) && a(this.g.size(), l[3]) && c(a(System.currentTimeMillis() / 10L - this.o, 30L))) {
                  this.o = System.currentTimeMillis() / 10L;
                  this.n = (Class_fa)this.g.elementAt(l[1]);
                  this.g.removeElementAt(l[1]);
               }

               this.a(this.g, this.n, this.j);
               if (a(this.i, l[14])) {
                  this.m = l[5];
                  Class_ak.c.removeElement(this);
                  "".length();
               }

               this.i += l[3];
               return;
            }
         } catch (Exception var3) {
            var3.printStackTrace();
         }
      }

   }

   private static boolean d(int var0, int var1) {
      return var0 < var1;
   }

   private static boolean e(int var0, int var1) {
      return var0 == var1;
   }
}
