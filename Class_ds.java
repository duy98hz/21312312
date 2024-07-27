public class Class_ds extends Class_cs {
   // $FF: synthetic field
   private int a;
   // $FF: synthetic field
   private int o;
   // $FF: synthetic field
   private long p;
   // $FF: synthetic field
   private int q;
   // $FF: synthetic field
   private int r;
   // $FF: synthetic field
   private static final int[] s;

   public void b() {
      if (f(a(Class_bk.e()))) {
         this.a((boolean)s[0]);
      } else {
         if (e(this.r)) {
            if (d(Class_eo.ah, s[1])) {
               this.b(s[1], s[2]);
               return;
            }

            Class_fi var1 = Class_dd.c(s[3]);
            if (a(var1)) {
               Class_bm.d("Không tìm thấy npc lật hình");
               return;
            }

            if (!f(Class_bh.d(Class_bk.e().en - var1.en), s[4]) || a(Class_bh.d(Class_bk.e().ep - var1.ep), s[4])) {
               Class_eo.f(var1.en, var1.ep);
            }
         }

         if (e(Class_bl.i(s[5]))) {
            Class_bm.d("Đã hết phiếu may mắn!");
            Class_ex.g().h();
         } else if (h(this.a)) {
            Class_bm.d("Đã lật xong!");
            Class_ex.g().h();
         } else if (h(Class_bl.a())) {
            Class_bm.d("Hành trang đã hết chỗ trống");
            Class_ex.g().h();
         } else if (e(Class_dx.au)) {
            Class_dx.ac().h(s[6]);
         } else {
            if (g(a(Class_bh.a() - this.p, (long)this.o))) {
               int var10000;
               if (e(this.q, s[7])) {
                  var10000 = Class_bh.d(s[0], s[8]);
                  "".length();
                  if ((" ".length() & (" ".length() ^ -" ".length())) != 0) {
                     return;
                  }
               } else {
                  var10000 = this.q - s[9];
               }

               Class_dx.fh = var10000;
               Class_ao.a().x(Class_dx.fh);
               this.a -= s[9];
               this.p = Class_bh.a();
            }

         }
      }
   }

   private static boolean a(int var0, int var1) {
      return var0 > var1;
   }

   private static int a(long var0, long var2) {
      long var4;
      return (var4 = var0 - var2) == 0L ? 0 : (var4 < 0L ? -1 : 1);
   }

   private static boolean d(int var0, int var1) {
      return var0 != var1;
   }

   private static boolean e(int var0, int var1) {
      return var0 == var1;
   }

   public Class_ds(int var1, int var2, int var3, int var4) {
      this.a = var1;
      this.q = var2;
      this.o = var3;
      this.r = var4;
   }

   private static boolean e(int var0) {
      return var0 == 0;
   }

   private static boolean f(int var0) {
      return var0 != 0;
   }

   private static boolean g(int var0) {
      return var0 >= 0;
   }

   private static boolean a(Object var0) {
      return var0 == null;
   }

   private static boolean f(int var0, int var1) {
      return var0 <= var1;
   }

   private static boolean h(int var0) {
      return var0 <= 0;
   }

   public String a() {
      return String.valueOf((new StringBuilder("Auto lật hình: Số lượt còn lại ")).append(this.a));
   }

   static {
      g();
   }

   private static void g() {
      s = new int[10];
      s[0] = (98 ^ 75) & ~(235 ^ 194);
      s[1] = 21 ^ 93;
      s[2] = -"  ".length();
      s[3] = 45 + 62 - 34 + 97 ^ 60 + 149 - 124 + 95;
      s[4] = 105 + 48 - 65 + 42 ^ 126 + 60 - 172 + 162;
      s[5] = -(-1366 & 12287) & -5123 & 16383;
      s[6] = 36 ^ 2;
      s[7] = -" ".length();
      s[8] = 115 ^ 123;
      s[9] = " ".length();
   }
}
