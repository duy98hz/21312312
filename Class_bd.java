final class Class_bd implements Runnable {
   // $FF: synthetic field
   private static final int[] a;
   // $FF: synthetic field
   private Class_ez b;

   public final void run() {
      do {
         label108:
         while(true) {
            while(true) {
               try {
                  if (b(this.b.d())) {
                     Class_bd var1 = this;
                     byte var2 = this.b.j.readByte();
                     if (b(this.b.e)) {
                        var2 = Class_ez.a(this.b, var2);
                     }

                     int var3;
                     byte var4;
                     byte var5;
                     if (a(var2, a[0])) {
                        var2 = this.b.j.readByte();
                        if (b(this.b.e)) {
                           var2 = Class_ez.a(this.b, var2);
                        }

                        var4 = Class_ez.a(this.b, this.b.j.readByte());
                        var5 = Class_ez.a(this.b, this.b.j.readByte());
                        byte var6 = Class_ez.a(this.b, this.b.j.readByte());
                        byte var7 = Class_ez.a(this.b, this.b.j.readByte());
                        var3 = (var4 & a[1]) << a[2] | (var5 & a[1]) << a[3] | (var6 & a[1]) << a[4] | var7 & a[1];
                        "".length();
                        if (" ".length() < 0) {
                           return;
                        }
                     } else if (b(this.b.e)) {
                        var4 = this.b.j.readByte();
                        var5 = this.b.j.readByte();
                        var3 = (Class_ez.a(this.b, var4) & a[1]) << a[4] | Class_ez.a(this.b, var5) & a[1];
                        "".length();
                        if (null != null) {
                           return;
                        }
                     } else {
                        var3 = this.b.j.readUnsignedShort();
                     }

                     byte[] var14 = new byte[var3];
                     int var15 = a[5];
                     int var8 = a[5];
                     "".length();
                     if ((31 ^ 26) == 0) {
                        return;
                     }

                     int var9;
                     while(b(var15, a[9]) && !c(var8, var3)) {
                        if (a(var15 = var1.b.j.read(var14, var8, var3 - var8))) {
                           var8 += var15;
                           Class_ez var10 = var1.b;
                           var10.k += var8 + a[6];
                           var9 = Class_ez.c().k + Class_ez.c().q;
                           var1.b.h = String.valueOf((new StringBuilder(String.valueOf(var9 / a[7]))).append(".").append(var9 % a[7] / a[8]).append("Kb"));
                        }
                     }

                     if (b(var1.b.e)) {
                        var9 = a[5];
                        "".length();
                        if (null != null) {
                           return;
                        }

                        while(!c(var9, var14.length)) {
                           var14[var9] = Class_ez.a(var1.b, var14[var9]);
                           ++var9;
                        }
                     }

                     Class_bg var16 = new Class_bg(var2, var14);

                     try {
                        if (a(var16.a, a[10])) {
                           this.a(var16);
                           break;
                        }

                        this.b.o.a(var16);
                     } catch (Exception var12) {
                        var12.printStackTrace();
                        break label108;
                     }

                     "".length();
                     if (null == null) {
                        continue;
                     }

                     return;
                  }
               } catch (Exception var13) {
               }

               if (b(this.b.b)) {
                  if (a((Object)this.b.o)) {
                     if (a(a(System.currentTimeMillis() - this.b.n, 500L))) {
                        Class_bc.bi.c();
                        "".length();
                        if (" ".length() == -" ".length()) {
                           return;
                        }
                     } else {
                        this.b.o.b();
                     }
                  }

                  if (a((Object)this.b.p)) {
                     Class_ez.b(this.b);
                  }
               }

               return;
            }

            "".length();
            if (null != null) {
               return;
            }
         }

         "".length();
      } while(-" ".length() < 0);

   }

   private static boolean a(int var0, int var1) {
      return var0 == var1;
   }

   private static boolean a(int var0) {
      return var0 > 0;
   }

   private static boolean b(int var0) {
      return var0 != 0;
   }

   private static boolean b(int var0, int var1) {
      return var0 != var1;
   }

   private static void a() {
      a = new int[12];
      a[0] = -(45 ^ 98 ^ 227 ^ 140);
      a[1] = 115 + 226 - 197 + 111;
      a[2] = 14 + 101 - -17 + 33 ^ 65 + 105 - 114 + 133;
      a[3] = 181 ^ 165;
      a[4] = 169 ^ 161;
      a[5] = (25 ^ 46) & ~(20 ^ 35);
      a[6] = 22 ^ 121 ^ 36 ^ 78;
      a[7] = -(-4881 & 31615) & -4098 & 31855;
      a[8] = 4 ^ 98;
      a[9] = -" ".length();
      a[10] = -(103 ^ 124);
      a[11] = " ".length();
   }

   private static int a(long var0, long var2) {
      long var4;
      return (var4 = var0 - var2) == 0L ? 0 : (var4 < 0L ? -1 : 1);
   }

   private static boolean a(Object var0) {
      return var0 != null;
   }

   Class_bd(Class_ez var1) {
      this.b = var1;
   }

   static {
      a();
   }

   private static boolean c(int var0, int var1) {
      return var0 >= var1;
   }

   private void a(Class_bg var1) {
      byte var2 = var1.b().readByte();
      this.b.d = new byte[var2];
      int var3 = a[5];
      "".length();
      if (-" ".length() < 0) {
         while(!c(var3, var2)) {
            this.b.d[var3] = var1.b().readByte();
            ++var3;
         }

         var3 = a[5];
         "".length();
         if (((86 ^ 64) & ~(18 ^ 4)) <= (148 ^ 144)) {
            while(!c(var3, this.b.d.length - a[11])) {
               byte[] var4 = this.b.d;
               int var10001 = var3 + a[11];
               var4[var10001] ^= this.b.d[var3];
               ++var3;
            }

            this.b.e = (boolean)a[11];
         }
      }
   }
}
