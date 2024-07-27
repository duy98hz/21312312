import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import javax.microedition.lcdui.Image;

public final class Class_dt {
   // $FF: synthetic field
   public int a;
   // $FF: synthetic field
   public int b;
   // $FF: synthetic field
   public boolean c;
   // $FF: synthetic field
   public int d;
   // $FF: synthetic field
   public Class_ge e;
   // $FF: synthetic field
   public boolean f;
   // $FF: synthetic field
   public int g;
   // $FF: synthetic field
   public long h = 0L;
   // $FF: synthetic field
   public int i;
   // $FF: synthetic field
   public int j;
   // $FF: synthetic field
   public int k;
   // $FF: synthetic field
   public int l;
   // $FF: synthetic field
   private int y;
   // $FF: synthetic field
   public Class_ck m;
   // $FF: synthetic field
   public int n;
   // $FF: synthetic field
   public Class_ca o;
   // $FF: synthetic field
   public boolean p;
   // $FF: synthetic field
   private int z;
   // $FF: synthetic field
   public int q;
   // $FF: synthetic field
   public int r;
   // $FF: synthetic field
   private static final int[] aa;
   // $FF: synthetic field
   public boolean s;
   // $FF: synthetic field
   public int t;
   // $FF: synthetic field
   public long u;
   // $FF: synthetic field
   public boolean v;
   // $FF: synthetic field
   public Image w;
   // $FF: synthetic field
   public long x;

   private static boolean a(int var0, int var1) {
      return var0 >= var1;
   }

   public final boolean a() {
      return (boolean)(i(this.m.c) && b(this.m.c, aa[12]) ? aa[1] : aa[0]);
   }

   private static boolean a(Object var0) {
      return var0 != null;
   }

   private static int a(long var0, long var2) {
      long var4;
      return (var4 = var0 - var2) == 0L ? 0 : (var4 < 0L ? -1 : 1);
   }

   public final boolean b() {
      return (boolean)(c(this.a, aa[15]) && c(this.a, aa[16]) && c(this.a, aa[17]) && c(this.a, aa[18]) && c(this.a, aa[19]) && c(this.a, aa[20]) && c(this.a, aa[21]) && c(this.a, aa[34]) && c(this.a, aa[35]) && c(this.a, aa[28]) && c(this.a, aa[22]) && c(this.a, aa[13]) && c(this.a, aa[14]) && c(this.a, aa[6]) && c(this.a, aa[31]) && c(this.a, aa[2]) && c(this.a, aa[4]) && c(this.a, aa[30]) ? aa[0] : aa[1]);
   }

   public boolean a(int var1) {
      if (a(this.e)) {
         int var2 = aa[0];
         "".length();
         if ((13 ^ 8) <= 0) {
            return (boolean)((56 ^ 12) & ~(186 ^ 142));
         }

         while(!a(var2, this.e.size())) {
            Class_ef var3 = (Class_ef)this.e.elementAt(var2);
            if (a(var3) && e(var3.b.a, var1)) {
               return (boolean)aa[1];
            }

            ++var2;
         }
      }

      return (boolean)aa[0];
   }

   private static void v() {
      aa = new int[40];
      aa[0] = (58 ^ 112) & ~(65 ^ 11);
      aa[1] = " ".length();
      aa[2] = 102 ^ 96;
      aa[3] = 65 ^ 123 ^ 158 ^ 163;
      aa[4] = 104 ^ 96;
      aa[5] = 110 ^ 103;
      aa[6] = 27 ^ 8;
      aa[7] = 161 ^ 171;
      aa[8] = 233 ^ 196 ^ 127 ^ 89;
      aa[9] = 176 ^ 164 ^ 160 ^ 184;
      aa[10] = 89 ^ 71 ^ 149 ^ 134;
      aa[11] = 106 ^ 100;
      aa[12] = 7 ^ 83 ^ 76 ^ 23;
      aa[13] = 25 ^ 8;
      aa[14] = 113 ^ 99;
      aa[15] = 74 ^ 94;
      aa[16] = 104 ^ 125;
      aa[17] = 58 ^ 44;
      aa[18] = 33 ^ 31 ^ 137 ^ 160;
      aa[19] = 162 ^ 181 ^ 89 ^ 86;
      aa[20] = 57 ^ 33 ^ " ".length();
      aa[21] = 21 ^ 43 ^ 43 ^ 15;
      aa[22] = 212 ^ 131 ^ 57 ^ 126;
      aa[23] = "   ".length();
      aa[24] = 50 + 65 - 104 + 139;
      aa[25] = 26 ^ 31;
      aa[26] = 5 ^ 80;
      aa[27] = -" ".length();
      aa[28] = 147 ^ 142;
      aa[29] = 138 + 37 - 131 + 101 ^ 69 + 56 - 63 + 114;
      aa[30] = 191 ^ 157;
      aa[31] = "  ".length();
      aa[32] = 48 ^ 52;
      aa[33] = 123 ^ 32 ^ 209 ^ 173;
      aa[34] = 161 ^ 150 ^ 239 ^ 195;
      aa[35] = 54 ^ 25 ^ 73 ^ 122;
      aa[36] = 243 ^ 197 ^ 61 ^ 43;
      aa[37] = 55 ^ 63 ^ 160 ^ 128;
      aa[38] = 50 ^ 12 ^ 142 ^ 130;
      aa[39] = 121 ^ 69;
   }

   public int c() {
      if (a(this.e)) {
         int var1 = aa[0];
         "".length();
         if (null != null) {
            return (63 ^ 120) & ~(19 ^ 84);
         }

         while(!a(var1, this.e.size())) {
            Class_ef var2 = (Class_ef)this.e.elementAt(var1);
            if (a(var2) && e(var2.b.a, aa[26])) {
               return var2.c;
            }

            ++var1;
         }
      }

      return aa[27];
   }

   private static boolean b(int var0, int var1) {
      return var0 <= var1;
   }

   public final String d() {
      if (f(b(this.u, 0L))) {
         return Class_cv.ml;
      } else if (i(b(this.u / 1000L, 2592000L))) {
         return String.valueOf((new StringBuilder(String.valueOf(this.u / 1000L / 2592000L))).append(" ").append(Class_cv.it));
      } else if (i(b(this.u / 1000L, 604800L))) {
         return String.valueOf((new StringBuilder(String.valueOf(this.u / 1000L / 604800L))).append(" ").append(Class_cv.dl));
      } else if (i(b(this.u / 1000L, 86400L))) {
         return String.valueOf((new StringBuilder(String.valueOf(this.u / 1000L / 86400L))).append(" ").append(Class_cv.mc));
      } else if (i(b(this.u / 1000L, 3600L))) {
         return String.valueOf((new StringBuilder(String.valueOf(this.u / 1000L / 3600L))).append(" ").append(Class_cv.kc));
      } else {
         String var10000;
         if (i(b(this.u / 1000L, 60L))) {
            var10000 = String.valueOf((new StringBuilder(String.valueOf(this.u / 1000L / 60L))).append(" ").append(Class_cv.ih));
            "".length();
            if (((81 ^ 69) & ~(159 ^ 139)) > (10 ^ 14)) {
               return null;
            }
         } else {
            var10000 = "";
         }

         return var10000;
      }
   }

   public final boolean e() {
      return (boolean)(b(aa[28], this.m.c) && b(this.m.c, aa[29]) ? aa[1] : aa[0]);
   }

   private static boolean f(int var0) {
      return var0 <= 0;
   }

   public final boolean f() {
      return (boolean)(c(this.a, aa[3]) && c(this.a, aa[5]) ? aa[0] : aa[1]);
   }

   public final int g() {
      if (a(this.m.e, aa[1]) && d(this.m.e, aa[15])) {
         return aa[32];
      } else if (a(this.m.e, aa[15]) && d(this.m.e, aa[37])) {
         return aa[4];
      } else if (a(this.m.e, aa[37]) && d(this.m.e, aa[38])) {
         return aa[9];
      } else {
         int var10000;
         if (a(this.m.e, aa[38]) && d(this.m.e, aa[39])) {
            var10000 = aa[11];
            "".length();
            if (" ".length() == "   ".length()) {
               return (85 ^ 101) & ~(48 ^ 0);
            }
         } else {
            var10000 = aa[22];
         }

         return var10000;
      }
   }

   public boolean b(int var1) {
      if (a(this.e)) {
         int var2 = aa[0];
         "".length();
         if (-"  ".length() >= 0) {
            return (boolean)((64 ^ 8) & ~(251 ^ 179));
         }

         while(!a(var2, this.e.size())) {
            Class_ef var3 = (Class_ef)this.e.elementAt(var2);
            if (a(var3) && e(var3.b.a, var1)) {
               return (boolean)aa[1];
            }

            ++var2;
         }
      }

      return (boolean)aa[0];
   }

   public final String h() {
      if (f(a(this.u, 0L))) {
         return Class_cv.ml;
      } else {
         Calendar var1;
         (var1 = Calendar.getInstance()).setTimeZone(TimeZone.getTimeZone("GMT+7"));
         var1.setTime(new Date(this.u));
         int var2 = var1.get(aa[8]);
         int var3 = var1.get(aa[9]);
         int var4 = var1.get(aa[25]);
         int var5 = var1.get(aa[31]) + aa[1];
         int var6 = var1.get(aa[1]);
         return String.valueOf((new StringBuilder(String.valueOf(var4))).append("/").append(var5).append("/").append(var6).append(" ").append(var2).append("h").append(var3).append("'"));
      }
   }

   private static boolean g(int var0) {
      return var0 == 0;
   }

   public final boolean i() {
      return (boolean)(e(this.m.c, aa[30]) ? aa[1] : aa[0]);
   }

   private static boolean c(int var0, int var1) {
      return var0 != var1;
   }

   public final boolean j() {
      return (boolean)(e(this.g(), this.g) ? aa[1] : aa[0]);
   }

   public final boolean k() {
      return (boolean)(e(this.m.c, aa[1]) ? aa[1] : aa[0]);
   }

   private static boolean d(int var0, int var1) {
      return var0 < var1;
   }

   public final boolean l() {
      return (boolean)(e(this.a, aa[12]) ? aa[1] : aa[0]);
   }

   public Class_dt m() {
      Class_dt var1 = new Class_dt();
      var1.m = this.m;
      if (a(this.e)) {
         var1.e = new Class_ge();
         int var2 = aa[0];
         "".length();
         if (" ".length() >= "  ".length()) {
            return null;
         }

         while(!a(var2, this.e.size())) {
            Class_ef var3 = new Class_ef();
            var3.b = ((Class_ef)this.e.elementAt(var2)).b;
            var3.c = ((Class_ef)this.e.elementAt(var2)).c;
            var1.e.addElement(var3);
            ++var2;
         }
      }

      var1.n = this.n;
      var1.y = this.y;
      var1.q = this.q;
      var1.r = this.r;
      var1.u = this.u;
      var1.c = this.c;
      var1.b = this.b;
      var1.g = this.g;
      var1.i = this.i;
      var1.t = this.t;
      var1.d = this.d;
      var1.z = this.z;
      var1.k = this.k;
      var1.a = this.a;
      var1.v = this.v;
      return var1;
   }

   private static boolean h(int var0) {
      return var0 != 0;
   }

   public final boolean n() {
      return (boolean)(e(this.a, aa[11]) ? aa[1] : aa[0]);
   }

   public final boolean o() {
      return (boolean)(h(this.m.c) && c(this.m.c, aa[31]) && c(this.m.c, aa[32]) && c(this.m.c, aa[2]) && c(this.m.c, aa[4]) ? aa[0] : aa[1]);
   }

   public final boolean p() {
      if (h(this.b())) {
         return (boolean)aa[1];
      } else {
         return (boolean)(g(this.n()) && g(this.l()) && g(this.s()) && g(this.t()) ? aa[0] : aa[1]);
      }
   }

   public final boolean q() {
      return (boolean)(c(this.a, aa[25]) && c(this.a, aa[23]) && c(this.a, aa[32]) && c(this.a, aa[33]) ? aa[0] : aa[1]);
   }

   public final Class_dt c(int var1) {
      Class_dt var2 = this.m();
      var2.c = (boolean)aa[1];
      int var3 = var1 - var2.g;
      if (g(var3)) {
         return var2;
      } else {
         var2.g = var1;
         if (a(var2.e)) {
            var1 = aa[0];
            "".length();
            if (null != null) {
               return null;
            }

            for(; !a(var1, var2.e.size()); ++var1) {
               Class_ef var4;
               if (c((var4 = (Class_ef)var2.e.elementAt(var1)).b.a, aa[2]) && c(var4.b.a, aa[3])) {
                  if (c(var4.b.a, aa[4]) && c(var4.b.a, aa[5]) && c(var4.b.a, aa[6])) {
                     if (c(var4.b.a, aa[7]) && c(var4.b.a, aa[8]) && c(var4.b.a, aa[9]) && c(var4.b.a, aa[10]) && c(var4.b.a, aa[11]) && c(var4.b.a, aa[12]) && c(var4.b.a, aa[13]) && c(var4.b.a, aa[14]) && c(var4.b.a, aa[15])) {
                        if (c(var4.b.a, aa[16]) && c(var4.b.a, aa[17]) && c(var4.b.a, aa[18]) && c(var4.b.a, aa[19]) && c(var4.b.a, aa[20]) && c(var4.b.a, aa[21])) {
                           if (e(var4.b.a, aa[22])) {
                              var4.c += var3 * aa[23];
                              "".length();
                              if (((56 ^ 64 ^ 83 ^ 101) & (86 + 133 - 180 + 193 ^ 131 + 73 - 151 + 113 ^ -" ".length())) > 0) {
                                 return null;
                              }
                           }
                        } else {
                           var4.c += var3 * aa[24];
                           "".length();
                           if (null != null) {
                              return null;
                           }
                        }
                     } else {
                        var4.c += var3 * aa[25];
                        "".length();
                        if (((82 ^ 49) & ~(43 ^ 72)) < 0) {
                           return null;
                        }
                     }
                  } else {
                     var4.c += var3 * aa[7];
                     "".length();
                     if (((23 ^ 92) & ~(86 ^ 29)) >= "  ".length()) {
                        return null;
                     }
                  }
               } else {
                  var4.c += var3 * aa[12];
               }
            }
         }

         return var2;
      }
   }

   private static boolean i(int var0) {
      return var0 >= 0;
   }

   public final void r() {
      if (g(this.e())) {
         this.u = 0L;
      }

   }

   private static boolean e(int var0, int var1) {
      return var0 == var1;
   }

   public final boolean s() {
      return (boolean)(e(this.a, aa[36]) ? aa[1] : aa[0]);
   }

   public Class_dt() {
      this.s = (boolean)aa[0];
      this.j = aa[0];
      this.f = (boolean)aa[0];
      this.p = (boolean)aa[0];
   }

   public final boolean t() {
      return (boolean)(e(this.a, aa[30]) ? aa[1] : aa[0]);
   }

   private static int b(long var0, long var2) {
      long var4;
      return (var4 = var0 - var2) == 0L ? 0 : (var4 < 0L ? -1 : 1);
   }

   public boolean d(int var1) {
      if (a(this.e)) {
         int var2 = aa[0];
         "".length();
         if ((138 ^ 142) <= "   ".length()) {
            return (boolean)((41 ^ 61) & ~(210 ^ 198));
         }

         while(!a(var2, this.e.size())) {
            Class_ef var3 = (Class_ef)this.e.elementAt(var2);
            if (a(var3) && e(var3.b.b, var1)) {
               return (boolean)aa[1];
            }

            ++var2;
         }
      }

      return (boolean)aa[0];
   }

   public int e(int var1) {
      int var2 = aa[0];
      if (a(this.e)) {
         int var3 = aa[0];
         "".length();
         if (-(27 ^ 62 ^ 1 ^ 33) >= 0) {
            return (47 ^ 5 ^ 55 ^ 38) & (203 ^ 139 ^ 68 ^ 63 ^ -" ".length());
         }

         for(; !a(var3, this.e.size()); ++var3) {
            Class_ef var4 = (Class_ef)this.e.elementAt(var3);
            if (a(var4) && e(var4.b.b, var1)) {
               ++var2;
            }
         }
      }

      return var2;
   }

   static {
      v();
   }

   public final boolean u() {
      return (boolean)(c(this.m.c, aa[23]) && c(this.m.c, aa[25]) && c(this.m.c, aa[3]) && c(this.m.c, aa[5]) ? aa[0] : aa[1]);
   }
}
