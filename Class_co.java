public class Class_co extends Class_cs {
   // $FF: synthetic field
   private static final int[] a;

   private static void g() {
      a = new int[2];
      a[0] = " ".length();
      a[1] = -" ".length();
   }

   private static boolean a(int var0, int var1) {
      return var0 != var1;
   }

   public String a() {
      return "Tự đánh";
   }

   public Class_co() {
      super.d();
      super.i = Class_eo.ah;
      super.m = Class_eo.j;
   }

   private static boolean d(int var0, int var1) {
      return var0 == var1;
   }

   public void b() {
      if (f(a(Class_bk.e()))) {
         super.a((boolean)a[0]);
      } else if (d(Class_eo.ah, this.i) && !a(Class_eo.j, this.m)) {
         super.a(a[1]);
         super.c(a[1]);
      } else {
         this.b(this.i, this.m);
      }
   }

   static {
      g();
   }

   private static boolean e(int var0) {
      return var0 > 0;
   }

   private static boolean f(int var0) {
      return var0 != 0;
   }

   protected Class_ae a(int var1, boolean var2) {
      if (f(Class_cl.an) && e(Class_cl.i[Class_eo.ah].size())) {
         super.b(var1, var2);
      }

      return super.a(var1, Class_bk.e().en, Class_bk.e().ep);
   }
}
