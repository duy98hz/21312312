public class Class_aq extends Class_cs {
   // $FF: synthetic field
   public int a;
   // $FF: synthetic field
   private static final int[] o;

   public void b() {
      if (e(a(Class_bk.e()))) {
         this.a((boolean)o[0]);
      } else if (e(Class_eo.i(Class_eo.ah))) {
         Class_ex.g().h();
      } else if (!e(Class_bk.cr) || a(Class_eo.ah, super.i) && !d(Class_eo.j, super.m)) {
         this.b(this.a);
      } else {
         super.b(super.i, super.m);
      }
   }

   private static void g() {
      o = new int[1];
      o[0] = " ".length();
   }

   private static boolean e(int var0) {
      return var0 != 0;
   }

   public String a() {
      StringBuilder var10000 = new StringBuilder("Auto đánh người: ");
      String var10001;
      if (f(this.a)) {
         var10001 = "Đứng yên";
         "".length();
         if ((188 ^ 184) == 0) {
            return null;
         }
      } else {
         var10001 = "Tele";
      }

      return String.valueOf(var10000.append(var10001));
   }

   private static boolean f(int var0) {
      return var0 == 0;
   }

   static {
      g();
   }

   private static boolean a(int var0, int var1) {
      return var0 == var1;
   }

   private static boolean d(int var0, int var1) {
      return var0 != var1;
   }

   public Class_aq(int var1) {
      super.d();
      this.a = var1;
      super.i = Class_eo.ah;
      super.m = Class_eo.j;
   }
}
