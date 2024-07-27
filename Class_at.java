import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.TextBox;
import javax.microedition.midlet.MIDlet;

public final class Class_at implements Class_do {
   // $FF: synthetic field
   private static String[] m;
   // $FF: synthetic field
   private int n;
   // $FF: synthetic field
   private static String[] o;
   // $FF: synthetic field
   private int p;
   // $FF: synthetic field
   private int q;
   // $FF: synthetic field
   private String r = "";
   // $FF: synthetic field
   private int s;
   // $FF: synthetic field
   public boolean a;
   // $FF: synthetic field
   private int t;
   // $FF: synthetic field
   public String b;
   // $FF: synthetic field
   public static MIDlet c;
   // $FF: synthetic field
   private int u;
   // $FF: synthetic field
   public Class_cw d;
   // $FF: synthetic field
   public static Canvas e;
   // $FF: synthetic field
   private static int v;
   // $FF: synthetic field
   public int f;
   // $FF: synthetic field
   private int w;
   // $FF: synthetic field
   private static final int[] x;
   // $FF: synthetic field
   private static final int[] y;
   // $FF: synthetic field
   public int g;
   // $FF: synthetic field
   private int z;
   // $FF: synthetic field
   private String aa = "";
   // $FF: synthetic field
   private String ab = "";
   // $FF: synthetic field
   private int ac;
   // $FF: synthetic field
   private static int ad;
   // $FF: synthetic field
   public String h = "";
   // $FF: synthetic field
   private int ae;
   // $FF: synthetic field
   public int i;
   // $FF: synthetic field
   public static boolean j;
   // $FF: synthetic field
   public String k = "";
   // $FF: synthetic field
   private static int af;
   // $FF: synthetic field
   public int l;

   private static boolean a(int var0, int var1) {
      return var0 <= var1;
   }

   private static boolean b(int var0, int var1) {
      return var0 != var1;
   }

   private static boolean d(int var0) {
      return var0 == 0;
   }

   public final void a(String var1) {
      if (b((Object)var1)) {
         this.ac = x[23];
         this.q = x[2];
         this.s = x[2];
         this.ab = var1;
         this.aa = var1;
         this.e();
         this.u = var1.length();
         this.g();
      }

   }

   private static boolean c(int var0, int var1) {
      return var0 < var1;
   }

   public Class_at() {
      this.u = x[2];
      this.p = x[2];
      this.z = x[22];
      this.ae = x[2];
      this.ac = x[23];
      this.q = x[2];
      this.s = x[2];
      this.n = x[14];
      this.t = x[2];
      this.w = x[2];
      this.b = "";
      this.ab = "";
      v = Class_ft.k.c() + x[4];
      this.d = new Class_cw(Class_cv.hn, this, x[24], (Object)null);
      if (d(Class_eb.b("qwerty"), x[4])) {
         j = (boolean)x[4];
      }

   }

   private static boolean a(Object var0) {
      return var0 == null;
   }

   public final void a(int var1, Object var2) {
      if (b(var1, -16390 & 17389)) {
         "".length();
         if (null != null) {
            return;
         }
      } else {
         this.c();
      }

   }

   private void e() {
      if (d(this.t, x[0])) {
         this.r = "";
         int var1 = x[2];
         "".length();
         if (-" ".length() > "   ".length()) {
            return;
         }

         while(!f(var1, this.ab.length())) {
            this.r = String.valueOf((new StringBuilder(String.valueOf(this.r))).append("*"));
            ++var1;
         }

         if (f(this.q) && f(this.u)) {
            this.r = String.valueOf((new StringBuilder(String.valueOf(this.r.substring(x[2], this.u - x[4])))).append(this.ab.charAt(this.u - x[4])).append(this.r.substring(this.u, this.r.length())));
         }
      }

   }

   public final void a(int var1) {
      this.z = var1;
   }

   public final void b(int var1) {
      this.t = var1;
   }

   public final String a() {
      return this.ab;
   }

   private static boolean e(int var0) {
      return var0 != 0;
   }

   private static boolean f(int var0) {
      return var0 > 0;
   }

   public final void b() {
      Display.getDisplay(c).setCurrent(e);
      e.setFullScreenMode((boolean)x[4]);
      TextBox var1 = new TextBox(this.b, "", this.z, x[2]);
      var1.addCommand(new Command(Class_cv.rk, x[9], x[2]));
      var1.addCommand(new Command("Cancel", x[7], x[2]));
      var1.setCommandListener(new Class_ax(this, var1));

      label28: {
         try {
            if (d(this.t, x[0])) {
               var1.setConstraints(x[15]);
               "".length();
               if (((60 ^ 118 ^ 121 ^ 19) & (47 ^ 69 ^ 49 ^ 123 ^ -" ".length())) > ((80 ^ 34 ^ 208 ^ 193) & (180 ^ 174 ^ 220 ^ 165 ^ -" ".length()))) {
                  return;
               }
               break label28;
            }

            if (d(this.t, x[4])) {
               var1.setConstraints(x[0]);
               "".length();
               if (((89 ^ 20) & ~(253 ^ 176)) >= " ".length()) {
                  return;
               }
               break label28;
            }

            var1.setConstraints(x[2]);
         } catch (Exception var3) {
            var3.printStackTrace();
            break label28;
         }

         "".length();
         if (((121 ^ 32) & ~(245 ^ 172)) >= "   ".length()) {
            return;
         }
      }

      var1.setString(this.ab);
      var1.setMaxSize(this.z);
      "".length();
      Display.getDisplay(c).setCurrent(var1);
   }

   public static boolean a(char var0) {
      return (boolean)(f(var0, x[16]) && !e(var0, x[17]) || f(var0, x[18]) && !e(var0, x[19]) || f(var0, x[20]) && !e(var0, x[21]) ? x[4] : x[2]);
   }

   private static boolean d(int var0, int var1) {
      return var0 == var1;
   }

   public final void a(Class_er var1) {
      boolean var2 = this.a;
      if (d(this.t, x[0])) {
         this.aa = this.r;
         "".length();
         if (" ".length() < -" ".length()) {
            return;
         }
      } else {
         this.aa = this.ab;
      }

      if (e(this.aa.equals(""))) {
         this.aa = this.h;
      }

      Class_ai.a(var1, var2, this.g, this.f, this.i, x[9] + this.ae + this.g, this.f + (this.l - Class_ft.k.c()) / x[0], this.aa);
      var1.a(x[2]);
      if (e(this.a) && d(this.q) && (!h(this.n) || d(this.p / x[11] % x[0]))) {
         var1.a(x[38]);
         var1.b(x[11] + this.ae + this.g + Class_ft.k.a(this.aa.substring(x[2], this.u)) - x[4], this.f + (this.l - v) / x[0] + x[4], x[4], v);
      }

   }

   public final void b(Class_er var1) {
      var1.c(x[2], x[2], Class_bc.g, Class_bc.an);
      boolean var2 = this.a;
      if (d(this.t, x[0])) {
         this.aa = this.r;
         "".length();
         if (" ".length() < " ".length()) {
            return;
         }
      } else {
         this.aa = this.ab;
      }

      if (e(this.aa.equals(""))) {
         this.aa = this.h;
      }

      Class_ai.a(var1, var2, this.g, this.f, this.i, this.l, x[9] + this.ae + this.g, this.f + (this.l - Class_ft.k.c()) / x[0], this.aa);
      var1.c(this.g + x[7], this.f + x[4], this.i - x[9], this.l - x[9]);
      var1.a(x[2]);
      if (e(this.a) && d(this.q) && (!h(this.n) || d(this.p / x[11] % x[0]))) {
         var1.a(x[38]);
         var1.b(x[11] + this.ae + this.g + Class_ft.k.a(this.aa.substring(x[2], this.u)) - x[4], this.f + (this.l - v) / x[0] + x[4], x[4], v);
      }

   }

   private void g(int var1) {
      if ((b(this.t, x[0]) && !d(this.t, x[7]) || f(var1, x[16]) && !e(var1, x[17]) || f(var1, x[18]) && !e(var1, x[19]) || f(var1, x[20]) && a(var1, x[21])) && c(this.ab.length(), this.z)) {
         String var2 = String.valueOf((new StringBuilder(String.valueOf(this.ab.substring(x[2], this.u)))).append((char)var1));
         if (c(this.u, this.ab.length())) {
            var2 = String.valueOf((new StringBuilder(String.valueOf(var2))).append(this.ab.substring(this.u, this.ab.length())));
         }

         this.ab = var2;
         this.u += x[4];
         this.e();
         this.g();
      }

   }

   private static boolean h(int var0) {
      return var0 <= 0;
   }

   public final boolean c(int var1) {
      if (b(var1, x[13]) && b(var1, x[27]) && b(var1, x[28])) {
         if (f(var1, x[18]) && a(var1, x[21]) && d(j)) {
            j = (boolean)x[4];
            Class_eb.a("qwerty", x[4]);
         }

         if (e(j)) {
            if (d(var1, x[29])) {
               if (d(var1, this.ac) && c(this.q, y[ad])) {
                  this.ab = String.valueOf((new StringBuilder(String.valueOf(this.ab.substring(x[2], this.u - x[4])))).append((char)x[30]));
                  this.aa = this.ab;
                  this.e();
                  this.g();
                  this.ac = x[23];
                  return (boolean)x[2];
               }

               this.ac = x[29];
            }

            if (f(var1, x[31])) {
               this.g(var1);
               return (boolean)x[2];
            }
         }

         if (d(var1, af)) {
            this.w += x[4];
            if (e(this.w, x[7])) {
               this.w = x[2];
            }

            this.q = x[4];
            this.ac = var1;
            return (boolean)x[2];
         } else {
            if (d(var1, x[32])) {
               var1 = x[33];
            }

            if (d(var1, x[34])) {
               var1 = x[35];
            }

            if (f(var1, x[16]) && a(var1, x[35])) {
               if (e(this.t) && b(this.t, x[0]) && b(this.t, x[7])) {
                  if (d(this.t, x[4])) {
                     this.g(var1);
                     this.q = x[4];
                     "".length();
                     if (((87 ^ 71 ^ 128 ^ 175) & (65 ^ 61 ^ 7 ^ 68 ^ -" ".length())) != 0) {
                        return (boolean)((118 ^ 126 ^ 2 ^ 45) & (61 + 102 - 91 + 67 ^ 116 + 58 - 71 + 69 ^ -" ".length()));
                     }
                  }
               } else {
                  String[] var2;
                  if (b(this.t, x[0]) && b(this.t, x[7])) {
                     var2 = m;
                     "".length();
                     if ((46 ^ 56 ^ 152 ^ 139) == 0) {
                        return (boolean)((255 ^ 179 ^ 153 ^ 145) & (41 ^ 9 ^ 113 ^ 21 ^ -" ".length()));
                     }
                  } else {
                     var2 = o;
                  }

                  char var4;
                  String var5;
                  if (d(var1, this.ac)) {
                     this.s = (this.s + x[4]) % var2[var1 - x[16]].length();
                     var4 = var2[var1 - x[16]].charAt(this.s);
                     if (d(this.w)) {
                        var4 = Character.toLowerCase(var4);
                        "".length();
                        if ((110 ^ 98 ^ 175 ^ 167) < 0) {
                           return (boolean)((159 + 2 - 143 + 146 ^ 66 + 2 - 33 + 126) & (27 + 10 - -2 + 91 ^ 0 + 129 - -6 + 0 ^ -" ".length()));
                        }
                     } else if (d(this.w, x[4])) {
                        var4 = Character.toUpperCase(var4);
                        "".length();
                        if (-"  ".length() >= 0) {
                           return (boolean)((220 ^ 144 ^ 136 ^ 154) & (129 ^ 156 ^ 96 ^ 35 ^ -" ".length()));
                        }
                     } else if (d(this.w, x[0])) {
                        var4 = Character.toUpperCase(var4);
                        "".length();
                        if (((70 ^ 5) & ~(132 ^ 199) & ~((184 ^ 137) & ~(102 ^ 87))) != 0) {
                           return (boolean)((87 ^ 30) & ~(66 ^ 11));
                        }
                     } else {
                        var4 = var2[var1 - x[16]].charAt(var2[var1 - x[16]].length() - x[4]);
                     }

                     var5 = String.valueOf((new StringBuilder(String.valueOf(this.ab.substring(x[2], this.u - x[4])))).append(var4));
                     if (c(this.u, this.ab.length())) {
                        var5 = String.valueOf((new StringBuilder(String.valueOf(var5))).append(this.ab.substring(this.u, this.ab.length())));
                     }

                     this.ab = var5;
                     this.q = y[ad];
                     this.e();
                     "".length();
                     if (null != null) {
                        return (boolean)((166 ^ 158) & ~(142 ^ 182));
                     }
                  } else if (c(this.ab.length(), this.z)) {
                     if (d(this.w, x[4]) && b(this.ac, x[23])) {
                        this.w = x[2];
                     }

                     this.s = x[2];
                     var4 = var2[var1 - x[16]].charAt(this.s);
                     if (d(this.w)) {
                        var4 = Character.toLowerCase(var4);
                        "".length();
                        if ("  ".length() == " ".length()) {
                           return (boolean)((67 ^ 107) & ~(163 ^ 139));
                        }
                     } else if (d(this.w, x[4])) {
                        var4 = Character.toUpperCase(var4);
                        "".length();
                        if (null != null) {
                           return (boolean)((147 ^ 196) & ~(62 ^ 105));
                        }
                     } else if (d(this.w, x[0])) {
                        var4 = Character.toUpperCase(var4);
                        "".length();
                        if ("  ".length() <= ((28 ^ 0 ^ 118 ^ 44) & (94 ^ 98 ^ 10 ^ 112 ^ -" ".length()))) {
                           return (boolean)((226 ^ 198 ^ 36 ^ 97) & (153 ^ 148 ^ 35 ^ 79 ^ -" ".length()));
                        }
                     } else {
                        var4 = var2[var1 - x[16]].charAt(var2[var1 - x[16]].length() - x[4]);
                     }

                     var5 = String.valueOf((new StringBuilder(String.valueOf(this.ab.substring(x[2], this.u)))).append(var4));
                     if (c(this.u, this.ab.length())) {
                        var5 = String.valueOf((new StringBuilder(String.valueOf(var5))).append(this.ab.substring(this.u, this.ab.length())));
                     }

                     this.ab = var5;
                     this.q = y[ad];
                     this.u += x[4];
                     this.e();
                     this.g();
                  }

                  this.ac = var1;
                  "".length();
                  if ((106 ^ 110) < "  ".length()) {
                     return (boolean)((30 ^ 126) & ~(99 ^ 3));
                  }
               }
            } else {
               this.s = x[2];
               this.ac = x[23];
               if (d(var1, x[5])) {
                  if (f(this.u)) {
                     this.u -= x[4];
                     this.g();
                     this.n = x[14];
                     return (boolean)x[2];
                  }
               } else if (d(var1, x[36])) {
                  if (c(this.u, this.ab.length())) {
                     this.u += x[4];
                     this.g();
                     this.n = x[14];
                     return (boolean)x[2];
                  }
               } else {
                  if (d(var1, x[37])) {
                     return (boolean)x[2];
                  }

                  this.ac = var1;
               }
            }

            return (boolean)x[4];
         }
      } else {
         return (boolean)x[4];
      }
   }

   static {
      f();
      ad = x[0];
      int[] var10000 = new int[x[1]];
      var10000[x[2]] = x[3];
      var10000[x[4]] = x[5];
      var10000[x[0]] = x[6];
      var10000[x[7]] = x[8];
      var10000[x[9]] = x[10];
      var10000[x[11]] = x[9];
      var10000[x[10]] = x[0];
      y = var10000;
      v = x[2];
      String[] var0 = new String[x[12]];
      var0[x[2]] = "14.225.209.59";
      var0[x[4]] = "14.225.209.59";
      var0[x[0]] = "14.225.209.59";
      var0[x[7]] = "14.225.209.59";
      var0[x[9]] = "14.225.209.59";
      var0[x[11]] = "14.225.209.59";
      var0[x[10]] = "14.225.209.59";
      var0[x[1]] = "14.225.209.59";
      var0[x[13]] = "14.225.209.59";
      var0[x[8]] = "14.225.209.59";
      var0[x[14]] = "14.225.209.59";
      var0[x[6]] = "14.225.209.59";
      m = var0;
      var0 = new String[x[12]];
      var0[x[2]] = "14.225.209.59";
      var0[x[4]] = "14.225.209.59";
      var0[x[0]] = "14.225.209.59";
      var0[x[7]] = "14.225.209.59";
      var0[x[9]] = "14.225.209.59";
      var0[x[11]] = "14.225.209.59";
      var0[x[10]] = "14.225.209.59";
      var0[x[1]] = "14.225.209.59";
      var0[x[13]] = "14.225.209.59";
      var0[x[8]] = "14.225.209.59";
      var0[x[14]] = "14.225.209.59";
      var0[x[6]] = "14.225.209.59";
      o = var0;
      af = x[6];
   }

   private static void f() {
      x = new int[39];
      x[0] = "  ".length();
      x[1] = 7 ^ 0;
      x[2] = (116 ^ 97) & ~(32 ^ 53);
      x[3] = 145 ^ 131;
      x[4] = " ".length();
      x[5] = 167 ^ 169;
      x[6] = 157 ^ 150;
      x[7] = "   ".length();
      x[8] = 173 ^ 164;
      x[9] = 116 ^ 19 ^ 209 ^ 178;
      x[10] = 128 ^ 134;
      x[11] = 47 + 63 - 61 + 92 ^ 45 + 128 - 73 + 36;
      x[12] = 165 + 70 - 107 + 46 ^ 140 + 99 - 204 + 127;
      x[13] = 174 + 139 - 149 + 17 ^ 55 + 57 - 40 + 117;
      x[14] = 136 ^ 130;
      x[15] = -(-11 & 32379) & -393 & 98296;
      x[16] = 19 ^ 105 ^ 36 ^ 110;
      x[17] = 101 ^ 16 ^ 219 ^ 151;
      x[18] = 98 ^ 35;
      x[19] = 15 ^ 85;
      x[20] = 243 ^ 146;
      x[21] = 103 ^ 29;
      x[22] = -(-8217 & 15897) & -16395 & 24574;
      x[23] = -(-(-19010 & 31351) & -18435 & 32759);
      x[24] = -10260 & 11259;
      x[25] = 86 ^ 91;
      x[26] = 114 ^ 90;
      x[27] = -(77 ^ 69);
      x[28] = 47 + 201 - 67 + 23;
      x[29] = 157 ^ 176;
      x[30] = 120 ^ 39;
      x[31] = 11 ^ 57 ^ 54 ^ 36;
      x[32] = 9 ^ 35;
      x[33] = 90 ^ 96;
      x[34] = 124 ^ 95;
      x[35] = 37 ^ 30;
      x[36] = 112 + 178 - 274 + 163 ^ 4 + 49 - -38 + 97;
      x[37] = 25 ^ 10;
      x[38] = -1105 & 11185914;
   }

   private void g() {
      if (d(this.t, x[0])) {
         this.aa = this.r;
         "".length();
         if (null != null) {
            return;
         }
      } else {
         this.aa = this.ab;
      }

      if (i(this.ae) && c(Class_ft.k.a(this.aa) + this.ae, this.i - x[9] - x[25])) {
         this.ae = this.i - x[14] - Class_ft.k.a(this.aa);
      }

      if (h(this.ae + Class_ft.k.a(this.aa.substring(x[2], this.u)))) {
         this.ae = -Class_ft.k.a(this.aa.substring(x[2], this.u));
         this.ae += x[26];
         "".length();
         if (((106 + 71 - 96 + 148 ^ 14 + 162 - 100 + 103) & (14 ^ 3 ^ 255 ^ 164 ^ -" ".length())) > 0) {
            return;
         }
      } else if (f(this.ae + Class_ft.k.a(this.aa.substring(x[2], this.u)), this.i - x[12])) {
         this.ae = this.i - x[14] - Class_ft.k.a(this.aa.substring(x[2], this.u)) - x[13];
      }

      if (f(this.ae)) {
         this.ae = x[2];
      }

   }

   private static boolean b(Object var0) {
      return var0 != null;
   }

   public void c() {
      if (f(this.u) && f(this.ab.length())) {
         this.ab = String.valueOf((new StringBuilder(String.valueOf(this.ab.substring(x[2], this.u - x[4])))).append(this.ab.substring(this.u, this.ab.length())));
         this.u -= x[4];
         this.g();
         this.e();
      }

   }

   private static boolean e(int var0, int var1) {
      return var0 > var1;
   }

   private static boolean f(int var0, int var1) {
      return var0 >= var1;
   }

   private static boolean i(int var0) {
      return var0 < 0;
   }

   public final void d() {
      this.p += x[4];
      if (f(this.q)) {
         this.q -= x[4];
         if (d(this.q)) {
            this.s = x[2];
            if (d(this.w, x[4]) && b(this.ac, af)) {
               this.w = x[2];
            }

            this.ac = x[23];
            this.e();
         }
      }

      if (f(this.n)) {
         this.n -= x[4];
      }

      if (e(Class_bc.c)) {
         if (a(Class_bc.h, Class_ah.a)) {
            if (a((Object)Class_ah.a)) {
               Class_ah.a = new Class_ah();
            }

            int var1 = Class_ah.a.b.g;
            if (d(Class_bc.a(this.g, this.f - var1, this.i, this.l))) {
               this.a = (boolean)x[2];
               return;
            }

            this.b();
            "".length();
            if ((87 ^ 83) < ((31 ^ 38) & ~(190 ^ 135))) {
               return;
            }
         } else {
            if (e(Class_bc.a(this.g, this.f, this.i, this.l))) {
               this.b();
               return;
            }

            this.a = (boolean)x[2];
         }
      }

   }

   private static boolean a(Object var0, Object var1) {
      return var0 == var1;
   }
}
