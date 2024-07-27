public class Class_cn extends Class_cs {
   // $FF: synthetic field
   private static final int[] o;
   // $FF: synthetic field
   private static int p;
   // $FF: synthetic field
   private Class_gf q;
   // $FF: synthetic field
   private static String[] r;
   // $FF: synthetic field
   public static boolean a;

   public Class_cn() {
      super.d();
      a = (boolean)o[1];
      p = o[1];
      this.q = Class_bl.j(o[1]);
   }

   public void b() {
      if (a(p, o[5])) {
         Class_bm.d("Đã làm xong nhiệm vụ hằng ngày!");
         Class_ex.g().h();
      } else if (f(Class_bk.e().dc)) {
         super.a((boolean)o[1]);
      } else if (g(Class_eo.p(Class_eo.ah))) {
         if (a((Object)this.q)) {
            Class_dd.a(o[6], o[2], o[1]);
            Class_di.m();
            this.q = Class_bl.j(o[1]);
            Class_bm.d(String.valueOf((new StringBuilder("Nhận nhiệm vụ: ")).append(p + o[2]).append("/20")));
         } else if (d(this.q.a, this.q.e)) {
            if (f(Class_bl.a())) {
               Class_bm.d("Hành trang đã hết chỗ trống!");
            } else {
               Class_dd.a(o[6], o[2], o[3]);
               this.q = null;
               Class_bm.d(String.valueOf((new StringBuilder("Hoàn thành nhiệm vụ: ")).append(p).append("/20")));
            }
         } else {
            Class_bm.d(String.valueOf((new StringBuilder("Đi làm nhiệm vụ: ")).append(p).append("/20")));
            Class_dd.a(o[6], o[2], o[0]);
            Class_di.v();
         }
      } else {
         if (b(this.q) && e(Class_eo.ah, this.q.f)) {
            if (d(this.q.a, this.q.e)) {
               Class_cl.f();
               return;
            }

            super.a(this.q.g);
            super.c(o[7]);
            if (g(a)) {
               Class_bm.d(String.valueOf((new StringBuilder("Nhiệm vụ: ")).append(p).append("/20: ").append(this.q.a).append("/").append(this.q.e).append(" ").append(Class_ae.ac[this.q.g].h)));
               a = (boolean)o[1];
               return;
            }
         }

      }
   }

   private static boolean a(int var0, int var1) {
      return var0 > var1;
   }

   private static boolean a(Object var0) {
      return var0 == null;
   }

   private static boolean d(int var0, int var1) {
      return var0 >= var1;
   }

   private static boolean e(int var0) {
      return var0 >= 0;
   }

   private static boolean f(int var0) {
      return var0 <= 0;
   }

   public String a() {
      return String.valueOf((new StringBuilder("Auto nhiệm vụ hằng ngày: ")).append(p).append("/20"));
   }

   private static boolean e(int var0, int var1) {
      return var0 == var1;
   }

   private static void g() {
      o = new int[8];
      o[0] = "   ".length();
      o[1] = (26 + 92 - 104 + 183 ^ 139 + 11 - 41 + 44) & (162 + 158 - 145 + 46 ^ 3 + 102 - 42 + 66 ^ -" ".length());
      o[2] = " ".length();
      o[3] = "  ".length();
      o[4] = 186 ^ 141 ^ 176 ^ 146;
      o[5] = 162 ^ 194 ^ 227 ^ 151;
      o[6] = 37 ^ 60;
      o[7] = -" ".length();
   }

   static {
      g();
      String[] var10000 = new String[o[0]];
      var10000[o[1]] = "Hôm nay con đã làm hết nhiệm vụ ta giao. Hãy quay lại vào ngày hôm sau.";
      var10000[o[2]] = "Đây là lần nhận nhiệm vụ thứ ";
      var10000[o[3]] = " trong ngày hôm nay. Mỗi ngày được nhận tối đa 20 lần con nhé.";
      r = var10000;
   }

   public static void a(String var0) {
      if (g(var0.equals(r[o[1]]))) {
         p = o[4];
         Class_di.r();
      } else {
         int var1 = var0.indexOf(r[o[2]]);
         if (e(var1)) {
            var0 = var0.substring(var1 + r[o[2]].length(), var0.indexOf(r[o[3]])).trim();

            try {
               p = Integer.parseInt(var0);
            } catch (Exception var3) {
               return;
            }

            "".length();
            if (((154 ^ 172) & ~(19 ^ 37)) > "   ".length()) {
               return;
            }
         }

      }
   }

   private static boolean b(Object var0) {
      return var0 != null;
   }

   private static boolean g(int var0) {
      return var0 != 0;
   }
}
